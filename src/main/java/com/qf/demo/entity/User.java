package com.qf.demo.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * t_user
 * @author 
 */
@Data
public class User implements Serializable {
    /**
     * 用户id
     */
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户昵称
     */
    private String nickname;

    /**
     * 用户联系方式
     */
    private String telphone;

    /**
     * 用户地址
     */
    private String address;

    /**
     * 用户身份:0==商户,1==管理员
     */
    private Integer isAdmin;

    /**
     * 用户状态:0==正常,1==删除
     */
    private Integer isDelete;

    private static final long serialVersionUID = 1L;
}