package com.plazi.market.persistence;

import com.plazi.market.persistence.crud.ProductoCrudRepository;
import com.plazi.market.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
