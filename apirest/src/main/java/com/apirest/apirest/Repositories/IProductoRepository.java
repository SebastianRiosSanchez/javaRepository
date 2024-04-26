package com.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apirest.apirest.Entities.Producto;

public interface IProductoRepository extends JpaRepository<Producto, Long> {

}
