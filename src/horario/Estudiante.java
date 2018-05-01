package horario;

import java.util.ArrayList;

public class Estudiante {
	public Estudiante(ArrayList<Materia> schedule) {
		horario = schedule;
	}
	public ArrayList<Materia> horario;
}