package com.service;

import com.bean.Cat;
import com.repository.CatRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

/**
 * Created by Administrator on 2018/5/4.
 */
@Service
public class CatService {

    @Resource
    private CatRepository catRepository;

    @Transactional
    public void save(Cat cat){
        catRepository.save(cat);
    }

}
