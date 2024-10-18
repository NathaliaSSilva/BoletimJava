public class UsaBoletim {
    public static void main(String[] args) throws Exception {
      
        Boletim b1 = new Boletim(10, 5);

        b1.imprimir();
        b1.calculaMedia();
        System.out.println(b1.VerificaConceito()); 
        
      
     
    }
}
