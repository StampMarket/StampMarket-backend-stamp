package com.stamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@RequestMapping("/order")
@RestController
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;
    /* * * 购票方法     */
    @RequestMapping(method = RequestMethod.GET)
    public String order(Integer userid, Integer stampid, Integer amount){

        Date tradedate = new Date();
        //POST的json文件
        String requestJson = String.format("{\"userid\":%d, \"stampid\":\"%d\", \"tradedate\":\"%s\", \"amount\":\"%d\"}", userid, stampid, tradedate, amount);
        System.out.println(requestJson);

        // 构造HTTP头部信息
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        // 将JSON字符串转换为HttpEntity对象
        HttpEntity<String> entity = new HttpEntity<>(requestJson, headers);

        // 定义URL地址
        String url = "http://127.0.0.1:9002/record";

        try {
            // 发送POST请求并获取返回结果
            ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);

            // 输出返回结果
            System.out.println("Status Code: " + response.getStatusCode());
            System.out.println("Body: " + response.getBody());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "购票成功";
    }
}
