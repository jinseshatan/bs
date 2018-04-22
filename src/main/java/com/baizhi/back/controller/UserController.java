package com.baizhi.back.controller;

import com.baizhi.back.service.UserService;
import com.baizhi.common.entity.PageShow;
import com.baizhi.common.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;


    @RequestMapping("allUser")
    @ResponseBody
    public PageShow allUsers(String page,String rows){

        if(page==null&& rows ==null){

            page="1";
            rows="3";
        }

        Integer page1=new Integer(page);
        Integer rows1=new Integer (rows);

        Integer count= userService.queryCount();

        List<User> users = userService.queryAll(page1,rows1);

        PageShow pageShow=new PageShow();

        pageShow.setRows(users);
        pageShow.setTotal(count);

        return pageShow;

    }

    @RequestMapping("updateSta")
    @ResponseBody
    public String  updateSta(String id,String pj){

        userService.modifyStatus(id,pj);

        return "修改成功";

    }



}
