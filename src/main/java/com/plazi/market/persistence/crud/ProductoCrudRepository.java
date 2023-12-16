package com.plazi.market.persistence.crud;

import com.plazi.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {


    List<Producto> findByIdCategoria(int idCategoria);
}
