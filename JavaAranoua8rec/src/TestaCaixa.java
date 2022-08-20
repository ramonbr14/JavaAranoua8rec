public class TestaCaixa {
   
    public static void main(String[] args) {
        //cria apenas uma referencia par a o objeto
        Caixa minhaCaixa;
        //cria efetivamente o objeto
        minhaCaixa = new Caixa();
        //Caixa minhaCaixa = new Caixa();
       
        minhaCaixa.altura = 8;
        minhaCaixa.largura = 2;
        minhaCaixa.profundidade = 3;
       
        System.out.println("altura:"+minhaCaixa.altura);
        System.out.println("largura:"+minhaCaixa.largura);
        System.out.println("profundidade:"+minhaCaixa.profundidade);
       
        minhaCaixa.volume();
        System.out.println();
        System.out.println("volume:"+minhaCaixa.volume(2,3,5));
        
        
        Caixa caixa2 = new Caixa();
        caixa2.defineDimensoes(2 , 3, 4);
        caixa2.volume();
        
        Caixa caixa3 = new Caixa(5, 6, 7);
        caixa2.volume();
        
        Caixa caixa4 = new Caixa(4);
        caixa4.volume();
        
        CaixaPeso cp = new CaixaPeso(2,3,4,5);
        cp.volume();
        System.out.println("PESO: "+cp.peso);
    }
}