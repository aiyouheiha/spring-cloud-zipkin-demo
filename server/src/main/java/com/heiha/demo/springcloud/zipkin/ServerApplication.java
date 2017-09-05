package com.heiha.demo.springcloud.zipkin;

import org.apache.catalina.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 * <br>
 * <b>Project:</b> spring-cloud-zipkin-demo<br>
 * <b>Date:</b> 2017/9/4 17:48<br>
 * <b>Author:</b> heiha<br>
 */
@SpringBootApplication
@EnableZipkinServer
public class ServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }
}
