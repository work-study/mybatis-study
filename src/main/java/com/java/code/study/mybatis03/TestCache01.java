package com.java.code.study.mybatis03;

import com.java.code.study.mybatis01.bean.Employee;
import com.java.code.study.mybatis01.dao.EmployeeMapper;
import com.java.code.study.mybatis03.bean.User;
import com.java.code.study.mybatis03.dao.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author zouw
 * @date 19:14 2019/1/14
 */
public class TestCache01 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config03.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sessionFactory.openSession();
        SqlSession sqlSession1 = sessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        UserMapper userMapper1 = sqlSession1.getMapper(UserMapper.class);
        User user = userMapper.getUserById(1);
        sqlSession.close();
        User user1 = userMapper1.getUserById(1);
        System.out.println(user==user1);
        System.out.println(user);
        sqlSession1.close();
    }
}
