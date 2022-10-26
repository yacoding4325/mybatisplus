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
//    @Test
//    public void testSelectBatchIds() {
//        List<User> users = userMapper.selectBatchIds(Arrays.asList(1, 2, 3));
//        users.forEach(System.out::println);
//    }

    /**
     * 简单的条件查询，通过map封装查询条件
     */
//    @Test
//    public void testSelectById() {
//        HashMap<String,Object> map = new HashMap<>();
//        map.put("name", "bailongma");
//        map.put("age", 33);
//        List<User> users = userMapper.selectByMap(map);
//        users.forEach(System.out::println);
//    }

    /**
     * 分页查询
     */
//    @Test
//    public void testSelectPage() {
//        Page<User> page = new Page<>(2, 3);
//        userMapper.selectPage(page, Wrappers.<User>lambdaQuery().ge(User::getAge, 10));
//        List<User> records = page.getRecords();
//        records.forEach(System.out::println);
//        page.hasNext();
//        page.hasPrevious();
//    }
//
//    /**
//     * 根据id删除
//     */
//    @Test
//    public void testDeleteById() {
//        int result = userMapper.deleteById(1449689775719071753L);
//        System.out.println(result);
//    }
//
//    /**
//     * 根据主键id批量删除
//     */
//    @Test
//    public void testDeleteByMap() {
//        HashMap<String,Object> map = new HashMap<>();
//        map.put("name","shasheng");
//        int result = userMapper.deleteById(map);
//        System.out.println(result);
//    }
//
//    /**
//     * 复杂查询 1、ge、gt、le、lt、isNull、isNotNull
//     */
//    @Test
//    public void test1() {
//        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//        queryWrapper.ge("age",11).isNull("name");
//        int result = userMapper.delete(queryWrapper);
//        System.out.println(result);
//    }
//
//    /**
//     * 2、eq、ne
//     */
//    @Test
//    public void test2(){
//        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//        queryWrapper.eq("name","zhubajie");
//        User user = userMapper.selectOne(queryWrapper);
//        System.out.println(user);
//    }
//
//    /**
//     * 3、between、notBetween
//     */
//    @Test
//    public void test3(){
//        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//        queryWrapper.between("age",20,30);
//        List<User> users = userMapper.selectList(queryWrapper);
//        System.out.println(users);
//    }

//    /**
//     * 4、allEq
//     */
//    @Test
//    public void test4(){
//        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//        Map<String,Object> map = new HashMap<>();
//        map.put("id",1L);
//        map.put("name","Jack");
//        map.put("age",30);
//        queryWrapper.allEq(map);
//        List<User> users = userMapper.selectList(queryWrapper);
//        System.out.println(users);
//    }
//
//    /**
//     * 5、like、notLike、likeLeft、likeRight
//     */
//    @Test
//    public void test5() {
//        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//        queryWrapper.like("name","a")
//                .notLike("name","b");
//        List<Map<String, Object>> maps = userMapper.selectMaps(queryWrapper);
//        System.out.println(maps);
//    }
//
//    /**
//     * 6、in、notIn、inSql、notinSql、exists、notExists
//     */
//    @Test
//    public void test6() {
//        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//        queryWrapper.inSql("id","select id from user where id<3");
//        List<Object> objects = userMapper.selectObjs(queryWrapper);
//        System.out.println(objects);
//    }
//
//    /**
//     * 7、or、and
//     */
//    @Test
//    public void test7() {
//        UpdateWrapper<User> userUpdateWrapper = new UpdateWrapper<>();
//        User user = new User();
//        user.setAge(50);
//        user.setName("Rose");
//
//        userUpdateWrapper.like("name","a")
//                .or()
//                .between("age",20,25);
//        int result = userMapper.update(user,userUpdateWrapper);
//        System.out.println(result);
//    }

    /**
     * 嵌套 or  嵌套and
     */
//    @Test
//    public void test08() {
//        UpdateWrapper<User> userUpdateWrapper = new UpdateWrapper<>();
//        User user = new User();
//        user.setAge(60);
//        user.setName("Tom");
//        userUpdateWrapper.like("name","b")
//                .or(i -> i.eq("name","Jack").ne("age",20));
//        //UPDATE user SET name=?, age=?, update_time=? WHERE (name LIKE ? OR (name = ? AND age <> ?))
//        int result = userMapper.update(user,userUpdateWrapper);
//        System.out.println(result);
//    }

    /**
     * 9.orderBy,orderByDesc,orderByAsc
     */
//    @Test
//    public void test09() {
//        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//        queryWrapper.orderBy(true,false,"id");
//        List<User> users = userMapper.selectList(queryWrapper);
//        System.out.println(users);
//    }
//
//    /**
//     * 10.last
//     */
//    @Test
//    public void test10() {
//        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//        queryWrapper.last("limit 1");
//        List<User> users = userMapper.selectList(queryWrapper);
//        System.out.println(users);
//    }

    /**
     * 11、指定要查询的列
     */
//    @Test
//    public void test11() {
//        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//        queryWrapper.select("id","name","age");
//        List<User> users = userMapper.selectList(queryWrapper);
//        System.out.println(users);
//    }

    //12 set,setSql
    @Test
    public void test12() {
        UpdateWrapper<User> userUpdateWrapper = new UpdateWrapper<>();
        User user = new User();
        user.setAge(50);
        userUpdateWrapper.like("name","a")
                .or()
                .between("age",20,25)
                .set("name","Mike")
                .setSql(" email='123@qq.com'");
        // UPDATE user SET age=?, update_time=?, name=?, email='123@qq.com' WHERE (name LIKE ? OR age BETWEEN ? AND ?)
        int result = userMapper.update(user,userUpdateWrapper);
        System.out.println(result);
    }

}
