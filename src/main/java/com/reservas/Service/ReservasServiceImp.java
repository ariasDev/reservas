package com.reservas.Service;

import java.util.HashMap;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservas.Entity.ReservasEntity;
import com.reservas.Repository.ReservasRepository;


@Service
public class ReservasServiceImp implements ReservasService {
	
	@Autowired
	public ReservasRepository reservasRepository;

	@Override
	public HashMap<String, Object> getAllReservas() {
		try {
			HashMap<String, Object> reservasList = new HashMap<>();
			reservasList.put("reservasList", reservasRepository.findAll());
			return reservasList;
		} catch (Exception e) {
			HashMap<String, Object> errorMap = new HashMap<>();
			errorMap.put("error", e);
		    return errorMap;
		}
	}

	@Override
	public HashMap<String, Object> getReserva(UUID id) {
		try {
			HashMap<String, Object> reserva = new HashMap<>();
			reserva.put("reserva", reservasRepository.findById(id));
			return reserva;
		} catch (Exception e) {
			HashMap<String, Object> errorMap = new HashMap<>();
			errorMap.put("error", e);
		    return errorMap;
		}
	}

	@Override
	public HashMap<String, Object> newReserva(ReservasEntity reservasEntity) {
		try {
			HashMap<String, Object> saveResponseMap = new HashMap<>();
			saveResponseMap.put("response", reservasRepository.save(reservasEntity));
			return saveResponseMap;
		} catch (Exception e) {
			HashMap<String, Object> errorMap = new HashMap<>();
			errorMap.put("error", e.getLocalizedMessage());
		    return errorMap;
		}
	}

	@Override
	public HashMap<String, Object> deleteReserva(UUID id) {
		try {
			HashMap<String, Object> deletedMap = new HashMap<>();
			reservasRepository.deleteById(id);
			deletedMap.put("deleted", new Object());
			return deletedMap;
		} catch (Exception e) {
			HashMap<String, Object> errorMap = new HashMap<>();
			errorMap.put("error", e);
		    return errorMap;
		}
	}
	
}
