package com.zhangchun.history.consumer.controller;

import com.xm4399.thrift.model.GeneralHistoryLog;
import com.xm4399.thrift.model.GeneralHistoryLogOrigin;
import com.xm4399.thrift.util.ThriftUtils;
import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangchun
 */
@RestController
public class HelloController {

    @Value("${spring.datasource.username}")
    private String username;

//    @Value("${kafka.bootstrap.server.config}")
//    private String kafkaIp;

    @RequestMapping("hello")
    public String hello(){
        String str = "{\"1\":{\"str\":\"50012702148\"},\"2\":{\"i32\":1},\"3\":{\"str\":\"142442\"},\"4\":{\"i32\":3},\"5\":{\"i64\":1575255418937},\"6\":{\"i32\":1},\"7\":{\"str\":\"182.46.15.64\"}}";
        System.out.println(str);
        try {
            ThriftUtils.parseLineToObject(str,GeneralHistoryLogOrigin.class);
        } catch (IllegalAccessException e) {
            return e.getMessage();
        } catch (InstantiationException e) {
            return e.getMessage();
        } catch (TException e) {
            return e.getMessage();
        }

        return "nice";

    }
}
