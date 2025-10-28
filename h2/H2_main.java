package h2;

public class H2_main {
	public static void main (String[] args) { 
		int i=5;
		int j=10;
		int k=7;
		int min=3;
		int max=15;
		
		if (i>j && j>k){
			 
			min=k;
			max=i;
			
		
		}else if (j>i && i>k) {
		
			min=k;
			max=j;
				
		}else if (j>k && k>i) {
			
				
				min=i;
				max=j;

    }else if (k>i && i>j) {
    	
    	min=j;
    	max=k;
    }
		System.out.println(max);
		System.out.println(min);
	}
}
