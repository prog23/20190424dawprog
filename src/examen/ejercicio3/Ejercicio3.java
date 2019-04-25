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
		Map<String, String> mensaje = new HashMap<>();
		Map<String, String> usuario = new HashMap<>();
		BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
		boolean fin = false;
			
		do {
			System.out.print("> ");
			Scanner s = new Scanner(in.readLine());
			int estado = 0;	
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
					estado = 5;
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
					token = s.skip("\\d{9}").match().group();
					ips.put(nombre, token);
					estado = 6;
				}catch (NoSuchElementException e) {
					System.out.println("Se esperaba otra cosa");
					estado = 6;
}
				 break;
			case 4:
				try {
					token = s.skip("\\d").match().group();
					String dirIp = ips.get(token);
						
					if(dirIp==null) {
						mensaje.put(token, dirIp);
						System.out.println("correcto");
						ips.put(token,dirIp);
					}else {
						System.out.println("error");
						
					}
					
					estado=6;
				} catch (NoSuchElementException e) {
					System.out.println("Se esperaba una direcion ip");
					estado = 6;
}
				 break;
			case 5:
				try {
					token = s.skip("\\p{L}+(\\s+\\p{L}+)*").match().group();
					String mens=mensaje.get(token);
					
					mensaje.put(token, mens);
					System.out.println(mensaje);
					if(mens==null) {
						mensaje.put(token, mens);
						System.out.println("El mensaje es correcto");
						fin=true;
						estado=6;
					}else {
						System.out.println("El mensaje es incorrecto");
						fin=true;
						estado=6;
						
					}
					estado = 6;
					fin=true;
				} catch (NoSuchElementException e) {
					System.out.println("Se esperaba un mensaje o nombre");
					estado = 6;
					}
			
					
		}
		}
		}while(!fin);
	
		System.out.println(mensaje);

		}
		
	}

