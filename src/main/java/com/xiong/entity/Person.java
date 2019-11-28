package com.xiong.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
@Component
//@ConfigurationProperties(prefix = "home.person")
@TableName("t_person")
public class Person implements Serializable {
	private Integer id;
	private String name;
	private Integer age;
	
	@TableField(exist = false)
	private List<String> likes;
	
	@TableField(exist = false)
	private Map<String,String> location;
}


