package com.qf.service;

import com.qf.entity.Class;

import java.util.List;

/**
 *
 *
 *
 */
public interface IClassService extends IBaseService<Class>{

    List<Class> getAllClass();

}
