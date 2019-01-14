package com.java.code.study.mybatis03;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Employee {
	
	private Integer id;
	private String lastName;
	private String email;
	private String gender;
}
