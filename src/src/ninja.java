/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jefer
 */
import java.util.Scanner;

public class ninja {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 3;
		int copias;
    int cninjas[] = new int[n];
		//Escreva o seu código aqui
		for(int i = 0; i < n; i++){
		   copias = sc.nextInt();
		  if(copias == 1){
		    cninjas[i] = 0;
		  }else{
		    copias = copias / 2;
		     cninjas[i] = copias;
		  }
		}
    for(int j = 0;j< cninjas.length;j++){
      System.out.println(cninjas[j]);
    }
		

		sc.close();
	}
}