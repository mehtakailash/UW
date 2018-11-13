package cp120.assignments.assignment004;

import java.util.Random;

public class RaggedArrays {

    public static void main( String[] args ){
    	
    	createRaggedArray();
    	createRandomRagged();
    }
    
    public static void createRaggedArray() {
    	
    	int[][] raggedArray = {  
    							{ 0, 1, 2 },

    							{ 0, 1, 2, 3, 4, 5 },

    							{ 0, 1, 2, 3, 4 },

    							{ 0, 1 },

    							{ 0, 1, 2, 3 }
    						   };
    	for ( int i = 0; i < raggedArray.length; i++ ) {
    		for ( int j = 0; j < raggedArray[i].length; j++ )
    		System.out.print( raggedArray[i][j] + " "); // print element
    		System.out.println(); 						// print new row
    		System.out.println(); 						// print new row
    		}
    }
    
    public static void createRandomRagged(){
    	Random randy = new Random(1);                   // seed of 1
        
    	char[][] randomRaggedArray =  new char[10][10];
    	
    	for ( int i = 0; i < randomRaggedArray.length; i++ ) {
    		int column = randy.nextInt( 10 ) + 1;
    		for ( int j = 0; j < column; j++ )
    			randomRaggedArray[i][j]='X'; // Assign X 						
    		}
    	for ( int i = 0; i < randomRaggedArray.length; i++ ) {
    		for ( int j = 0; j < randomRaggedArray[i].length; j++ )
    		System.out.print( randomRaggedArray[i][j] + " "); // print element
    		System.out.println(); 							  // print new row
    		System.out.println(); 							  // print new row
    		}
    	
    }
}
