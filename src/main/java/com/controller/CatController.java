package com.controller;

import com.bean.Cat;
import com.service.CatService;
import org.hibernate.service.spi.ServiceException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * http://localhost:8181/hello1
 * Created by Administrator on 2018/5/4.
 */
@RestController
public class CatController {

    @Resource
    private CatService catService;

    @RequestMapping("/save")
    public String saveCat(){
        Cat cat = new Cat();
        cat.setName("mango");
        cat.setAge("6");
        cat.setCreateTime(new Date());
        catService.save(cat);
        return "save ok";
    }

    @RequestMapping("/hello1")
    public String hello1() {
        int i = 1 / 0;
        return "hello";
    }

    @RequestMapping("/hello2")
    public String hello2(Long id) {
        String string = null;
        string.length();
        return "hello";
    }

    @RequestMapping("/hello3")
    public List<String> hello3() {
        throw new ServiceException("test");
    }


    @GetMapping("/hello4")
    public String hello4() {
        return "hello";
    }
}
