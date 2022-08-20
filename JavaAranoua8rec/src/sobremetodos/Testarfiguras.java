package sobremetodos;

import javax.swing.JOptionPane;

public class Testarfiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Triangulo triangulo = new Triangulo(5,10);
		JOptionPane.showConfirmDialog(null, "A area é:" + triangulo.area());
		
		Retangulo retangulo = new Retangulo(2,4);
		JOptionPane.showConfirmDialog(null, "A area é:" + retangulo.area());
		
		Figura2D ret = new Retangulo(23,56);
		Figura2D tri = new Triangulo(56,23);
		
	}

}
