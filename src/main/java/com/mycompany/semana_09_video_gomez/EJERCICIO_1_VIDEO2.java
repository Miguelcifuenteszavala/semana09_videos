/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana_09_video_gomez;

/**
 *
 * @author cifuentes
 */
public class EJERCICIO_1_VIDEO2 {
public class Nodo {
 private int dato;
 private Nodo siguiente;

 //Insertar Inicio
 public Nodo(int dato, Nodo siguiente) {
 this.dato= dato;
 this.siguiente = siguiente;

 }
 //Insertar Datos por el Ultimo
 public Nodo(int dato) {
 this.dato= dato;
 this.siguiente = null;
}
 public int getDato() {
 return dato;
 }
 public void setDato(int dato) {
 this.dato = dato;
 }
 public Nodo getSiguiente() {
 return siguiente;
 }
 public void setSiguiente(Nodo siguiente) {
 this.siguiente = siguiente;
 }
 @Override
 public String toString() {
 return "Nodo{" + "dato=" + dato + ", siguiente=" + siguiente +
'}';
 }   
}
}