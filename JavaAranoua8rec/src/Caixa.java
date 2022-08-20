import javax.swing.JOptionPane;

public class Caixa {
    //variáveis de instância
    double largura;
    double altura;
    double profundidade;
    
    
    public Caixa() {}
    
    public Caixa(double altura, double largura, double profundidade){
    	defineDimensoes(altura, largura, profundidade);
    }
    
    public Caixa(double l) {
    	altura = largura = profundidade = l;
    }

   
    
   	//método sem retorno e sem parametros
    public void volume() {
        double  vol;
       
        vol = altura*largura*profundidade;
       
        System.out.println("volume da caixa:"+vol);
        JOptionPane.showMessageDialog(null, "o Volume total é: "+ vol+ "M³");
    }
   
    //metodos com retorno e comp parametros
    public double volume(double a, double l, double p) {
        return a*l*p;
    }
    
    public void defineDimensoes(double a, double l, double p) {
    	this.altura = a;
    	this.largura = l;
    	this.profundidade = p;
    }
	
}