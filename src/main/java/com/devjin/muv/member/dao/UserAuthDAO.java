package com.devjin.muv.member.dao;

import com.devjin.muv.member.domain.MemberDetails;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("userAuthDAO")
public class UserAuthDAO {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public MemberDetails getUserById(String username) {
        return sqlSessionTemplate.selectOne("user.selectUserById",username);
    }
}
