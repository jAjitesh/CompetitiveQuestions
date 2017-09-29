package practice;

public class practice1 {
	

	
		public static void main(String[] args){
			int[] ar={2,4,6,8,3};
			 for ( int i=1; i<ar.length; i++){
		           int hole = i - 1;
		        while (hole >= 0 && ar[hole+1] > ar[hole]) {
		           
		                int x = ar[hole];
		                ar[hole] = ar[hole+1];
		                ar[hole+1] = x;
		            
		            hole = hole -1;
		        }
		        for(int j=0;j<=ar.length-1;j++){
					System.out.print(ar[j]);
				} 
		        System.out.print('\n');
		    }
		
		}}

	
