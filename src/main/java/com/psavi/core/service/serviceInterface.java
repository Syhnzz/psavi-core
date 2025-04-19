package com.psavi.core.service;

public interface serviceInterface<T, ID> {
    T create(T entity);
    Iterable<T> getAll();
    T getById(ID id);
}
