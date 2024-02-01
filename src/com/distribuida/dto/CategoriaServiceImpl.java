package com.distribuida.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.distribuida.dao.CategoriaDAO;
import com.distribuida.dao.SeccionDAO;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Seccion;

public class CategoriaServiceImpl implements CategoriaService {

	
	@Autowired
	private CategoriaDAO categoriaDAO;
	
	@Autowired
	private SeccionDAO seccionDAO;
	
	@Override
	public List<Categoria> finAll() {
		// TODO Auto-generated method stub
		return categoriaDAO.findAll();
	}

	@Override
	public Categoria finOne(int id) {
		// TODO Auto-generateds method stub
		return categoriaDAO.findOne(id);
	}

	@Override
	public void add(int idCategoria, String categoria, String descripcion, int fk_idSeccion) {
		// TODO Auto-generated method stub


		Seccion seccion = seccionDAO.findOne(fk_idSeccion);
	    
		Categoria categoria = new Categoria(idCategoria,categoria,descripcion);
		
		categoria.setSeccion(seccion);
		
		
		categoriaDAO.add(categoria);
		
		
		
	}

	@Override
	public void up(int idCategoria, String categoria, String descripcion,int fk_idSeccion) {
		// TODO Auto-generated method stub

		Seccion seccion = seccionDAO.findOne(fk_idSeccion);
	    
		Categoria categoria = new Categoria(idCategoria,categoria,descripcion);
		
		categoria.setSeccion(seccion);
		
		
		categoriaDAO.up(categoria);
	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		categoriaDAO.del(id);
	}

	@Override
	public List<Categoria> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
