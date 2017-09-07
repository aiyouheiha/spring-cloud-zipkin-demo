package com.heiha.demo.springcloud.zipkin.config;

import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * <br>
 * <b>Project:</b> spring-cloud-zipkin-demo<br>
 * <b>Date:</b> 2017/9/5 10:39<br>
 * <b>Author:</b> heiha<br>
 */
@Configuration
public class SamplerConfig {
    /**
     * 设定对该应用一直进行采样，否则默认采样率并非100%
     * @return
     */
    @Bean
    public AlwaysSampler alwaysSampler() {
        return new AlwaysSampler();
    }

    /**
     * 必须配置 RestTemplate 的 Bean，并通过对应实例进行远程调用
     * 这样zipkin才可以将远程调用纳入到统计范围之中
     * 通过new RestTemplate() 的形式而不配置为spring bean，zipkin则无法对远程调用进行统计
     * @return
     */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
