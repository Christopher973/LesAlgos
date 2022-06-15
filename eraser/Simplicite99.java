package eraser;

import java.util.ArrayList;
import java.util.Arrays;

public class Simplicite99 {
    public static String erase(String str) {

		ArrayList<String> Astr  = convertisseur(str);
		String str2 = "";
		int somme = 0;
        int j =0; 
        
		 for(int i =0 ;i<Astr.size();i++) {
	        	if(Astr.get(i).equals(" ")) {
	        		j = i;
	        		while(Astr.get(j).equals(" ")) {
	        			j += 1;
	        			somme += 1;
	        		}
	        		if(somme==1) {
	        			Astr.set(i, "~");
	        			somme = 0;
	        			i +=1;
	        			j=0;
	        		}else {
	        			somme = 0;
	        			i=j-1;
	        			j=0;
	        		}
	        	}
	        }
		 for(int i =0 ;i<Astr.size();i++) {
			 if(Astr.get(i).equals("~")) {
				 Astr.remove(i);
				 i-=1;
			 }else {
				 str2 += Astr.get(i);
			 }
		 }
		return str2;
    }
	
	
	
	
	public static ArrayList<String> convertisseur (String str){
		
		String[] strSplit = str.split("");
		
		ArrayList<String> strList = new ArrayList<String>(
	            Arrays.asList(strSplit));
		
		return strList;
	}
}
