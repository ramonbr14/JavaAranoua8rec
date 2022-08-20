package sobremetodos;

public class Figura2D {
	//Variáreis double
	private double base;
	private double altura;
	
	//Construtores
	public Figura2D(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public Figura2D() {
	}
	
	public void areaVoid() {
		double area = base * altura;
	}
	
	public double area() {
		return 0;
	}

	
	//Métodos Getter e Setter
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
}
