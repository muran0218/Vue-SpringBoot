package com.qf.demo.service;

import com.github.pagehelper.PageInfo;
import com.qf.demo.entity.User;

import java.util.List;

/**
 * @Author lzj
 * @Date 2021/10/22
 */
public interface UserService {
    /**
     * 查询所有并分页
     * @return
     */
    PageInfo findAll(Integer page, Integer limit);

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User findById(Integer id);

    /**
     * 修改用户
     * @return
     */
    Integer modifyUserById(User user);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    Integer removeUserById(Integer id);

    /**
     * 新增用户
     * @param user
     * @return
     */
    Integer addUser(User user);
}
