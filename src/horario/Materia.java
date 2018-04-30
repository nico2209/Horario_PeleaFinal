package horario;

public class Materia {
	private static String nombre;
	private static Dia dia;
	private static int hora;
	
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