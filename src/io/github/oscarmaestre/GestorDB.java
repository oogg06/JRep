package io.github.oscarmaestre;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class GestorDB {
	String rutaFicheroDB;
	Connection conexion;
	public GestorDB(String rutaFicheroDB) throws SQLException, ClassNotFoundException {
		super();
		this.rutaFicheroDB = rutaFicheroDB;
		System.setProperty("org.sqlite.lib.path", 
				"/home/usuario/repos/JReparto/bin/bibliotecas/Linux/x86_64");
		//System.setProperty("org.sqlite.lib.name", "xxx");
		String cad=System.getProperty("org.sqlite.lib.path");
		System.out.println(cad);
		Class.forName("org.sqlite.JDBC");
		
		String cadConexion="jdbc:sqlite:"+this.rutaFicheroDB;
		System.out.println("Probando con:"+cadConexion);
		
		conexion = DriverManager.getConnection("jdbc:sqlite:"+this.rutaFicheroDB);
	}
	public void crearTablaModulosDisponibles() throws IOException, SQLException{
		String rutaRecursoTablaModulos="/recursos/sql_tabla_modulos";
		this.ejecutarSQL(rutaRecursoTablaModulos);
		Modulo[] modulos=InicializadorModulos.getModulos();
		String plantillaInsert;
		plantillaInsert="insert or ignore into modulos values (%d, %d, '%s', '%s', %d) ";
		ArrayList<String> inserts=new ArrayList<String>();
		for (int i=0; i<modulos.length; i++){
			Modulo modulo=modulos[i];
			String insert=String.format(plantillaInsert, 
					modulo.getID(), 	modulo.getHoras(), modulo.getNombreModulo(),
					modulo.getCiclo(), 	modulo.getCurso()	
			);
			inserts.add(insert);
		}
		this.ejecutarEnTransaccion(inserts);
	}
	public void crearTablaProfesores() throws IOException, SQLException{
		String rutaRecursoTablaProfesores="/recursos/sql_tabla_profesores";
		this.ejecutarSQL(rutaRecursoTablaProfesores);
		Profesor[] profesores=InicializadorProfesores.getProfesores();
		String plantillaInsert;
		plantillaInsert="insert or ignore into profesores values (%d, '%s', %d) ";
		ArrayList<String> inserts=new ArrayList<String>();
		for (int i=0; i<profesores.length; i++){
			Profesor profesor=profesores[i];
			String insert=String.format(plantillaInsert, i+1,
					profesor.getNombre(), profesor.getHorasAImpartir()
			);
			inserts.add(insert);
		}
		this.ejecutarEnTransaccion(inserts);
	}
	public void crearTablaRepartos() throws IOException, SQLException{
		String rutaRecursoTablaRepartos="/recursos/sql_tabla_repartos";
		this.ejecutarSQL(rutaRecursoTablaRepartos);
	}
	public void crearTablaAsignaciones() throws IOException, SQLException{
		String rutaRecursoTablaAsignaciones="/recursos/sql_tabla_asignaciones";
		this.ejecutarSQL(rutaRecursoTablaAsignaciones);
	}
	public void ejecutarEnTransaccion(ArrayList<String> sentencias) throws SQLException{
		Statement sentencia=conexion.createStatement();
		
		for (String sql : sentencias){
			sentencia.addBatch(sql);
		}
		
		//Iniciamos la transaccion
		conexion.setAutoCommit(false);
		sentencia.executeBatch();
		conexion.commit();
		//Y la finalizamos
		conexion.setAutoCommit(true);
	}
	public void ejecutarSQL(String rutaRecurso) throws IOException, SQLException{
		String txt;
		txt=Utilidades.getRecurso(rutaRecurso);
		Statement sentencia=conexion.createStatement();
		sentencia.executeUpdate(txt);
	}
	public ArrayList<Profesor> getProfesores() throws SQLException{
		ArrayList<Profesor> profesores=new ArrayList<Profesor>();
		String sql="select id, nombre, horas from profesores";
		Statement sentencia=conexion.createStatement();
		sentencia.execute(sql);
		ResultSet resultados=sentencia.getResultSet();
		while(resultados.next()){
			int id			=	resultados.getInt(0);
			String nombre	=	resultados.getString(1);
			int horas		=	resultados.getInt(2);
			Profesor	p	=	new Profesor (id, nombre, horas);
			profesores.add(p);
		}
		return profesores;
	}
}
