package com.heiha.demo.springcloud.zipkin.config;

import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
}
