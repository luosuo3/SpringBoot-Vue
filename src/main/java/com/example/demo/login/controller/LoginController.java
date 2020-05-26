package com.example.demo.login.controller;


import com.example.demo.admin.user.model.UserLogin;
import com.example.demo.admin.user.model.UserLoginExample;
import com.example.demo.admin.user.service.UserLoginService;
import com.example.demo.util.LoginValidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class LoginController {
    @Autowired
    private UserLoginService userLoginService;

    //进入登录页面
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String tologin(){
        return  "/login";
    }

    //处理登录
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(UserLogin user, Model model, HttpServletRequest request) {
        // 获取用户名和密码
        String userLoginId = user.getUserLoginId();
        String password = user.getCurrentPassword();
        // 从数据库中获取用户名和密码后进行判断
        if (userLoginId != null && password != null) {
            UserLoginExample example =new UserLoginExample();
            UserLoginExample.Criteria criteria = example.createCriteria();
            criteria.andUserLoginIdEqualTo(userLoginId);
            List<UserLogin> list = userLoginService.selectByExample(example);
            if (list.size() > 0) {
                UserLogin userLogin =list.get(0);
                //把明文密码、加密密码传进validate方法进行验证
                if (LoginValidate.validate(password, userLogin.getCurrentPassword())) {
                    // 将用户对象添加到Session
                    request.getSession().setAttribute("USER_SESSION", userLogin);
                    //判断用户类型，进入哪个入口页面
                    if ("0".equalsIgnoreCase(userLogin.getUserType()))  {
                        return "redirect:/admin/index";
                    }else if("1".equalsIgnoreCase(userLogin.getUserType())) {
                        return "redirect:/app/index";
                    }
                }
            }
        }
        model.addAttribute("msg", "用户名或密码错误，请重新登录！");
        return "/login";
    }

    //退出系统
    @RequestMapping("/logout")
    public String logout(HttpSession session){
        // 清除Session
        session.invalidate();
        // 重定向到登录页面的跳转方法
        return "redirect:login";
    }

}
