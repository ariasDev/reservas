package com.reservas.Repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.reservas.Entity.ReservasEntity;

@Repository
public interface ReservasRepository extends CrudRepository<ReservasEntity, UUID>{

}
