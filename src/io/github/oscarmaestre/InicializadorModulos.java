package io.github.oscarmaestre;

import java.util.ArrayList;

public class InicializadorModulos {
	public static ArrayList<Modulo> getArrayListModulos(){
		ArrayList<Modulo> modulosArray = new ArrayList<Modulo>();
		Modulo[] modulos=getModulos();
		for (int i=0; i<modulos.length; i++){
			modulosArray.add(modulos[i]);
		}
		return modulosArray;
	}
	public static Modulo[] getModulos(){
		Modulo[] modulos=new Modulo[41];
		Modulo m30 = new Modulo(30, 486, 7,"Acceso a datos.", "DAM_2");
		modulos[0]=m30;
		Modulo m63 = new Modulo(63, 255, 3,"Administración de sistemas gestores de bases de datos", "ASIR_2");
		modulos[1]=m63;
		Modulo m35 = new Modulo(35, 228, 6,"Aplicaciones web.", "SMIR_1");
		modulos[2]=m35;
		Modulo m43 = new Modulo(43, 228, 6,"Aplicaciones web.", "SMIRE_1");
		modulos[3]=m43;
		Modulo m1 = new Modulo(1, 484, 6,"Bases de datos.", "DAW_1");
		modulos[4]=m1;
		Modulo m12 = new Modulo(12, 484, 6,"Bases de datos.", "DAWE_1");
		modulos[5]=m12;
		Modulo m23 = new Modulo(23, 484, 6,"Bases de datos.", "DAM_1");
		modulos[6]=m23;
		Modulo m7 = new Modulo(7, 613, 9,"Desarrollo web en entorno servidor.", "DAW_2");
		modulos[7]=m7;
		Modulo m18 = new Modulo(18, 613, 6,"Desarrollo web en entorno servidor.", "DAWE_2");
		modulos[8]=m18;
		Modulo m8 = new Modulo(8, 396, 3,"Despliegue de aplicaciones web.", "DAW_2");
		modulos[9]=m8;
		Modulo m19 = new Modulo(19, 396, 3,"Despliegue de aplicaciones web.", "DAWE_2");
		modulos[10]=m19;
		Modulo m5 = new Modulo(5, 487, 3,"Entornos de desarrollo.", "DAW_1");
		modulos[11]=m5;
		Modulo m16 = new Modulo(16, 487, 3,"Entornos de desarrollo.", "DAWE_1");
		modulos[12]=m16;
		Modulo m27 = new Modulo(27, 487, 3,"Entornos de desarrollo.", "DAM_1");
		modulos[13]=m27;
		Modulo m11 = new Modulo(11, 619, 3,"Formación en centros de trabajo.", "DAW_2");
		modulos[14]=m11;
		Modulo m22 = new Modulo(22, 619, 3,"Formación en centros de trabajo.", "DAWE_2");
		modulos[15]=m22;
		Modulo m29 = new Modulo(29, 619, 3,"Formación en centros de trabajo.", "DAM_2");
		modulos[16]=m29;
		Modulo m65 = new Modulo(65, 619, 3,"Formación en centros de trabajo.", "ASIR_2");
		modulos[17]=m65;
		Modulo m58 = new Modulo(58, 250, 4,"Gestión de bases de datos.", "ASIR_1");
		modulos[18]=m58;
		Modulo m62 = new Modulo(62, 254, 5,"Implantación de aplicaciones web", "ASIR_2");
		modulos[19]=m62;
		Modulo m4 = new Modulo(4, 251, 4,"Lenguajes de marcas y sistemas de información.", "DAW_1");
		modulos[20]=m4;
		Modulo m15 = new Modulo(15, 251, 4,"Lenguajes de marcas y sistemas de información.", "DAWE_1");
		modulos[21]=m15;
		Modulo m26 = new Modulo(26, 251, 4,"Lenguajes de marcas y sistemas de información.", "DAM_1");
		modulos[22]=m26;
		Modulo m59 = new Modulo(59, 251, 4,"Lenguajes de marcas y sistemas de información.", "ASIR_1");
		modulos[23]=m59;
		Modulo m56 = new Modulo(56, 248, 6,"Planificación y administración de redes.", "ASIR_1");
		modulos[24]=m56;
		Modulo m33 = new Modulo(33, 490, 3,"Programación de servicios y procesos.", "DAM_2");
		modulos[25]=m33;
		Modulo m32 = new Modulo(32, 489, 5,"Programación multimedia y dispositivos móviles.", "DAM_2");
		modulos[26]=m32;
		Modulo m3 = new Modulo(3, 485, 6,"Programación.", "DAW_1");
		modulos[27]=m3;
		Modulo m14 = new Modulo(14, 485, 6,"Programación.", "DAWE_1");
		modulos[28]=m14;
		Modulo m25 = new Modulo(25, 485, 6,"Programación.", "DAM_1");
		modulos[29]=m25;
		Modulo m28 = new Modulo(28, 492, 0,"Proyecto de desarrollo de aplicaciones multiplataforma.", "DAM_2");
		modulos[30]=m28;
		Modulo m10 = new Modulo(10, 398, 0,"Proyecto de desarrollo de aplicaciones web.", "DAW_2");
		modulos[31]=m10;
		Modulo m21 = new Modulo(21, 398, 0,"Proyecto de desarrollo de aplicaciones web.", "DAWE_2");
		modulos[32]=m21;
		Modulo m38 = new Modulo(38, 149, 6,"Redes locales.", "SMIR_1");
		modulos[33]=m38;
		Modulo m46 = new Modulo(46, 149, 6,"Redes locales.", "SMIRE_1");
		modulos[34]=m46;
		Modulo m37 = new Modulo(37, 150, 5,"Seguridad informática.", "SMIR_2");
		modulos[35]=m37;
		Modulo m45 = new Modulo(45, 150, 3,"Seguridad informática.", "SMIRE_2");
		modulos[36]=m45;
		Modulo m64 = new Modulo(64, 378, 5,"Seguridad y alta disponibilidad", "ASIR_2");
		modulos[37]=m64;
		Modulo m61 = new Modulo(61, 253, 7,"Servicios de red e internet.", "ASIR_2");
		modulos[38]=m61;
		Modulo m36 = new Modulo(36, 151, 6,"Servicios en red.", "SMIR_2");
		modulos[39]=m36;
		Modulo m44 = new Modulo(44, 151, 4,"Servicios en red.", "SMIRE_2");
		modulos[40]=m44;
		return modulos;
	}
}
