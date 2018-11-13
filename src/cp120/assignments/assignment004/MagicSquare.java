package cp120.assignments.assignment004;

import java.util.Scanner;

public class MagicSquare {

private static Scanner sc;

    public static void main( String[] args ){
        System.out.print("Enter a 2d square integer matrix : \n");
        sc = new Scanner(System.in);
        int rows=sc.nextInt();
        int columns=sc.nextInt();
        
        System.out.println(" Number separated by a single space, rows separated by a new line. \n The last line is a blank line: \n");    
         
        int twoDPrimArray[][]=new int[rows][columns];
         
           
         for(int i=0; i<rows;i++)
          {            
             for(int j=0; j<columns;j++)
             {
            	 twoDPrimArray[i][j]=sc.nextInt();
             }
          }
         System.out.print("\nData you entered : \n");
         for(int []x:twoDPrimArray){
             for(int y:x){
             System.out.print(y+"        ");
             }
             System.out.println();
         }
         
         boolean isItMagic = isItMagic(twoDPrimArray);
         if(isItMagic)
        	 System.out.println("It's a magic sqare!.");
         else 
        	 System.out.println("Just a boring square.");
         
     } 
    
    public static boolean isItMagic(int[][] square) {
    	   int sum =0;
    	   int n = sumOfRow(square[0]);
    	   for(int i = 0; i < square.length; i++){
    	      n = sumOfRow(square[i]);
    	      for(int[] row: square){
    	         sum = sumOfRow(row);
    	      }
    	      if(sum != n){
    	         return false;
    	      }
    	   }
    	   //columns
    	   for(int i = 0; i<square.length; i++){
    	      sum = 0;
    	      for(int j = 0; j<square.length; j++){
    	         sum += square[i][j];
    	      }
    	      if(sum != n){
    	         return false;
    	      }
    	   }
    	   //top left to right bottom
    	   sum = 0;
    	   for(int i = 0; i<square.length; i++){
    	      sum += square[i][i];
    	   }
    	   if(sum != n){
    	      return false;
    	   }
    	   //top right to bottom left
    	   sum = 0;
    	   for(int i = 0; i < square.length; i++){
    	      sum += square[i][square.length -1 - i];
    	   } 
    	   if(sum != n){
    	      return true;
    	   }
		return true;
    }
    private static int sumOfRow(int[] row){
        int sum = 0;
        for(int el: row){
           sum += el;
        }
        return sum;  
     }
}