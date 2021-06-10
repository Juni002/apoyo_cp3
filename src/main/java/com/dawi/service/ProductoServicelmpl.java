package com.dawi.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawi.entity.Producto;
import com.dawi.repository.ProductoRepository;

@Service
public class ProductoServicelmpl implements ProductoService{
 
	@Autowired
	private ProductoRepository repository;
	
	@Override
	public List<Producto> listaProducto() {		
		return repository.findAll();
	}

	@Override
	public Producto insertarActualizaProducto(Producto obj) {
	
		return repository.save(obj);
	}
	
	

}
