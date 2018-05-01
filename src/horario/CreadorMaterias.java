package horario;

import java.util.ArrayList;
import acm.program.*;

public class CreadorMaterias extends ConsoleProgram {

	private static final long serialVersionUID = 1L;

		public void run()
		{
			ArrayList<Materia> materias = new ArrayList<Materia>();
			String will_beSubject = "Y";
			int i = 0 ;
			
			while(true)
			{
				String nombre_Dios = readLine("Nombre de la materia ");
				Dia dia_Dios = Dia.valueOf(readLine("dia de la semana:  ").toUpperCase());
				int hora_Dios = readInt("ingrese la hora que va hacer dictada la materia: ");
				materias.add(new Materia(nombre_Dios , dia_Dios , hora_Dios));
				i++;

				will_beSubject = readLine("Quiere crear una materia? Y/N ");
				if(will_beSubject.equals("n") || will_beSubject.equals("N"))
				{
					print("Proceso cancelado");
					break;
				}		
			}			
				println(materias.toString());			
		}
	}