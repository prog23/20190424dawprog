package examen.ejercicio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) throws IOException {
		
		Map<String, String> ips = new HashMap<>();
		BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
		boolean fin = false;
	
		int estado = 0;	
		do {
			System.out.print("IP= ");
			Scanner s = new Scanner(in.readLine());
			String token;
			String nombre = null;
		while (estado != 6) {
			switch(estado) {
			case 0:
				try {
					token = s.skip("fin|ip|mensaje|usuario|\\p{L}+(\\s+\\p{L}+)*").match().group();
					if (token.equals("fin")) {
						estado = 6;
						fin = true;
					}
					
					else if (token.equals("ip"))
						estado = 2;
					 else if (token.equals("mensaje")) 
						 estado = 1;
					 else if (token.equals("usuario")) 
						 estado = 1; 
					 else { 
						 nombre = token; 
						 estado = 1;
					 }
				} catch (NoSuchElementException e) {
					System.out.println("Se esperaba otra cosa");
					estado = 6;
				}
				break;
				
			case 1:
				try {
					s.skip("=");
					estado = 5;
				}catch (NoSuchElementException e) {
					System.out.println("Se esperaba =");
					estado = 6;
				}
				break;
			case 2:
				 try { 
					s.skip("="); 
				 estado = 4; 
				 }catch (NoSuchElementException e) {
					 System.out.println("Se esperaba '='"); 
					 estado = 6; 
					 } 
				 break;
			case 3:
				try {
					
				}catch (NoSuchElementException e) {
					 System.out.println("Se esperaba '='"); 
					 estado = 6; 
					 } 
				 break;
			case 4:
				try {
					
				}catch (NoSuchElementException e) {
					 System.out.println("Se esperaba '='"); 
					 estado = 6; 
					 } 
				 break;
			case 5:
				try {
					
				}catch (NoSuchElementException e) {
					 System.out.println("Se esperaba '='"); 
					 estado = 6; 
					 } 
				 break;
			
			
		case 6:
			try {
				
			}catch (NoSuchElementException e) {
				 System.out.println("Se esperaba '='"); 
				 estado = 6; 
				 } 
			 break;
			
		}
		}
		}while(!fin);
	


		}
		
	}

