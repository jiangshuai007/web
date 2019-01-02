package com.ynu.sei.lib.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

// WebMvc的配置文件，将本地文件夹路径和后端API进行相应的映射
@Configuration
public class MyWebMvcConfigurerAdapter extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 具体的服务映射部分
        registry.addResourceHandler("/api/images/**").addResourceLocations("file:/Users/zhaorunxuan/Documents/wechat_image/");
        super.addResourceHandlers(registry);
    }
}
