import java.util.Scanner;
public class conversor {
    
        
    public static void main(String[] args) {
         
         
         //entrada 
         
         Scanner teclado = new Scanner(System.in);
         System.out.println ("digite o valor de c: ");
         float temperatura_c = teclado.nextFloat();
         
         
         //processamento
         
        float temperatura_f = ((temperatura_c * 9 ) / 5) + 32;
         
         
         //saida 
         
         
         System.out.println("o valor de celsius é: " + temperatura_c);
         System.out.println("o valoR de farenheit  é: " + temperatura_f);
    }
}