package com.dawi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dawi.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
	

}
