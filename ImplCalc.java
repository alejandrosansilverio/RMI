/* UNIVERSIDADE FEDERAL DE ITAJUBÁ
   INSTITUTO DE MATEMÁTICA E COMPUTAÇÃO
   
   COM242 - SISTEMAS DISTRIBUIDOS
   Rafael Frinhani 
   04/05/2022
   
   RMI - Exemplo de implementação
   Programa que utiliza funções remotas para realizar operacoes matemáticas.
   
   IMPLEMENTAÇÃO dos métodos definidos na interface Calc
*/

import java.rmi.*;
import java.rmi.server.*;

// Classe no servidor que implementa os métodos remotos
public class ImplCalc implements Calc{ 
    
    	public double distanciaEuclidiana(double x1, double y2, double x2, double y2) throws RemoteException
    {
        System.out.println("Calculando a distancia euclidiana entre o ponto A (" +x1+","+y1+") e o ponto B ("+x2+","+y2+").");
        System.out.println(""); 
		return Math.sqrt(Math.pow(x2 - x1, 2) +  Math.pow(y2 - y1, 2));
    } 
} 
