package com.distribuida.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.distribuida.dao.SeccionDAO;
import com.distribuida.entities.Seccion;

public class SeccionServiceImpl implements SeccionService {
	
	
	@Autowired 
	private SeccionDAO seccionDAO;

	
	@Override
	public void add(int idSeccion, String seccion, String descripcion) {
		// TODO Auto-generated method stub

		Seccion seccion = new Seccion(idSeccion,seccion,descripcion);
		seccionDAO.add(seccion);
		
	}

	@Override
	public void up(int idSeccion, String seccion, String descripcion) {
		// TODO Auto-generated method stub
		Seccion seccion = new Seccion(idSeccion,seccion,descripcion);
		seccionDAO.up(seccion);
	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub

		seccionDAO.del(id);
	}

	@Override
	public List<Seccion> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return seccionDAO.findAll(busqueda);
	}

	@Override
	public List<Seccion> findAll() {
		// TODO Auto-generated method stub
		return seccionDAO.findAll();
	}

	@Override
	public Seccion findOne(int id) {
		// TODO Auto-generated method stub
		return seccionDAO.findOne(id);
	}

	

}
