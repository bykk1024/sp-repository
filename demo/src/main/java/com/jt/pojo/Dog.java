package com.jt.pojo;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
//导入配置文件
@PropertySource(value="classpath:/properties/dog.properties")
public class Dog implements Serializable{
	
	private static final long serialVersionUID = 3613745308621943191L;
	@Value("${dog.id}")
	private Integer id;
	@Value("${dog.name}")
	private String name;
	@Override
	public String toString() {
		return "Dog [id=" + id + ", name=" + name + "]";
	}
	
}
