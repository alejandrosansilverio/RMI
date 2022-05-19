/* UNIVERSIDADE FEDERAL DE ITAJUBÁ
   INSTITUTO DE MATEMÁTICA E COMPUTAÇÃO
   
   COM242 - SISTEMAS DISTRIBUIDOS
   Rafael Frinhani 
   04/05/2022
   
   RMI - Exemplo de implementação
   Programa que utiliza funções remotas para realizar operacoes matemáticas.
   
   INTERFACE dos Objetos Remotos
*/

import java.rmi.Remote; 
import java.rmi.RemoteException;  

// Criação de uma interface chamada Calc, que define os contratos para acesso as funções de cada operação
public interface Calc extends Remote {  
   public double distanciaEuclidiana(double x1, double y2, double x2, double y2) throws RemoteException;
} 