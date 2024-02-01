package com.distribuida.principal;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ProductoDAO;
import com.distribuida.entities.Producto;

public class PrincipalProducto {


	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		ProductoDAO productoDAO = context.getBean("productoDAOImpl",ProductoDAO.class);
	
		
		
		//CRUD

		//ADD	
//		Producto producto1 = new Producto(0,"Seccion","Descripcion","ds","ds","ds");
//		productoDAO.add(producto1);
		
		//UP
//		Cliente cliente2 = new Cliente(39,"1566464","Paul","Llulluna","Tumbaco","2954445454","correo@gmail.com");
//		clienteDAO.up(cliente2);
		
		//DEL
//		Cliente cliente3 = new Cliente(39,"1566464","Paul","Llulluna","Tumbaco","2954445454","correo@gmail.com");
		productoDAO.del(39);
		
		//FIND ALL
		
		
//		List<Seccion> secciones = seccionDAO.findAll();
//
//	
//		
//		for(Seccion seccion :secciones) {
//			System.out.println(seccion.toString());
//			
//		}
//		//FIND ONE
//		Seccion seccion = seccionDAO.findOne(1);
		
		
//		System.out.println(cliente.toString());
//		 
		
		
		
		//System.out.println(clientes.toString());

		
		
		context.close();

		
	}
}
