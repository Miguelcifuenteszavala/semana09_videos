/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana_09_video_gomez;

/**
 *
 * @author Cifuentes
 */
public class EJERCICIO_3_VIDEO2 {
 /**
 * @param args the command line arguments
 */
 public static void main(String[] args) {
 // TODO code application logic here

 Lista lista1 = new Lista();
 lista1.Insertar_Inicio(26);
 lista1.Insertar_Inicio(50);
 lista1.Insertar_Inicio(34);
 lista1.Insertar_Inicio(37);
 lista1.Insertar_Inicio(21);
 lista1.Insertar_Inicio(10);
 lista1.Insertar_Ultimo(100);
 System.out.println("Numeros pares de la lista "+lista1.Pares());
 System.out.println(lista1.Mostrar());

 System.out.println(lista1);
 lista1.Eliminar_Inicio();
 System.out.println(lista1);
 lista1.Eliminar_Ultimo();
 System.out.println(lista1);
 System.out.println(lista1.Mostrar());
 }

} 
