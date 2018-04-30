package horario;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Escritor {
	public void csv (Estudiante std) {
		try {
			PrintWriter archivo = new PrintWriter (new FileWriter("Horario.csv"));
			archivo.println("Hora,Lunes,Martes,Miercoles,Jueves,Viernes");
			for (int i = 0; i<std.horario.size(); i++) {
				int numComas;
				switch (std.horario.get(i).getDia()) {
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
				archivo.println(comas + std.horario.get(i).getNombre());
			}
			archivo.close();
		} catch (IOException e) {
			System.out.println("No se ha podido generar el archivo.");
		}
	}
}