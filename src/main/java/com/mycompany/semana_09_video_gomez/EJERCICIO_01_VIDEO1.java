/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana_09_video_gomez;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cifuentes
 */
public class EJERCICIO_01_VIDEO1 {

 public static void main(String[] args) {
 List<String> lis_nombres = new ArrayList<>();

 lis_nombres.add("Walter");
 lis_nombres.add("Paul");
 lis_nombres.add("Manuel");
 lis_nombres.add("Sonia");

 System.out.println("Tamaño: " + lis_nombres.size());

 System.out.println("Dato posicion 0: " + lis_nombres.get(0));

 lis_nombres.remove(1);

 System.out.println("Tamaño: " + lis_nombres.size());
 }
  
}
