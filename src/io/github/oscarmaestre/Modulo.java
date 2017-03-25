package io.github.oscarmaestre;

import javafx.scene.control.Button;

public class Modulo{
	private int curso;
	private String ciclo;
	private int horas;
	private String nombreModulo;
	private int id;
	private Button botonAsociado;
	public Modulo(int codigoJunta, int codigoBD, int horas, 
			String nombreModulo, String cadCursoCiclo) {
				
		this.id=codigoJunta;
		this.curso = this.getNumeroCurso(cadCursoCiclo);
		this.ciclo = this.getNombreDelCiclo(cadCursoCiclo);
		this.horas = horas;
		this.nombreModulo = nombreModulo;
	}
	protected int getNumeroCurso (String cadCursoCiclo){
		String[] cadenas=cadCursoCiclo.split("_");
		return Integer.parseInt(cadenas[1]);
	}
	protected String getNombreDelCiclo(String cadCursoCiclo){
		String[] cadenas=cadCursoCiclo.split("_");
		return cadenas[0];
	}
	public int getCurso() {
		return curso;
	}
	public void setCurso(int curso) {
		this.curso = curso;
	}
	public int getID(){
		return this.id;
	}
	public String getCiclo() {
		return ciclo;
	}
	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public String getNombreModulo() {
		return nombreModulo;
	}
	public void setNombreModulo(String nombreModulo) {
		this.nombreModulo = nombreModulo;
	}
	public Button getButton(){
		if (botonAsociado==null){
			String etiqueta=this.nombreModulo + " " + this.horas+"h ";
			etiqueta+="("+this.getCiclo()+")";
			botonAsociado=new Button(etiqueta);
		}
		return botonAsociado;
	}
	
}
