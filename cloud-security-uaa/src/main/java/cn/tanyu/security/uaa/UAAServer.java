package cn.tanyu.security.uaa;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author tanyu
 * @version 1.0
 * @description: TODO
 * @date 2020/11/2 2:57 下午
 */
@SpringBootApplication
@MapperScan("cn.tanyu.security.uaa.mapper")
@EnableDiscoveryClient
public class UAAServer {
    public static void main(String[] args) {
        SpringApplication.run(UAAServer.class);
    }
}
