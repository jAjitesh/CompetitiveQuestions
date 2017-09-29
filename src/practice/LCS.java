package practice;

public class LCS {

	public static void main(String[] args) {
		    String[] strs = {"apple","ape","april","apron"};    
		    int min = Integer.MAX_VALUE;
		        String minStr = "";
		        int minPos = 0;
		        for(int i=0; i<strs.length; i++){
		            if(strs[i].length() < min){
		            min = strs[i].length();
		                minStr = strs[i];
		                }
		        }
		        for(int i=0; i<min; i++){
		            if(strs[0].charAt(i) != minStr.charAt(i)){
		                 minPos = i;
		                break;
		            }
		        }
		        String finalStr="";
		        for(int i=0; i<minPos; i++){
		            char a = minStr.charAt(i);
		        	finalStr = finalStr+a;
		        }
		   System.out.println(finalStr);
		    }
	}


