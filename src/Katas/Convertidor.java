package Katas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.sun.javafx.collections.MappingChange.Map;

public class Convertidor {
    
	public static String convertir(int numero) 
	{   
		String[] roman = {"","l","ll","lll","lV","V","Vl","Vll","Vlll","lX","X","XL","L","C","CD","D"};
		String num = "";
		
	
	    int size = String.valueOf(numero).length();
		switch(size) 
		{ 
              
		case 1:
		     num = ConvertidorUnDigito(numero,roman);
	     	break;
	     	
		   case 2: 
			   
			   
			    
			   num =ConvertidorDosDigitos(numero,roman); 
			    
			break; 
			
			
			
		   case 3:
	          
			  num =ConvertidotTresDigitos(numero,roman);  
			    
			   break;
			   
			   
			
		   default :
			   
			   num ="error";
			   break;
			   
		}
	    
	  		
		
		return num;
	}
	
	public static String ConvertidorUnDigito(int numero, String [] roman) 
	{
         String num ="";   
	
		 for (int i =0 ; i<roman.length;i++) 
			{
				if(numero == i) 
				{
					num=roman[i];	
				}
				
			}
     return num;
	}
	
   
	
	public static String ConvertidorDosDigitos(int numero, String [] roman) 
	   
	{  
		
		
		
		String nums = new Integer(numero).toString();
		nums.toCharArray();		   
		char[] aCaracteres = nums.toCharArray();
		   
        String numero1=Character.toString(aCaracteres[0]);   		    
	    String numero2 =Character.toString(aCaracteres[1]);  
		   
	    String num="";
	    
		    switch(numero1) 
		    {
		       case "1":
		    	   num = roman[10];
		    	   break;
		       
		       case "2":
		    	   num = roman[10] + roman[10];
		          break;
		          
		       case "4":
		    	   num = roman[11];
		          break;
		       
		       case "5":
		    	   num = roman[12];
		    	   
		    	 break;
		    	 			    	 
		    	 
		    	   
		    }
		    
		    num = num + ConvertidorUnDigito(Integer.parseInt(numero2),roman);
		    
		
	  return num;	
	}
	
	
	public static String ConvertidotTresDigitos(int numero ,String [] roman) 
	{
		
		  String nums1 = new Integer(numero).toString();
		   
          nums1.toCharArray();
			   		   
		  char[] aCaracteres1 = nums1.toCharArray();
		   
          String numer1=Character.toString(aCaracteres1[0]);   		    
		  String numer2 =Character.toString(aCaracteres1[1]);  
		  String numero3 =Character.toString(aCaracteres1[2]);  
		  
		   	
		  String num ="";
		  
		    switch(numer1) 
		    {
		       case "1":
		    	   num = roman[13];
		    	  
		    	   break;
		       
		       case "2":
		    	   num = roman[13] + roman[13];
		          break;
		          
		       case "4":
		    	   num = roman[14];
		          break;
		       
		       case "5":
		    	   num = roman[15];
		    	   
		    	 break;
		    	 			    	 
		    	 
		    	   
		    }   
		    
		   String dos=numer2+numero3;      	 
		   num = num + ConvertidorDosDigitos(Integer.parseInt(dos),roman);
		    
		return num;
		
	}
	
}
