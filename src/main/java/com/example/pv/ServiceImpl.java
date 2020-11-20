package com.example.pv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements IService{

    @Autowired
    private IRepository repository;

    @Override
    public Iterable<Student> findAll() {
        return repository.findAll();
    }
}
