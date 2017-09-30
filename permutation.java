package program2;

import java.util.Arrays;

public class permutation {
	public static void permutation(String str) { 
	    permutationfn("", str); 
	}

	private static void permutationfn(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	            permutationfn(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}
	public static void main(String[] args) {
		permutation a=new permutation();
		a.permutationfn("","AACE");
	}
	
}

	