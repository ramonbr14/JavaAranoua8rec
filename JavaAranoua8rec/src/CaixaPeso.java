
public class CaixaPeso extends Caixa {
	//variavcel de instancia DESSA classe
	double peso;
	
	//Construtor
	public CaixaPeso(double altura, double largura, double profundidade, double peso) {
		super(altura,largura,profundidade);
		
		this.peso = peso;
	}
}
