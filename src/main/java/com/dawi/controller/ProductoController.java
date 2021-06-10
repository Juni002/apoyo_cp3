package com.dawi.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dawi.entity.Producto;
import com.dawi.service.ProductoService;

@RestController
@RequestMapping("rest/producto")
public class ProductoController {
	
//	@RequestMapping("/verInicio")
//	public String verInicio() {
//		return "Index";
//	}
	@Autowired
	private ProductoService service;
	
	@GetMapping
	@ResponseBody
	public ResponseEntity<List<Producto>> listaProducto(){
		List<Producto> lista= service.listaProducto();
		return ResponseEntity.ok(lista);
	}

}
