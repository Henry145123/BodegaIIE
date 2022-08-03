package com.idat.Bodega.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.Bodega.client.OpenFeignClient;
import com.idat.Bodega.dto.Producto;
import com.idat.Bodega.entity.DetalleBodega;
import com.idat.Bodega.entity.ProductoBodegaFK;
import com.idat.Bodega.repository.BodegaRepository;
import com.idat.Bodega.repository.DetalleBodegaRepository;

@Service
public class BodegaServiceImpl implements BodegaService{

	@Autowired
	private BodegaRepository repositoryBodega;
	
	@Autowired
	private DetalleBodegaRepository repositoryDetalle;
	
	@Autowired
	private OpenFeignClient feign;
	
	@Override
	public void asignarProductosBodega() {
		List<Producto> listado = feign.listarProductosSeleccionados();
		ProductoBodegaFK fk = null;
		DetalleBodega detalle = null;

		
		for (Producto producto : listado) {
			
			fk = new ProductoBodegaFK();
			fk.setIdProducto(producto.getIdProducto());
			fk.setIdBodega(1);
			
			detalle = new DetalleBodega();
			detalle.setFk(fk);	
			
			repositoryDetalle.save(detalle);
		
		}

	}
}
