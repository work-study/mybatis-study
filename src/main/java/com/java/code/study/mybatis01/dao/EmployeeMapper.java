package com.java.code.study.mybatis01.dao;


import com.java.code.study.mybatis01.bean.Employee;
import org.apache.ibatis.annotations.MapKey;

import java.util.Map;

public interface EmployeeMapper {
	
	public Employee getEmpById(Integer id);

	public Map<String,Object> getEmpMapById(Integer id);

	@MapKey("lastName")
	public Map<String,Employee> getEmpListMap();

}
