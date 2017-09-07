package com.heiha.demo.springcloud.zipkin.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * <br>
 * <b>Project:</b> spring-cloud-zipkin-demo<br>
 * <b>Date:</b> 2017/9/5 9:39<br>
 * <b>Author:</b> heiha<br>
 *
 * @see com.heiha.demo.springcloud.zipkin.config.SamplerConfig
 */
@RestController
@RequestMapping("/v1")
public class ClientOneController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hello")
    public String hello() {
        return "Hello, this is one";
    }

    @GetMapping("/client2")
    public String callTwo() {
        return restTemplate.getForObject("http://localhost:8002/v1/hello", String.class);
    }
}
