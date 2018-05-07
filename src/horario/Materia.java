package horario;

public class Materia {
	private String nombre;
	private Dia dia;
	private int hora;
	private int semestre;
	
	public Materia (String name, Dia day, int hour, int semester) {
		nombre = name;
		dia = day;
		hora = hour;
		semestre = semester;
	}
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public void setDia (Dia dia) {
		this.dia = dia;
	}
	
	public void setHora (int hora) {
		this.hora = hora;
	}
	
	public void setSemestre (int semestre) {
		this.semestre = semestre;
	}
	
	public String getNombre () {
		return nombre;
	}
	
	public Dia getDia () {
		return dia;
	}
	
	public int getHora () {
		return hora;
	}
	
	public int getSemestre () {
		return semestre;
	}
	
	public String toString () {
		return (nombre + ": " + dia + "-" + hora + ". Semestre " + semestre);
	}
}