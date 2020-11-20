package com.example.pv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassServiceImpl implements IClassService{
    @Autowired
    private ClassRepo classRepo;

    @Override
    public Iterable<Class> findAll() {
        return classRepo.findAll();
    }
}
