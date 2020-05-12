package com.example.demo.admin.user.controller;

import com.example.demo.admin.user.mapper.UserLoginMapper;
import com.example.demo.admin.user.model.UserLogin;
import com.example.demo.admin.user.model.UserLoginExample;
import com.example.demo.admin.user.service.UserLoginService;
import com.example.demo.util.EncryptUtil;
import com.example.demo.util.IdUtil;
import com.example.demo.util.UserLoginUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("/admin")
public class UserloginController {
    @Autowired
    UserLoginMapper userLoginMapper;

    @Autowired
    UserLoginService userLoginService;


//   查询用户
    @GetMapping("/users")
    @ResponseBody
    public List<UserLogin> List() {
        UserLoginExample userLoginExample = new UserLoginExample();
        userLoginExample.createCriteria().andCurrentStatusEqualTo("0");
        List<UserLogin> list = userLoginMapper.selectByExample(userLoginExample);
        return list;
    }
//    注册用户

    @RequestMapping(value = "/users",method = RequestMethod.POST,produces = "application/json")
    @ResponseBody
//    操作两个表以上的增删改操作必须用事务
    @Transactional
    public  UserLogin add(@RequestBody  UserLogin userLogin, HttpServletRequest request) {
//        设置主键
        userLogin.setUserId(IdUtil.nextId().toString());
        userLogin.setCurrentStatus("0");
        userLogin.setCurrentPassword(EncryptUtil.encryptSHA256(userLogin.getCurrentPassword()));
        userLogin.setCreatedTime(new Timestamp(System.currentTimeMillis()));
        userLogin.setLastUpdatedUserLoginId(UserLoginUtil.getUserLogin(request).getLastUpdatedUserLoginId());
        userLoginService.insertSelective(userLogin);
        return userLogin;

    }
//    修改用户信息
    @RequestMapping(value = "/users",method = RequestMethod.PUT,produces = "application/json")
    @ResponseBody
    public UserLogin edit(@RequestBody UserLogin userLogin,HttpServletRequest request) {
        userLogin.setCurrentStatus("0");
        userLogin.setCreatedTime(new Timestamp(System.currentTimeMillis()));
        userLogin.setLastUpdatedUserLoginId(UserLoginUtil.getUserLogin(request).getLastUpdatedUserLoginId());
        userLoginService.updateByPrimaryKeySelective(userLogin);
        return userLoginService.selectByPrimaryKey(userLogin.getUserId());
    }
//    删除用户
    @RequestMapping(value = "/users/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public  String delete(@PathVariable String id) {
        try {
            userLoginService.deleteByPrimaryKey(id);
            return "200";
        } catch (Exception e) {
            return "500";
        }

    }

}
