/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana_09_video_gomez;

import com.mycompany.semana_09_video_gomez.EJERCICIO_1_VIDEO2.Nodo;

public class EJERCICIO_2_VIDEO2 {
public class Lista {
 private Nodo primero;
 private Nodo ultimo;
 private int tamaño;
 public Lista() {
 this.primero = null;
 this.ultimo = null;
 this.tamaño = 0;

 }
 public Nodo getPrimero() {
 return primero;
 }
 public void setPrimero(Nodo primero) {
 this.primero = primero;
 }
 public Nodo getUltimo() {
 return ultimo;
 }
 public void setUltimo(Nodo ultimo) {
 this.ultimo = ultimo;
 }
 public int getTamaño() {
 return tamaño;
 }
 public void setTamaño(int tamaño) {
 this.tamaño = tamaño;
 }
 @Override
 public String toString() {
 return "Lista{" + "primero=" + primero + ", ultimo=" + ultimo
+ ", tama\u00f1o=" + tamaño + '}';
 }

 public boolean Vacio(){
 return primero == null && ultimo == null;
 }
 public void Insertar_Inicio(int dato){
 Nodo nuevo = new Nodo (dato, primero);
 primero = nuevo;
 if (ultimo == null) {
 ultimo = primero;
 }
 tamaño++;
 }   
}
