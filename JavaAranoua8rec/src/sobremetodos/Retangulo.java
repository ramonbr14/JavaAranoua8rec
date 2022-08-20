package sobremetodos;

import javax.swing.JOptionPane;

public class Retangulo extends Figura2D {
	//Construtores
	public Retangulo(double base, double altura) {
		super(base, altura);
		
	}
	
	public double area(double altura, double base) {
		return JOptionPane.showConfirmDialog(null, "Canculando area: "+ altura*base);
		
	}
	
	public double area() {
		return getAltura()*getBase();
		//return JOptionPane.showInternalConfirmDialog(null,"A AREA DO RETANGULO É: "+getAltura()*getBase(),"Retangulo Resultado", 0);
		
	}
	
	
	

}
