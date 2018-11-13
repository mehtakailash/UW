package cp120.assignments.assignment005;

public class Crypto{
	public static String encrypt( String str ) {
		StringBuffer b = new StringBuffer();
		StringBuffer b1 = new StringBuffer();
		int length = str.length();
		int remainder = length%3;
		int n =0;
		if(remainder==0 || length==0 ) {
			n=length+3;
		}
		else if(remainder==1) {
			n=length+2;
		}
		else if(remainder==2) {
			n=length+1;
		}
		char[] srcArray = null;
		// Add Padding.
		for (int i=0; i<length; i++) 
		{ 
		    char c = str.charAt(i);
		    b.append(c);
		}
		if (n>length) {
			for (int j=length; j<n; j++) 
			{ 
			    b.append('\u0000');
			}
		}
		else if (n==length) {
			for (int j=length; j<length+3; j++) 
			{ 
			    b.append('\u0000');
			}
		}
		else if (length==0) {
			for (int j=length; j<length+3; j++) 
			{ 
			    b.append('\u0000');
			}
		}
		
		// Rotate the groups to the right
		int bfrLength= b.length();
		srcArray = new char[bfrLength] ; 
		for (int k=0; k<bfrLength; k++) 
		{ 
			if(k<3)
			    srcArray[k]= b.charAt(bfrLength-3+k);
			else if (k<bfrLength)
				srcArray[k] = b.charAt(k-3);
		}

		// Increment each character by its position
		for (int l=0; l<bfrLength; l++) 
		{ 
			char c1 = srcArray[l];
			c1=(char) (c1+l);
			b1.append(c1);
		}
		return String.valueOf(b1); 		
	}
	
	public static String decrypt( String str ) {
		StringBuffer b1 = new StringBuffer();
		StringBuffer b2 = new StringBuffer();
		int length = str.length();
		//Subtracting the position of each character from its Unicode value
		for (int i=0; i<length; i++) 
		{ 
			char c1 = str.charAt(i);
			c1=(char) (c1-i);
			b1.append(c1);
		}

		// Rotate the groups to the left
		int bfrLength=b1.length();
		char[] srcArray = new char[bfrLength] ;
		for (int j=0; j<bfrLength; j++) 
		{ 
			if(j<3)
				srcArray[bfrLength-3+j]= b1.charAt(j);
			else if (j<bfrLength)
				srcArray[j-3] = b1.charAt(j);
		}

		// Remove padding
		for (char c: srcArray) 
		{ 
			b2.append(c);
		}
		
		return String.valueOf(b2);		
	}	
}