package com.atguigu.crowd.test;

import com.atguigu.crowd.entity.Role;
import com.atguigu.crowd.mapper.AdminMapper;
import com.atguigu.crowd.mapper.RoleMapper;
import com.atguigu.crowd.service.apl.AdminService;
import com.atguigu.crowd.entity.Admin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-persist-mybatis.xml", "classpath:spring-persist-tx.xml"})
public class CrowdTest {
    @Autowired
    private DataSource dataSource;
    @Autowired
    private AdminMapper adminMapper;
    @Autowired
    private AdminService adminService;
    @Autowired
    private RoleMapper roleMapper;

    @Test
    public void testRoleSave() {
        for(int i = 0; i < 235; i++) {
            roleMapper.insert(new Role(null, "role"+i));
        }
    }


    @Test
    public void test() {
        for (int i = 0; i < 259; i++) {
            adminMapper.insert(new Admin(null, "loginAcct" + i, "userPswd" + i, "userName" + i, "email" + i, null));
        }
    }

    @Test
    public void testTx() {
        Admin admin = new Admin(null, "jerry", "123456", "杰瑞", "jerry@qq.com", null);
        adminService.saveAdmin(admin);
    }

    @Test
    public void testLog() {

        // 1.获取Logger对象，这里传入的Class对象就是当前打印日志的类
        Logger logger = LoggerFactory.getLogger(CrowdTest.class);
        // 2.根据不同日志级别打印日志
        logger.debug("debug");
        logger.info("信息");
        logger.error("错误");
        logger.warn("异常");
    }

    @Test
    public void testInsertAdmin() {
        Admin admin = new Admin(null, "tom", "123", "汤姆", "tom@qq.com", null);
        int cont = adminMapper.insert(admin);
        //如果在实际开发中，所有想查看数值的地方都使用sysout方式打印，会给项目上线运行带来问题!
        // sysout本质上是一个IO操作，通常IO的操作是比较消耗性能的。如果项目中sysout很多，那么对性能的影响就比较大
        System.out.println("受影响的行数" + cont);
    }


    @Test
    public void testConnection() throws SQLException {
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }

}
