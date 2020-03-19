package com.reservas.Api;

import java.util.HashMap;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reservas.Entity.ReservasEntity;
import com.reservas.Service.ReservasService;

@RestController
@RequestMapping(value="/reservas")
public class ReservasApi {
	@Autowired
	private ReservasService reservasService;
	
	@GetMapping(path = "")
	public HashMap<String, Object> getAllReservas(){
		return reservasService.getAllReservas();
	}
	
	@GetMapping(path = "/{id}")
	public HashMap<String, Object> getReserva(@PathVariable UUID id){
		return reservasService.getReserva(id);
	}
	
	@PostMapping(path = "/insert", consumes = "application/json", produces = "application/json")
	public HashMap<String, Object> newReserva(@RequestBody ReservasEntity reservaEntity){
		return reservasService.newReserva(reservaEntity);
	}
	
	@DeleteMapping("/delete/{id}")
	public HashMap<String, Object> deleteReserva(@PathVariable("id") UUID id){
		return reservasService.deleteReserva(id);
	}
	
}
