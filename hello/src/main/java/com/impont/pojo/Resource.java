package com.impont.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import lombok.Data;
//引入资源配置文件
@Configuration
//把前缀后的属性值映射到pojo中来
@ConfigurationProperties(prefix="com.yu.opensource")
//设置资源配置文件路径
@PropertySource(value="classpath:resource.properties")
@Data
public class Resource {
	
	private String name;
	private String website;
	private String language;
}
