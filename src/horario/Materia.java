package horario;

public class Materia {
	private String nombre;
	private Dia dia;
	private int hora;
	
	public Materia (String name, Dia day, int hour) {
		nombre = name;
		dia = day;
		hora = hour;
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
	
	public String getNombre () {
		return nombre;
	}
	
	public Dia getDia () {
		return dia;
	}
	
	public int getHora () {
		return hora;
	}
}