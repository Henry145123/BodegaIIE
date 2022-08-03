package com.idat.Bodega.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.Bodega.dto.Producto;



@FeignClient(name="idat-producto", url="localhost:8082")
public interface OpenFeignClient {

	@GetMapping("/api/producto/v1/listar")
	public List<Producto> listarProductosSeleccionados();
}
