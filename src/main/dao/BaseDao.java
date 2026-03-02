package main.dao;


import java.util.ArrayList;

public interface BaseDao<E,K> {
    ArrayList<E> getAll();
    boolean create(E e);
    boolean update(E e);
    boolean delete(K id);
    E findById(K id);
}
