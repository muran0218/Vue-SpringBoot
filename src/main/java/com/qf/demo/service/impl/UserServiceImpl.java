package com.qf.demo.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.demo.dao.UserDao;
import com.qf.demo.entity.User;
import com.qf.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author lzj
 * @Date 2021/10/22
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public PageInfo findAll(Integer page,Integer limit) {
        PageHelper.startPage(page,limit);
        List<User> userList = userDao.selectAll();
        PageInfo<User> userPageInfo = new PageInfo<>(userList);
        return userPageInfo;
    }

    @Override
    public User findById(Integer id) {
        User user = userDao.selectByPrimaryKey(id);
        return user;
    }

    @Override
    public Integer modifyUserById(User user) {
        int i = userDao.updateByPrimaryKeySelective(user);
        return i;
    }

    @Override
    public Integer removeUserById(Integer id) {
        Integer integer = userDao.updateById(id);
        return integer;
    }

    @Override
    public Integer addUser(User user) {
        user.setIsDelete(0);
        int i = userDao.insertSelective(user);
        return i;
    }

}
