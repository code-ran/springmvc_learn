package com.ransibi.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//springmvc配置类，本质上还是一个spring配置类
@Configuration
@ComponentScan("com.ransibi.controller")
public class SpringMvcConfig {
}
