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
        
        int contador = 2;
        for (int i = 0; i < 2; i++) {
            System.out.println("Ola " + i );
        }
        
        while(contador > 0){
            if (contador % 2 == 0){
                --contador;
                continue;
            }
            System.out.println(contador--);
        }
        
        do {
            contador++;
            System.out.println(contador);
        } while (contador != 10);
    } 
       
}


