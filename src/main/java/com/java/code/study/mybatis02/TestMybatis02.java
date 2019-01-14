package com.java.code.study.mybatis02;

import com.java.code.study.mybatis01.bean.Employee;
import com.java.code.study.mybatis01.dao.EmployeeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

/**
 * @author zouw
 * @date 15:06 2019/1/14
 */
public class TestMybatis02 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config02.xml");
        Properties properties = new Properties();
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream,properties);
        SqlSession sqlSession = sessionFactory.openSession();
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = employeeMapper.getEmpById(1);
        Map<String, Object> employeeMap = employeeMapper.getEmpMapById(1);
        Map<String, Employee> empListMap = employeeMapper.getEmpListMap();
        System.out.println(empListMap);
        System.out.println(employeeMap);
        System.out.println(employee);
        sqlSession.close();
    }
}
