import java.util.Scanner;

/*n es entero positivo e impar
 * El cuadrado mágico es una matriz cuadrada de orden n, va del 1 a n*n
 * La suma de cualquiera de las filas y columnas es la misma
 * 
*/

public class Array {

    private int n;
    private int[][] matrix = new int[n][n];

    public Array() {
    }
    
    private int read(){

        Scanner read = new Scanner(System.in);
        int check = 1;

        System.out.println("Hola.\nInserta un número entero impar y positivo");

        do{
           n = read.nextInt(); 

           if(n % 2 == 0 || n < 0 || n % 1 != 0){
            System.out.println("\nError, asegúrate de que el número que ingresaste sea entero, impar y positivo");
            check = 0;
           }
           else{
            check = 1;
           }

        }while(check == 0);
       
        return n;
    }

    private void fillMatrix(){
        
    }
}
