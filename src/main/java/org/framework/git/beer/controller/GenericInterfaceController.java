package org.framework.git.beer.controller;

import java.util.List;
import java.util.Optional;

public interface GenericInterfaceController<T> {

    List<T> findAll();

    Optional<T> findById(String id);

    T save(T t);

    T update(T t);

    void delete(String id);

}