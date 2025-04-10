package com.psavi.core.service;

import com.psavi.core.entity.User;

public interface serviceInterface<T, ID> {
    T create(T entity);
    Iterable<T> getAll();
}
