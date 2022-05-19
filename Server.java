/* UNIVERSIDADE FEDERAL DE ITAJUBÁ
   INSTITUTO DE MATEMÁTICA E COMPUTAÇÃO
   
   COM242 - SISTEMAS DISTRIBUIDOS
   Alejandro Silvério dos Santos
   18/05/2022
   
   RMI - Exemplo de implementação
   Programa que utiliza funções remotas para realizar o cálculo da distância euclidianas entre dois pontos.
   
   Aplicação SERVIDOR
*/

import java.rmi.registry.Registry; 
import java.rmi.registry.LocateRegistry; 
import java.rmi.RemoteException; 
import java.rmi.server.UnicastRemoteObject; 

public class Server extends ImplCalc { 
   public Server() {} 
   public static void main(String args[]) { 
      try { 
         // Instanciando a classe que implementa os objetos remotos
         ImplCalc obj = new ImplCalc(); 
    
		 // Exporta o objeto remoto para o stub
		 Calc stub = (Calc) UnicastRemoteObject.exportObject(obj, 0);  
        
         // Vincula o objeto remoto (stub) no registro (Binding)
         Registry registry = LocateRegistry.getRegistry(); 
         registry.bind("Calc", stub);  
         System.err.println("Servidor Pronto!"); 
      } catch (Exception e) { 
         System.err.println("ERRO no Servidor (Exception): " + e.toString()); 
         e.printStackTrace(); 
      } 
   } 
}
