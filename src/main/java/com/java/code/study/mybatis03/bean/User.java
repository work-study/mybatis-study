package com.java.code.study.mybatis03.bean;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author zouw
 * @date 19:20 2019/1/14
 */
@Data
@ToString
public class User implements Serializable{
    private static final long serialVersionUID = -5683557503393402549L;
    private Integer id;
    private String name;
}
