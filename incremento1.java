public class incremento1 {
     
     public static void main(String[] args) {
          
          int num1, num2;

          num1 = 6;
          num2 = 6;
          
          System.out.println(num1);
          System.out.println(num2);

          // mostra primeiro e adiciona depois
          System.out.println(num1++);

          // adiciona primeiro e mostra depois
          System.out.println(++num2);

          //                 (1 + 7) - 7
          System.out.println(++num1 - num2++);
          // mostra e depois => num2 +1
          System.out.println(num2);
     }

}
