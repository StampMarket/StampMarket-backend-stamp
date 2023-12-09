package com.stamp.controller;

import com.stamp.pojo.Order;
import com.stamp.service.StampService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/record")
@RestController
//@Api(description = "记录控制器")
public class RecordController {
    @Autowired
    private StampService stampService;

    /*** 查询所有记录     */
    @RequestMapping(method = RequestMethod.GET)
    public List<Order> findAll(){
        return stampService.findAll();
    }
    /*** 根据id查询记录     */
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Order findById(@PathVariable Integer id){
        return stampService.findById(id);    }
    /*** 添加记录     */
    @RequestMapping(method = RequestMethod.POST)
    public String add(@RequestBody Order order){
        stampService.add(order);
        return "添加成功";    }
    /*** 修改记录     */
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public String update(@RequestBody Order order,@PathVariable Integer id){
        //设置id
        order.setId(id);
        stampService.update(order);
        return "修改成功";    }
    /*** 根据id删除记录     */
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public String deleteById(@PathVariable Integer id){
        stampService.deleteById(id);
        return "删除成功";    }

}
