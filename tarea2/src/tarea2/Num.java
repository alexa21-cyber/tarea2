package tarea2;

import java.util.Scanner;

public class Num {

	public static void main(String[] args) {
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.println("<<<<<Ingrese el numero>>>>>");
		num=scan.nextInt();
		
		if(num<0){
			System.out.println("Negativo");
		       }else{ if(num>0) {
			       System.out.println("Positivo");
		            }else{
			           System.out.println("Es nulo");
		}
		

		  }
	}

}
