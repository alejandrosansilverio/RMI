/* UNIVERSIDADE FEDERAL DE ITAJUBÁ
   INSTITUTO DE MATEMÁTICA E COMPUTAÇÃO
   
   COM242 - SISTEMAS DISTRIBUIDOS
   Rafael Frinhani 
   04/05/2022
   
   RMI - Exemplo de implementação
   Programa que utiliza funções remotas para realizar operacoes matemáticas.
   
   Aplicação CLIENTE
*/

import java.rmi.registry.LocateRegistry; 
import java.rmi.registry.Registry;  
import java.rmi.*;
import java.util.Scanner;

public class Client {  
   private Client() {}  
   public static void main(String[] args) {  
	
   Scanner keyboard = new Scanner(System.in);
   System.out.println("----Primeiro ponto----");
   System.out.println("Entre com valores x1 e y1 separados por espaço:");
   double x = keyboard.nextDouble();
   double y = keyboard.nextDouble();
   System.out.println("----Segundo ponto----");
   System.out.println("Entre com valores x2 e y2 separados por espaço:");
   System.out.println("");
	
   try {  
         // Obtendo o registro 
		Registry registry = LocateRegistry.getRegistry("200.235.74.50", 1099); 
    
        // Procur o registro do objeto remoto implementado no servidor 
		Calc stub = (Calc) Naming.lookup("rmi://200.235.74.50:1099/Calc"); 

		System.out.println("Invocando Método Remoto..."); 
		System.out.println("");    
         
		// Chamada ao Método Remoto usando o objeto criado
		System.out.println("Distancia Euclidiana entre o ponto A (" +x1+","+y1+") e o ponto B ("+x2+","+y2+") = "+ stub.distanciaEuclidiana(x1, y1, x2, y2));
	
         
      } catch (Exception e) {
         System.err.println("ERRO no Cliente (Exception): " + e.toString()); 
         e.printStackTrace(); 
      } 
   } 
}
