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
public abstract class Arbol<T extends Comparable<T>>{
    NodoAVL<T> raiz;
    
    public boolean esVacio(){
        return raiz == null;
    }
    
    public void preorden(NodoAVL<T> raiz){
        if(raiz != null){
            System.out.print(raiz.getDato());
        preorden(raiz.getIzq());
        preorden(raiz.getDer());
        }
    }
    public void inorden(NodoAVL<T> raiz){
        if(raiz != null){
            inorden(raiz.getIzq());
            System.out.print(raiz.getDato());
            inorden(raiz.getDer());
        }
    }
    public void posorden(NodoAVL<T> raiz){
        if(raiz != null){
            posorden(raiz.getIzq());
            posorden(raiz.getDer());
        System.out.print(raiz.getDato());
        }
    }
    
    public int numNodos(NodoAVL<T> raiz){
        if(raiz == null)
            return 0;
        else
            return 1 + numNodos(raiz.getIzq()) + numNodos(raiz.getDer());
    }
    
    public boolean buscarNodo(NodoAVL<T> raiz, Integer n){
        boolean b = false;
        if(raiz != null){
            if(raiz.getDato() == n){
                return true;
            }else{
                   b = buscarNodo(raiz.getIzq(), n);
                if(b == false)
                   b = buscarNodo(raiz.getDer(), n);
            }
        }
        return b;
    }
            
    public int altura(NodoAVL<T> raiz, int altura){//Altura -1
        altura = altura + 1;
        int izquierda, derecha;
        if(raiz != null){
            System.out.println("El nivel del nodo: "+raiz.getDato()+" es: "+altura);
            izquierda = altura(raiz.getIzq(), altura);
            derecha = altura(raiz.getDer(),altura);
         }else{
             return -1;
         }
        if (izquierda > derecha)
          return izquierda +1;
        else
          return derecha+1; 
    }
    public abstract Integer insertar(T dato);
}
