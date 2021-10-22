package com.qf.demo.controller;

import com.github.pagehelper.PageInfo;
import com.qf.demo.entity.ResultVO;
import com.qf.demo.entity.User;
import com.qf.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author lzj
 * @Date 2021/10/22
 */
@RequestMapping("/user")
@RestController
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findAll/{page}/{limit}")
    public ResultVO findAll(@PathVariable Integer page, @PathVariable Integer limit){
        PageInfo pageInfo = userService.findAll(page, limit);
        ResultVO resultVO = new ResultVO();
        resultVO.setCoode(1000);
        resultVO.setMassage("查询员工成功！");
        resultVO.setData(pageInfo);
        return resultVO;
    }

    @RequestMapping("/findById/{id}")
    public ResultVO findById(@PathVariable Integer id){
        User user = userService.findById(id);
        ResultVO resultVO = new ResultVO();
        if (user != null) {
            resultVO.setCoode(1000);
            resultVO.setMassage("查询用户成功！");
            resultVO.setData(user);
        }else {
            resultVO.setMassage("查询用户失败！");
        }
        return resultVO;
    }

    @RequestMapping("/modifyUser")
    public ResultVO modifyUserById(@RequestBody User user){
        Integer integer = userService.modifyUserById(user);
        ResultVO resultVO = new ResultVO();
        if(integer > 0){
            resultVO.setCoode(1000);
            resultVO.setMassage("修改用户成功！");
        }else {
            resultVO.setMassage("修改用户失败！");
        }
        return resultVO;
    }

    @RequestMapping("/removeUserById/{id}")
    public ResultVO removeUserById(@PathVariable Integer id){
        Integer integer = userService.removeUserById(id);
        ResultVO resultVO = new ResultVO();
        if (integer > 0) {
            resultVO.setCoode(1000);
            resultVO.setMassage("删除用户成功！");
        }else {
            resultVO.setMassage("删除用户失败！");
        }
        return resultVO;
    }

    @RequestMapping("/addUser")
    public ResultVO addUser(@RequestBody User user){
        Integer integer = userService.addUser(user);
        ResultVO resultVO = new ResultVO();
        if (integer > 0) {
            resultVO.setCoode(1000);
            resultVO.setMassage("新增用户成功！");
        }else {
            resultVO.setMassage("新增用户失败！");
        }
        return resultVO;
    }
}
