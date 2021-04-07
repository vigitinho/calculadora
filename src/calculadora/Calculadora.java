package calculadora;
import java.util.Scanner;

public class Calculadora {

  public static void main(String[] args) {
  double n1, n2;
  double Soma, Subtração, Multiplicação, Divisão, raiz;
  int mod; 
  Scanner entrada = new Scanner(System.in);

  System.out.println("informe o primeiro valor: ");
  n1 = entrada.nextDouble();
      System.out.println("Você quer a raiz quadrada desse numero?");
 
  System.out.println("Se sim digite 0");
      
  System.out.println("Informe o segunda valor:  ");
  n2 = entrada.nextDouble();

 

System.out.println(" SELECIONE UMA OPERAÇÃO ");
System.out.println("[1] + "); 
System.out.println("[2] - ");
System.out.println("[3] * ");
System.out.println("[4] / ");
System.out.println("[5] √ ");
System.out.println(" Digite aqui a aperação que deseja ser realizada: ");
mod = entrada.nextInt();

switch(mod) {
    case 1:
    Soma = n1+n2;
        System.out.println("A soma será:"+ Soma);
    break;

    case 2:
    Subtração = n1-n2;
        System.out.println("A subtração será:"+ Subtração);
        break;

    case 3:
    Multiplicação = n1*n2;
        System.out.println("A multiplicação será:"+ Multiplicação);
        break;

    case 4:
    if(n1<n2){
        System.out.println("Impossivel de realizar o calculo");
        break;
    }
    else{
        Divisão = n1/n2;
        System.out.println("A divisão será:"+ Divisão);
    }
    break;
    case 5:

    raiz = Math.sqrt(n1);
        System.out.println("A raiz quadrada será:"+ raiz);

    ;
}
}
}