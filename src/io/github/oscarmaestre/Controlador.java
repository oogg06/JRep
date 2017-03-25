package io.github.oscarmaestre;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Controlador {
	ArrayList<Profesor> profesores	=	null	;
	ArrayList<Modulo>	modulos		=	null	;
	
	private final int NINGUN_PROFESOR_ACTIVO=-1;
	int idProfesorActivo=NINGUN_PROFESOR_ACTIVO;
	
	public Controlador(VBox contenedor, FlowPane contenedorModulos){
		profesores	=	InicializadorProfesores.getArrayListProfesores();
		modulos		=	InicializadorModulos.getArrayListModulos();
		
		crearControlesProfesores	(	contenedor			);
		crearControlesModulos 		( 	contenedorModulos 	);
	}
	
	
	protected void crearControlesProfesores(VBox contenedor){
		for (Profesor p: profesores){
			crearHBoxProfesor(p, contenedor);
		}
	}
	
	protected HBox crearHBoxProfesor(Profesor profesor, VBox contenedor){
		HBox 		hbox;
		hbox		=		new HBox();
		contenedor.getChildren().add(hbox);
		Button botonProfesor=profesor.getButton();
		hbox.getChildren().add(botonProfesor);
		botonProfesor.setOnAction(
				( ActionEvent e ) -> {
					this.idProfesorActivo = profesor.getID();
					System.out.println(this.idProfesorActivo);
				}
		);
		return hbox;
	}
	
	protected void crearControlesModulos(FlowPane contenedorModulos) {
		for (Modulo m : modulos){
			Button botonModulo = m.getButton();
			contenedorModulos.getChildren().add(botonModulo);
			botonModulo.setOnAction(
					( ActionEvent e) -> {
						if (this.idProfesorActivo!=this.NINGUN_PROFESOR_ACTIVO){
							Button bt=(Button) e.getTarget();
							System.out.println(bt.getText());
							System.out.println("Asignado!!");
							this.idProfesorActivo=this.NINGUN_PROFESOR_ACTIVO;
						}
					}
			);
		}
	}
}
