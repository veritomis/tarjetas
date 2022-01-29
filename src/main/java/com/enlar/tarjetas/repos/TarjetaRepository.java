package com.enlar.tarjetas.repos;
import com.enlar.tarjetas.entities.Tarjeta;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface TarjetaRepository extends JpaRepository<Tarjeta, Integer> {
    
}
