package com.cxy.demo.spring_boot_demo.conf;

import java.nio.charset.Charset;

import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

@Configuration
public class Conf {

	@Bean
    public HttpMessageConverters customConverters() {
        FastJsonHttpMessageConverter fastjson = new FastJsonHttpMessageConverter();
        fastjson.setCharset(Charset.forName("UTF-8"));
        return new HttpMessageConverters(fastjson);
    }
}
