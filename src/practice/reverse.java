package practice;

public class reverse {
	
	public static void main(String[] args){
	int x = -4321;
		String str = Integer.toString(Math.abs(x));
		StringBuilder y  = new StringBuilder(str);
        int n = y.length();    
        int i =0;
        int j = n-1;
        while(j>i){
        	 char a = y.charAt(j);
        	 char b = y.charAt(i);
         	y.setCharAt(i, a); 
         	y.setCharAt(j, b);
         	i++;
         	j--;
        }
        
        
    
    if(x<0){
        System.out.println("-"+y);
    }
    else{
    	System.out.println(y);
    }

}
}