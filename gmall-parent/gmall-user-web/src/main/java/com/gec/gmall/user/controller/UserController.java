package com.gec.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gec.gmall.user.bean.UmsMember;
import com.gec.gmall.user.bean.UmsMemberReceiveAddress;
import com.gec.gmall.user.service.UserService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("/getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId)
    {
        return userService.getReceiveAddressByMemberId(memberId);
    }


    @RequestMapping("/getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser()
    {
        return userService.getAllUser();
    }
}
