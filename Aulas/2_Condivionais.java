/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classjava;

/**
 *
 * @author LuizFreitas
 */
public class ClassJava {

    public static void main(String[] args) {
        
        boolean comp = 12 >= 13;
        char caractere = comp ? 'A' : 'B';
        
        if(comp){
            System.out.println("O caractere é: " + caractere);
        } else if(!comp)
            System.out.println("O caractere é: " + caractere);
        else
            System.out.println("Não aparece");
        
        switch(caractere){
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            default:
                System.out.println("Nao aparece");
            
        }
    } 
       
}


