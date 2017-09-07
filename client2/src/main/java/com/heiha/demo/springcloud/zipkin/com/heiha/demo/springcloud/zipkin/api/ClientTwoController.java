package com.heiha.demo.springcloud.zipkin.com.heiha.demo.springcloud.zipkin.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * <br>
 * <b>Project:</b> spring-cloud-zipkin-demo<br>
 * <b>Date:</b> 2017/9/5 9:46<br>
 * <b>Author:</b> heiha<br>
 */
@RestController
@RequestMapping("/v1")
public class ClientTwoController {
    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello, this is two";
    }

    @GetMapping("/client1")
    public String callOne() {
        return restTemplate.getForObject("http://localhost:8001/v1/hello", String.class);
    }
}
