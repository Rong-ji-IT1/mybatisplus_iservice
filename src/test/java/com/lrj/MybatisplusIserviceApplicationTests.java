package com.lrj;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.lrj.domain.TUser;
import com.lrj.services.Impl.TUserServicesImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class MybatisplusIserviceApplicationTests {

    @Autowired
    TUserServicesImpl tUserServices;
    //全查询
    @Test
    void contextLoads() {
       List list =tUserServices.getAll();
        System.out.println(list);
    }
    //添加
    @Test
    void contextLoads2(){
        TUser tUser = new TUser();
        tUser.setName("阿斯蒂芬");
        tUser.setSex("女");
        tUser.setHobby("地方");
        tUser.setMotto("符合当时");
        boolean flag = tUserServices.saveTUser(tUser);
        System.out.println(flag);
    }
    //删除
    @Test
    void contextLoads3() {
        boolean flag = tUserServices.removeById(15);
        System.out.println(flag);
    }
    //批量删除
    @Test
    void contextLoads4() {
        List list =new ArrayList();
        list.add(16);
        list.add(13);
        boolean flag = tUserServices.removeByIds(list);
        System.out.println(flag);
    }
    //修改
    @Test
    void contextLoads5() {
        TUser tUser = new TUser();
        tUser.setHobby("秩序");
        boolean flag = tUserServices.update(tUser,"oo");
        System.out.println(flag);
    }
    //批量添加
    @Test
    void contextLoads6(){
        TUser tUser = new TUser();
        tUser.setName("coco");
        tUser.setSex("男");
        tUser.setHobby("阿斯蒂芬");
        tUser.setMotto("现场v");

        TUser tUser1 = new TUser();
        tUser1.setName("麦克");
        tUser1.setSex("女");
        tUser1.setHobby("阿斯顿飞过");
        tUser1.setMotto("宣传部v现在宣传部");

        TUser tUser2 = new TUser();
        tUser2.setName("品牌");
        tUser2.setSex("女");
        tUser2.setHobby("部分");
        tUser2.setMotto("阿维格");

        TUser tUser3 = new TUser();
        tUser3.setName("阿斯蒂芬");
        tUser3.setSex("男");
        tUser3.setHobby("户接口");
        tUser3.setMotto("规划开发");
        List list = new ArrayList<TUser>();
        list.add(tUser);
        list.add(tUser1);
        list.add(tUser2);
        list.add(tUser3);
        boolean flag = tUserServices.saveTUsers(list);
        System.out.println(flag);
    }

    //分页
    @Test
    void contextLoads7() {
        IPage iPage = tUserServices.getPage();
        List<TUser> list = iPage.getRecords();
        System.out.println(list);
    }


}
