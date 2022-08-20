package sobremetodos;

import javax.swing.JOptionPane;

public class Triangulo extends Figura2D {

	public Triangulo(double base, double altura) {
		super(base, altura);
	
	}
	
	public double area() {
		//JOptionPane.showConfirmDialog(null, "Calculando area do triangulo", "AREA DO TRIANGULO",JOptionPane.INFORMATION_MESSAGE);
		return (getAltura()*getBase()/2);
	}
	
}
