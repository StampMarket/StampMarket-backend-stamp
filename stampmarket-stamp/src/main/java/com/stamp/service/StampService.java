package com.stamp.service;

import com.stamp.dao.OrderDao;
import com.stamp.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StampService {
    @Autowired
    private OrderDao orderDao;

    /**     * 查询所有用户     */
    public List<Order> findAll(){        return orderDao.findAll();    }
    /**     * 根据id查询用户     */
    public Order findById(Integer id){        return orderDao.findById(id).get();    }
    /**     * 添加用户     */
    public void add(Order user){        orderDao.save(user);    }
    /**     * 修改用户  up    */
    public void update(Order user){         orderDao.save(user);    }
    /**     * 根据id删除用户     */
    public void deleteById(Integer id){        orderDao.deleteById(id);    }
}
