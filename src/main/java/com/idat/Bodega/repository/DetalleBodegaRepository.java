package com.idat.Bodega.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.Bodega.entity.DetalleBodega;

@Repository
public interface DetalleBodegaRepository extends JpaRepository<DetalleBodega, Integer> {

}
