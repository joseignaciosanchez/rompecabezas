package com.inforcap.codingdojo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Set;

public class RompecabezasTest {

	public static void main(String[] args) {
		
		Rompecabezas rc = new Rompecabezas();
		Random r = new Random();
		ArrayList<Integer> array = new ArrayList<Integer>();
		ArrayList<Integer> arrayAux = new ArrayList<Integer>();
		char c = ' ';
		String str = "";
		int largo = 5;
				
		//System.out.println(rc.sumNumMay(array,arrayAux));
				
		//System.out.println(rc.nomPersonas(array,arrayAux));		
			
		//rc.letrasAbece(array);
						
		//System.out.println(rc.numAleatorios(array,r,55,100));
				
		//System.out.println(rc.numAleatOrdMinMax(arrayAux,r,55,100));
				
		//System.out.println(rc.cadAleat(c,str,r,largo));
				
		ArrayList<String> arrayStr = new ArrayList<String>();		
		rc.arrayCadAleat(arrayStr, c, str, r, largo);
	}
	
	

}
