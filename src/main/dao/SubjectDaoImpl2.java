package main.dao;


import main.entity.Subject;

import java.util.ArrayList;

public class SubjectDaoImpl2 implements BaseDao<Subject,Integer>{
    @Override
    public ArrayList<Subject> getAll() {
        return null;
    }

    @Override
    public boolean create(Subject subject) {
        return false;
    }

    @Override
    public boolean update(Subject subject) {
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public Subject findById(Integer id) {
        return null;
    }
}
