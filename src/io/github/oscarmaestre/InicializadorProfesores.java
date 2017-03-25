package io.github.oscarmaestre;

import java.util.ArrayList;

public class InicializadorProfesores {
	public static Profesor[] getProfesores(){
		Profesor[] profesores=new Profesor[10];
		
		profesores[0]	=	new Profesor (1, "Isabel"		, 18);
		profesores[1]	=	new Profesor (2, "Sole"			, 21);
		profesores[2]	=	new Profesor (3, "Fermin"		, 21);
		profesores[3]	=	new Profesor (4, "Oscar"		, 21);
		profesores[4]	=	new Profesor (5, "J.Manuel"		, 21);
		profesores[5]	=	new Profesor (6, "Javier"		, 21);
		profesores[6]	=	new Profesor (7, "Ricardo"		, 21);
		profesores[7]	=	new Profesor (8, "Eva"			, 21);
		profesores[8]	=	new Profesor (9, "Manuel"		, 21);
		profesores[9]	=	new Profesor (10,"Carmen"		, 21);
		
		return profesores;
	}
	public static ArrayList<Profesor> getArrayListProfesores(){
		Profesor[] profesores=getProfesores();
		ArrayList<Profesor> arrayList=new ArrayList<Profesor>();
		for (int i=0; i<profesores.length; i++){
			arrayList.add(profesores[i]);
		}
		return arrayList;
	}
}
