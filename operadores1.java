import java.util.Scanner;

/**
 * operadores1
 */
public class operadores1 {

     public static void main(String[] args) {
          

          double nota1 = 9.0;
          double nota2 = 10;

          double media;

          media = (nota1 + nota2)/2;

          System.out.println(media);

          /* recebendo um valor e usando o mesmo para calcular */

          int valor;

          /* Scanner read = new Scanner(System.in);

          System.out.println("Digite um valor inteiro:\n");
          valor = read.nextInt(); */

          try (Scanner read = new Scanner(System.in)) {
               System.out.println("Digite um valor inteiro:\n");
               valor = read.nextInt();
          }

          System.out.println(valor/2);
          System.out.println(valor%2);

     }
}