public class Boletim {
    double n1;
    double n2;

    public Boletim(){
    
    }
    public Boletim(float n1, float n2){
        this.n1 = n1;
        this.n2 = n2;
        
    }
    

    public void imprimir(){
        System.out.println("Nota n1: "+ n1 +"\nNota n2: "+n2);
    }

    public void calculaMedia(){
        double media = (n1+n2)/2;
        System.out.println(media);

    }

    

    String VerificaConceito(){
        if ((n1+n2)/2 >= 8) {
          String condicao = "A";
          return condicao;
        
        }

        if((n1+n2)/2 >= 6 && (n1+n2)/2 < 8  ){
            
            String condicao = "B";
            return condicao;
        }

        if((n1+n2)/2 >= 4 && (n1+n2)/2 < 6  ){
            
            String condicao = "C";
            return condicao;
        }
        else{
            String condicao = "D";
            return condicao;
        }

            
    }

}
