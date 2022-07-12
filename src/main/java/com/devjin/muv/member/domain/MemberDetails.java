package com.devjin.muv.member.domain;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings("serial")
@Data
public class MemberDetails implements UserDetails {

    private String mem_id;
    private String mem_pwd;
    private String mem_auth;
    private boolean mem_enabled;
    private String name;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        ArrayList<GrantedAuthority> auth = new ArrayList<GrantedAuthority>();
        auth.add(new SimpleGrantedAuthority(mem_auth));
        return auth;
    }

    @Override
    public String getPassword() {
        return mem_pwd;
    }

    @Override
    public String getUsername() {
        return mem_id;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return mem_enabled;
    }


}
