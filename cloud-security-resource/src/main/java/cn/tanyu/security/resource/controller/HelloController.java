package cn.tanyu.security.resource.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tanyu
 * @version 1.0
 * @description: TODO
 * @date 2020/11/4 4:23 下午
 */
@RestController
public class HelloController {

    @GetMapping("/hello1")
    @PreAuthorize("hasAnyAuthority('ROLE_ADMIN')")
    public String resource1() {
        return "资源1";
    }

    @GetMapping("/hello2")
    @PreAuthorize("hasAnyAuthority('ROLE_USER')")
    public String resource2() {
        return "资源2";
    }
}
