package com.idat.Bodega.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.Bodega.entity.Bodega;

@Repository
public interface BodegaRepository extends JpaRepository<Bodega, Integer> {

}
