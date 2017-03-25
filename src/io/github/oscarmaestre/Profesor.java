package io.github.oscarmaestre;

import java.util.ArrayList;

import javafx.scene.control.Button;

public class Profesor  {
	private String nombre;
	private int horasAImpartir;
	private ArrayList<Modulo> modulosAsignados;
	private Button botonAsociado=null;
	int id;
	public Profesor(int id,String nombre, int horasAImpartir) {
		super();
		this.id=id;
		this.nombre = nombre;
		this.horasAImpartir = horasAImpartir;
	}
	public int getID(){
		return this.id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHorasAImpartir() {
		return horasAImpartir;
	}
	public void setHorasAImpartir(int horasAImpartir) {
		this.horasAImpartir = horasAImpartir;
	}
	public ArrayList<Modulo> getModulosAsignados() {
		return modulosAsignados;
	}
	public void setModulosAsignados(ArrayList<Modulo> modulosAsignados) {
		this.modulosAsignados = modulosAsignados;
	}
	public Button getButton(){
		if (botonAsociado==null){
			botonAsociado=new Button(this.nombre);
		}
		return botonAsociado;
	}
	public void asignarModulo (Modulo m){
		this.modulosAsignados.add(m);
	}
	public void desasignarModulo (Modulo m){
		this.modulosAsignados.remove(m);
	}
	
	
}
