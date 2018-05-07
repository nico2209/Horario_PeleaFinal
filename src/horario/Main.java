package horario;

import java.io.*;
import java.util.*;
import acm.program.*;

public class Main extends ConsoleProgram {

	public void run() {
		inscribirMaterias();
		for (Materia materia : materiasTotales) {
			switch (materia.getDia()) {
			case LUNES: materiasLunes.add(materia); break;
			case MARTES: materiasMartes.add(materia); break;
			case MIERCOLES: materiasMiercoles.add(materia); break;
			case JUEVES: materiasJueves.add(materia); break;
			default: materiasViernes.add(materia);
			}
		}
		inscribirEstudiantes();
	}
	
	public void inscribirMaterias()
	{
		materiasTotales = new ArrayList<Materia>();
		String will_beSubject = "Y";
		Dia dia_Dios = Dia.valueOf("LUNES");
		
		while(true)
		{
			String nombre_Dios = readLine("Nombre de la materia: ").toUpperCase();
			try{
				dia_Dios = Dia.valueOf(readLine("Dia de la semana: ").toUpperCase());
			} catch (IllegalArgumentException e) {
				println ("Por favor ingrese un día de la semana válido.");
				continue;
			}
			int hora_Dios = readInt("Ingrese la hora que será dictada la materia: ");
			int semestre_Dios = readInt("Ingrese el semestre al que corresponde la materia: ");
			materiasTotales.add(new Materia(nombre_Dios, dia_Dios, hora_Dios, semestre_Dios));

			will_beSubject = readLine("¿Desea crear una nueva materia? Y/N ");
			if(will_beSubject.equals("n") || will_beSubject.equals("N"))
			{
				print("Proceso finalizado.");
				break;
			}		
		}			
			println(materiasTotales.toString());			
	}
	
	public void inscribirEstudiantes () {
		
	}
	
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
	
	ArrayList<Materia> materiasTotales;
	ArrayList<Materia> materiasLunes;
	ArrayList<Materia> materiasMartes;
	ArrayList<Materia> materiasMiercoles;
	ArrayList<Materia> materiasJueves;
	ArrayList<Materia> materiasViernes;
}