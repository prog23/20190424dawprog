package examen.ejercicio2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		int n = 0;
		int m = 0;			
		
		Scanner num = new Scanner (System.in);
		
		System.out.println("Escribe n");
		n = num.nextInt();
		System.out.println("Escribe m");
		m = num.nextInt();
		
		for(int i = 0; i<(n+m);i++) {
			System.out.println("Introduce un número");
			i = num.nextInt();
			leerConjunto(i, i);
			}		
		
	}
	
	public static void leerConjunto(int n, int m){
		
		Set<Integer> num1 = new HashSet<Integer>();
		Set<Integer> num2 = new HashSet<Integer>();
		
		if (n <= m) {
			num1.add(n);
		} else if (m <= n) {
			num2.add(m);
		} else  {
			try {
			}catch (Exception e) {
				if (n == m) {
					System.out.println("Están repetidos");
				}
			}
			}
		}
			
		
	}
	
	

