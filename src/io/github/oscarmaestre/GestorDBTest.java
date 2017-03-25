package io.github.oscarmaestre;

import java.io.IOException;
import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

public class GestorDBTest {
	GestorDB gestor;
	@Before
	public void setUp() throws Exception {
		InicializadorModulos.getModulos();
		gestor=new GestorDB("repartos.db");
	}

	@Test
	public void testModulos() {
		try {
			gestor.crearTablaModulosDisponibles();
		} catch (IOException e) {
			System.out.println("Hubo un error IO al crear la tabla de asignaturas");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Hubo un error SQL al crear la tabla de asignaturas");
			e.printStackTrace();
		}
	}
	@Test
	public void testCreacionProfesores(){
		try {
			gestor.crearTablaProfesores();
		} catch (IOException e) {
			System.out.println("Hubo un error IO al crear la tabla de profesores");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Hubo un error SQL al crear la tabla de profesores");
			e.printStackTrace();
		}
	}
	@Test
	public void testCreacionRepartos(){
		try {
			gestor.crearTablaRepartos();
		} catch (IOException e) {
			System.out.println("Hubo un error IO al crear la tabla de repartos");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Hubo un error SQL al crear la tabla de repartos");
			e.printStackTrace();
		}
	}
	@Test
	public void testCreacionAsignaciones(){
		try {
			gestor.crearTablaAsignaciones();
		} catch (IOException e) {
			System.out.println("Hubo un error IO al crear la tabla de asignaciones");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Hubo un error SQL al crear la tabla de asignaciones");
			e.printStackTrace();
		}
	}

}
