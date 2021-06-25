package com.inforcap.codingdojo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Rompecabezas {

	public ArrayList<Integer> sumNumMay(ArrayList<Integer> array, ArrayList<Integer> arrayAux) {
		//3,5,1,2,7,9,8,13,25,32
		array.add(3);
		array.add(5);
		array.add(1);
		array.add(2);
		array.add(7);
		array.add(9);
		array.add(8);
		array.add(13);
		array.add(25);
		array.add(32);	
		
		int sum = 0;			
	    for (int i = 0; i < array.size(); i++) {				        
	            sum+=array.get(i);		
	    }			
	    System.out.println(sum);
	    	    		
	    for (int i = 0; i < array.size(); i++) {
	        if(array.get(i) > 10){		
	        	arrayAux.add(array.get(i));
	        }		
	    }			
	    return arrayAux;		
	}

	public ArrayList<String> nomPersonas(ArrayList<String> array, ArrayList<String> arrayAux) {
		//Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa
		array.add("Nancy");
		array.add("Jinichi");
		array.add("Fujibayashi");
		array.add("Momochi");
		array.add("Ishikawa");
		
		Collections.shuffle(array);
		System.out.println(array);
		
		for (int i = 0; i < array.size(); i++) {			
			if(array.get(i).length() > 5){		
	        	arrayAux.add(array.get(i));
	        }
		}		
		return arrayAux;
	}

	public void letrasAbece(ArrayList<String> array) {
		array.add("a");
		array.add("b");
		array.add("c");
		array.add("d");
		array.add("e");
		array.add("f");
		array.add("g");
		array.add("h");
		array.add("i");
		array.add("j");
		array.add("k");
		array.add("l");
		array.add("m");
		array.add("n");
		array.add("o");
		array.add("p");
		array.add("q");
		array.add("r");
		array.add("s");
		array.add("t");
		array.add("u");
		array.add("v");
		array.add("w");
		array.add("x");
		array.add("y");
		array.add("z");
		
		Collections.shuffle(array);
		//System.out.println(array);
		System.out.println(array.get(array.size()-1));
		System.out.println(array.get(0));
		if(array.get(0) == "a" || array.get(0) == "e" || array.get(0) == "i" || array.get(0) == "o" || array.get(0) == "u")
		{
			System.out.println("La primera letra del arreglo es una vocal");
		}
	}

	public ArrayList<Integer> numAleatorios(ArrayList<Integer> array, Random r, int num1, int num2) {
		
		for (int i = 0; i < 10; i++) {
			array.add(r.nextInt(num2 - num1 + 1) + num1);	
		}
		return array;
	}

	public ArrayList<Integer> numAleatOrdMinMax(ArrayList<Integer> arrayAux, Random r, int num1, int num2) {
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			array.add(r.nextInt(num2 - num1 + 1) + num1);	
		}
		Collections.sort(array);
		System.out.println(array);
		
	    int valorMin = array.get(0);
	    int valorMax = array.get(0);
	    
	    for (int i = 0; i < array.size(); i++) {			
	        if(array.get(i) > valorMax){		
	        	valorMax = array.get(i);	          
	        }		
	    }						
	    for (int i = 0; i < array.size(); i++) {			
	        if(array.get(i) < valorMin){		
	        	valorMin = array.get(i);		          
	        }		
	    }	
	    arrayAux.add(valorMin);
	    arrayAux.add(valorMax);
		return arrayAux;
	}

	public String cadAleat(char c, String str, Random r, int largo) {
		for (int i = 0; i < largo; i++) {
			c = (char)(r.nextInt(25)+97);
			str += c;
		}
		return str;
	}

	public void arrayCadAleat(ArrayList<String> arrayStr, char c, String str, Random r, int largo) {		
		
		for (int i = 0; i < 10; i++) {
			arrayStr.add(cadAleat(c, str, r, largo));
		}
		
		System.out.println(arrayStr);
	}
	
	
}
