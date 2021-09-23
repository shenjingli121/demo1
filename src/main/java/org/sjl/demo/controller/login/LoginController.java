package org.sjl.demo.controller.login;

import org.sjl.base.entity.HttpEntity;
import org.sjl.demo.dto.LoginDto;
import org.sjl.demo.entity.SysUser;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("login")
public class LoginController {


    @PostMapping
    public HttpEntity<SysUser> login(@RequestBody LoginDto loginDto, HttpServletResponse response) {
        response.setHeader("authorization","are you ready");

        HttpEntity<SysUser> httpEntity = new HttpEntity<>();
        return httpEntity;
    }
}
