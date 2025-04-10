package com.psavi.core.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface repositoryInterface<T, ID extends Serializable> extends CrudRepository<T, ID> {
}
