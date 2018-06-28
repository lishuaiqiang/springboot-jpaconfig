package com.repository;

import com.bean.Cat;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Administrator on 2018/5/4.
 */
public interface CatRepository extends CrudRepository<Cat,Integer> {
}
