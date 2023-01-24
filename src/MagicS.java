import java.util.Scanner;

public class MagicS {

    private int n;
    private int[][] matrix;

    public MagicS() {
    }
    
    public void read(){

        Scanner read = new Scanner(System.in);
        int check = 1;

        System.out.println("Hola.\nInserta un número entero, impar y positivo");

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

    }

    public void fillMatrix(){
        
        matrix = new int[n][n];
        int number = 1, row = 0, col = n/2;

        while(number <= n*n){

            matrix[row][col] = number;
            number++;

            //Navigating
            int rw = row;
            int cl = col;

            row--; 
            col++; 

            //Setting position
            if(row == -1){
                row = n-1;
            }
            if(col == n){
                col = 0;
            }

            //In case of being successor of a multiple of N
            if((matrix[row][col] - 1) % n == 0){
                row = rw + 1;
                col = cl;
            }
        }

        //Printing matrix
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){
                
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }

    }

}
