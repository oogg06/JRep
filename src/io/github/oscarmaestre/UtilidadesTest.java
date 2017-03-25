package io.github.oscarmaestre;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class UtilidadesTest {

	@Test
	public void test() throws IOException {
		String txt;
		
		txt=Utilidades.getRecurso("/recursos/sql_tabla_modulos");
		System.out.println(txt);
	}

}
