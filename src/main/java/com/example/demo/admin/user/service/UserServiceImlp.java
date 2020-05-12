package com.example.demo.admin.user.service;

import com.example.demo.admin.user.mapper.UserLoginMapper;
import com.example.demo.admin.user.model.UserLogin;
import com.example.demo.admin.user.model.UserLoginExample;
import com.example.demo.admin.user.service.UserLoginService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImlp implements UserLoginService {
    @Autowired
    UserLoginMapper userLoginMapper;
    @Override
    public int countByExample(UserLoginExample example) {
        return userLoginMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(UserLoginExample example) {
        return userLoginMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String userId) {
        return userLoginMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public int insert(UserLogin record) {
        return userLoginMapper.insert(record);
    }

    @Override
    public int insertSelective(UserLogin record) {
        return userLoginMapper.insertSelective(record);
    }

    @Override
    public List<UserLogin> selectByExampleWithRowbounds(UserLoginExample example, RowBounds rowBounds) {
        return  selectByExampleWithRowbounds(example, rowBounds);
    }

    @Override
    public List<UserLogin> selectByExample(UserLoginExample example) {
        return userLoginMapper.selectByExample(example);
    }

    @Override
    public UserLogin selectByPrimaryKey(String userId) {
        return selectByPrimaryKey(userId);
    }

    @Override
    public int updateByExampleSelective(UserLogin record, UserLoginExample example) {
        return userLoginMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(UserLogin record, UserLoginExample example) {
        return updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(UserLogin record) {
        return updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserLogin record) {
        return updateByPrimaryKey(record);
    }
}
