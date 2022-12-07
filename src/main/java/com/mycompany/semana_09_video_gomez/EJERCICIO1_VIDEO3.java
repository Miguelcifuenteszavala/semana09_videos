
package com.mycompany.semana_09_video_gomez;
import java.util.Scanner;
/**
 *
 * @author cifuentes
 */
public class EJERCICIO1_VIDEO3 {
 public void leerOpcion() {
 Scanner teclado = new Scanner(System.in);
 int opcion;
 do {
 System.out.println("\nLista de numeros");
 System.out.println("[1] Agregar");
 System.out.println("[2] Buscar");
 System.out.println("[3] Modificar Elemento" );
 System.out.println("[4] Eliminar Elemento");
 System.out.println("[5] Insertar Elemento");
 System.out.println("[6] Mostrar Elemento");
 System.out.println("[7] Salir\n");
 System.out.print("Ingrese opcion (1-7): ");
 opcion = teclado.nextInt();
 switch (opcion) {
 case 1:
 ingresarValor();
 break;
 case 2:
 buscarValor();
 break;
 case 3:
 modificarValor();
 break;
 case 4:
 eliminarValor();
 break;
 case 5:
 insertarValor();
 break;
 case 6:
 mostrarLista();
 break;
 case 7:

 }
 }while (opcion != 7);
 }

public void ingresarValor() {
Scanner teclado = new Scanner (System.in); 
}

    private void buscarValor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void modificarValor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void eliminarValor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void insertarValor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void mostrarLista() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }}
