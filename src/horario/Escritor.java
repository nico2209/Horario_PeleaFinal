package horario;

import java.io.*;
import java.util.ArrayList;

public class Escritor {
	public void csv (ArrayList<Materia> horario) {
		try {
			PrintWriter archivo = new PrintWriter (new FileWriter("Horario.csv"));
			archivo.println("Hora,Lunes,Martes,Miercoles,Jueves,Viernes");
			for (int i = 0; i<horario.size(); i++) {
				int numComas;
				switch (horario.get(i).getDia()) {
					case LUNES: numComas = 0; break;
					case MARTES: numComas = 1; break;
					case MIERCOLES: numComas = 2; break;
					case JUEVES: numComas = 3; break;
					default: numComas = 4; break;
				}
				String comas = "";
				for (int j = 0; j<numComas; j++) {
					comas += ",";
				}
				archivo.println(comas + horario.get(i).getNombre());
			}
			archivo.close();
		} catch (IOException e) {
			System.out.println("No se ha podido generar el archivo.");
		}
	}
}