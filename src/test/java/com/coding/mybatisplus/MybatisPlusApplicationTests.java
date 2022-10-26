package com.coding.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Assert;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coding.mybatisplus.entity.User;
import com.coding.mybatisplus.mapper.UserMapper;
import net.minidev.json.JSONUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * @Author yaCoding
 * @create 2022-10-26 上午 9:36
 */
@SpringBootTest
class MybatisPlusApplicationTests {

    @Autowired
    private UserMapper userMapper;

    /**
     * 查询所有用户记录
     */
//    @Test
//    public void testSelect() {
//        System.out.println(("----- selectAll method test ------"));
//        List<User> userList = userMapper.selectList(null);
//        userList.forEach(System.out::println);
//    }

    /**
     * 插入用户表一条数据
     */
//    @Test
//    public void testInsert(){
//        User user = new User();
//        user.setAge(20);
//        user.setEmail("781505696@qq.com");
//        user.setName("孙悟空");
//
//        int result = userMapper.insert(user);
//        System.out.println(result);
//        System.out.println(user);
//    }

    /**
     * 根据id更新一条数据
     */
//    @Test
//    public void testUpdateById() {
//        User user = new User();
//        user.setId(1449689775719071751L);
//        user.setName("张三");
//        user.setAge(30);
//        user.setEmail("147258@qq.com");
//        int result = userMapper.updateById(user);
//        System.out.println(user);
//    }

    /**
     * 测试乐观锁增加
     */
//    @Test
//    public void testOptimisticLocker() {
//        User user = new User();
//        user.setAge(11);
//        user.setEmail("1112212222@qq.com");
//        user.setName("tangsheng");
//
//        int result = userMapper.insert(user);
//        System.out.println(result);
//        System.out.println(user);
//    }

    /**
     * 根据多个id查询
     */
    @Test
    public void testSelectBatchIds() {
        List<User> users = userMapper.selectBatchIds(Arrays.asList(1, 2, 3));
        users.forEach(System.out::println);
    }

}
