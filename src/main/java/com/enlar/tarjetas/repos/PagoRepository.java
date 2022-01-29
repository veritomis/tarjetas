package com.enlar.tarjetas.repos;
import com.enlar.tarjetas.entities.Pago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagoRepository extends JpaRepository<Pago, Integer>{
    
}
