package com.reservas.Service;
import java.util.HashMap;
import java.util.UUID;

import com.reservas.Entity.ReservasEntity;

import netscape.javascript.JSObject;



public interface ReservasService {
	public HashMap<String, Object> getAllReservas();
	public HashMap<String, Object> getReserva(UUID id);
	public HashMap<String, Object> newReserva(ReservasEntity reservasEntity);
	public HashMap<String, Object> deleteReserva(UUID id);
}
