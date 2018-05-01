package horario;
import acm.program.*;
import acm.graphics.*;


public class Dibujo extends GraphicsProgram{
	
	private static final long serialVersionUID = 1L;

	public void run() {
		// cuadricula
		GLine lin1 = new GLine (40, 40, 40 , 500);
		add (lin1);
		GLine lin2 = new GLine (40 , 500 , 1200 , 500);
		add (lin2);
		GLine lin3 = new GLine (1200, 500, 1200, 40);
		add (lin3);
		GLine lin4 = new GLine (40, 40, 1200, 40);
		add (lin4);
		//particiones verticales
		GLine lin5 = new GLine ( 185, 40 , 185 , 500);
		add (lin5);
		GLine lin6 = new GLine (330 , 40, 330, 500);
		add(lin6);
		GLine lin7 = new GLine ( 475, 40 , 475 , 500);
		add (lin7);
		GLine lin8 = new GLine (620 , 40, 620, 500);
		add(lin8);
		GLine lin9 = new GLine ( 765, 40 , 765 , 500);
		add (lin9);
		GLine lin10 = new GLine (910 , 40, 910, 500);
		add(lin10);
		GLine lin11 = new GLine ( 1055, 40 , 1055 , 500);
		add (lin11);
		GLine lin12 = new GLine (1200 , 40, 1200, 500);
		add(lin12);
		//particiones horizontales
		GLine lin13 = new GLine (40 ,116 ,1200  , 116);
		add (lin13);
		GLine lin14 = new GLine (40, 192 , 1200, 192);
		add (lin14);
		GLine lin15 = new GLine (40, 268, 1200 , 268);
		add (lin15);
		GLine lin16 = new GLine (40, 344, 1200 , 344);
		add (lin16);
		GLine lin17 = new GLine (40, 420, 1200 , 420);
		add (lin17);
		//letreros de dias de la semana
		GLabel hora = new GLabel ("HORA", 100, 80);
		add (hora);
		GLabel lunes = new GLabel ("LUNES" ,240, 80 );
		add(lunes);
		GLabel martes = new GLabel ("MARTES", 380 , 80);
		add(martes);
		GLabel miercoles = new GLabel ("MIERCOLES", 510 , 80);
		add(miercoles);
		GLabel jueves = new GLabel ("JUEVES", 670, 80);
		add (jueves);
		GLabel viernes = new GLabel ("VIERNES", 800 , 80);
		add(viernes);
		GLabel sabado = new GLabel ("SABADO" , 950 , 80);
		add(sabado);
		//letreros de horas del día
		GLabel clasede7 = new GLabel ("CLASE DE 7 A 9AM", 60 , 160);
		add(clasede7);
		GLabel clasede9 = new GLabel ("CLASE DE 9 A 11AM",60, 240) ;
		add (clasede9);
		GLabel clasede11 = new GLabel ("CLASE DE 11 A 1PM", 60, 320);
		add(clasede11);
		GLabel clasede1= new GLabel ("CLASE DE 1 A 3PM", 60, 390);
		add(clasede1);
		GLabel clasede3 = new GLabel ("CLASE DE 3 A 5PM" , 60, 470);
		add(clasede3);
		//faltan los nombres de la asignatura y su respectiva franja horaria
		
	}
	
}