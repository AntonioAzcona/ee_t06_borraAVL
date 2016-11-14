/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiPaquete;

/**
 *
 * @author Antonio
 */
public class Test {
    public static void main(String[] args){
        ArbolAVL<Integer> a = new ArbolAVL<Integer>();
        a.insertar(9);
        a.insertar(4);
        a.insertar(20);
        a.insertar(2);
        a.insertar(5);
        a.insertar(19);
        a.insertar(21);
        
        a.posorden(a.getRaizAVL());
        System.out.println();
        a.eliminabalanceado(a.getRaizAVL(), false, 7);
    }
}
