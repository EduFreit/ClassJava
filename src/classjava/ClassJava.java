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
        
        String[] nomes0 = new String[3];
        String[] nomes1 = {"Helo", "Gabriela", "Joana"};
        String[] nomes2 = new String[] {"Jao", "Lula", "Alfredo"};
        int[][] numeros = new int[2][2];
        int[][] numeros2 = {{2, 3},{10, -2, 4},{1, 2, 0},{14, 15, 120}};
        
        numeros[0][0] = 0;
        numeros[0][1] = 1;
        numeros[1][0] = 2;
        numeros[1][1] = 3;
        
        nomes0[0] = "Itala";
        nomes0[1] = "Dudu";
        nomes0[2] = "Eliane";
        
        for (int i = 0; i < nomes0.length ; i++) {
            System.out.println(nomes0[i]);
        }
        
        for(String nome : nomes1) {
            System.out.println(nome);
        }
        
        for(int[] linha: numeros2){
            for(int coluna: linha)
                System.out.print(coluna + " ");
            System.out.println("");
        }
    } 
       
}


