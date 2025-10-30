package h2;

public class H2_main {
	public static void main (String[] args) { 
		int i=5;
		int j=10;
		int k=7;
		int min=3;
		int max=15;
		
	if (i<j && i<k) {
		min=i;
	} else if(k<i && k<j) {
		min=k;
	} else {
		min=j;
	}
	
	if (i>j && i>k) {
		max=i;
	} else if (k>i && k>j) {
		max=k;
	} else {
		max=j;
	}
		System.out.println(max);
		System.out.println(min);
	}
}
