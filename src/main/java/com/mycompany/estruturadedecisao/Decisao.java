/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estruturadedecisao;

/**
 *
 * @author nando
 */
public class Decisao {
    //Métodos
    public void ifElse(int valor){
        if(valor < 0){
            System.out.println("O valor "+valor+" eh negativo");
        }else if(valor > 0){
            System.out.println("O valor "+valor+" eh positivo");
        }else{
            System.out.println("O valor eh zero");
        }
    }
    
    public void switchCase(int valor){
        switch(valor){
            case -1:int calcA;
                    System.out.println("O valor Escolhido foi "+valor);
                    calcA = (int) Math.pow(valor,2);
                    System.out.println("valor elevado ao quadrado eh..: "+calcA);
                    break;
            case 0: int calcB;
                    System.out.println("O valor Escolhido foi "+valor);
                    calcB = (int) Math.pow(valor,2);
                    System.out.println("valor elevado ao quadrado eh..: "+calcB);
                    calcB = (int) Math.sqrt(valor);
                    System.out.println("a raiz quadrada de valor eh..: "+calcB);
                    break;
            case 1: int calcC;
                    System.out.println("O valor Escolhido foi "+valor);
                    calcC = (int) Math.pow(valor,2);
                    System.out.println("valor elevado ao quadrado eh..: "+calcC);
                    calcC = (int) Math.sqrt(valor);
                    System.out.println("a raiz quadrada de valor eh..: "+calcC);
                    break;
            default:int calcD;
                    System.out.println("O valor digitado eh diferente de -1, 0, 1");
                    System.out.println("O valor digitado eh..: "+valor);
                    calcD = (int) Math.pow(valor,2);
                    System.out.println("valor elevado ao quadrado eh..: "+calcD);
                    calcD = (int) Math.sqrt(valor);
                    System.out.println("a raiz quadrada de valor eh..: "+calcD);
                    
        }
    }
}
