package com.devjin.muv.member.service;

import com.devjin.muv.member.dao.UserAuthDAO;
import com.devjin.muv.member.domain.MemberDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class MemberDetailsService implements UserDetailsService {

    @Autowired
    private UserAuthDAO userAuthDAO;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        MemberDetails member = userAuthDAO.getUserById(username);
        if(member == null) {
            throw new UsernameNotFoundException(username);
        }
        return member;
    }

}
