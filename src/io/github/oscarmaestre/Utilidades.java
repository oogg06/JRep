package io.github.oscarmaestre;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Utilidades {
	public static String getRecurso(String nombreRecurso) throws IOException{
		InputStream is=System.class.getResourceAsStream(nombreRecurso);
		if (is==null){
			System.out.println("Recursos de tabla no cargados");
		}
		String txt=getFicheroComoString(is);
		return txt;
	}
	public static String getFicheroComoString(InputStream is) throws IOException{
		BufferedReader bfr=getBufferedReader(is);
		String textoFichero="";
		String linea=bfr.readLine();
		while (linea!=null){
			textoFichero+=linea;
			linea=bfr.readLine();
		}
		return textoFichero;
	}
	
	public static BufferedReader getBufferedReader(InputStream is){
		InputStreamReader isr=new InputStreamReader(is);
		BufferedReader bfr=new BufferedReader(isr);
		return bfr;
	}
}
