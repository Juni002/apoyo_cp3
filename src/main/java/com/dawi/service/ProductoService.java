package com.dawi.service;

import java.util.List;

import com.dawi.entity.Producto;

public interface ProductoService {
	
	public abstract List<Producto> listaProducto();
	public abstract Producto insertarActualizaProducto(Producto obj);
	
	

}
