package com.lrj.services.Impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lrj.dao.TUserDao;
import com.lrj.domain.TUser;
import com.lrj.services.TUserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class TUserServicesImpl extends ServiceImpl<TUserDao,TUser> implements TUserServices {
    @Autowired
    private TUserServices tUserServices;
    //全查询
    public List<TUser> getAll()
    {
        return tUserServices.list();
    }
    //添加
    public boolean saveTUser(TUser tUser)
    {
        return tUserServices.save(tUser);
    }
    //批量添加
    public boolean saveTUsers(Collection<TUser> conn)
    {
        return tUserServices.saveBatch(conn);
    }
    //删除
    public boolean delete(int id)
    {
        return tUserServices.removeById(id);
    }
    //批量删除
    public boolean deletes(List list)
    {
        return tUserServices.removeByIds(list);
    }
    //修改
    public boolean update(TUser tUser,String name)
    {
        UpdateWrapper wrapper =new UpdateWrapper();
        wrapper.eq("name",name);
        boolean flag = tUserServices.update(tUser,wrapper);
        return flag;
    }

    //分页
    public IPage<TUser> getPage()
    {
        IPage page = new Page(1,2);
        return tUserServices.page(page);
    }


}
