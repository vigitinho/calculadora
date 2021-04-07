
package calculadora;
import java.util.Scanner;

public class CaixaDAgua {
  
    public static void main(String[] args){
    double l1, l2;
    double Resultado;
    
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Quantos litros possui sua caixa D'Água?");
    l1 = entrada.nextDouble();
    
    System.out.println("Quantos litros ela possui agora?");
    l2 = entrada.nextDouble();
    
    Resultado = l1-l2;
            System.out.println("Sua caixa ainda possui " + Resultado+ " Litros restantes.");
    
            
            
    if(l1<l2){    
        System.out.println("Sua caixa D'Água esta cheia");        
    }
   }              
}
