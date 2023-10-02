package com.myprojects.patterns.generative.singltone.note;

import java.util.List;

public interface Repository<T, ID> {
    T findById(ID id);
    List<T> findAll();
    void insert(T entity);
    void deleteById(ID id);
    void deleteAll();
    void update(T entity);
}
