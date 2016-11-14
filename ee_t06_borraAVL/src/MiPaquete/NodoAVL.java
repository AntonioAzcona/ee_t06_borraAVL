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
public class NodoAVL<T extends Comparable<T>>{
    private T dato;
    private NodoAVL<T> izq, der;
    private int fe;
    
    public NodoAVL(){
       dato = null;
       izq = der = null;
       fe = 0;
    }
    public NodoAVL(T dato){
        this.dato = dato;
        izq = der = null;
        fe = 0;
    }
    public NodoAVL(NodoAVL<T> izq, T dato, int fe, NodoAVL<T> der){
        this.izq = izq;
        this.dato = dato;
        this.fe = fe;
        this.der = der;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoAVL<T> getIzq() {
        return izq;
    }

    public void setIzq(NodoAVL<T> izq) {
        this.izq = izq;
    }

    public NodoAVL<T> getDer() {
        return der;
    }

    public void setDer(NodoAVL<T> der) {
        this.der = der;
    }

    public int getFe() {
        return fe;
    }

    public void setFe(int fe) {
        this.fe = fe;
    }
    public String toString(){
        return dato + " " + fe;
    }
}
