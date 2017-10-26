/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1liliana;
import java.util.Scanner;// paso 1 esta libreria toma los datos que digita el usuario por consola


/**
 *
 * @author LAB04
 */
public class EntradaDatos
{ 
public static void main(String[] args)
{
 // paso 2 Aqui estamos creando el objeto escanner y se crea solo una vez  
Scanner sc = new Scanner(System.in);//se crea el lector
// paso 3 pedir los datos al usuario
System.out.println("por favor ingrese su nombre");

//paso 4 Se lee el nombre y se almacena
String nombre = sc.nextLine();
//paso 5 procesamos los datos del usuario, en este caso, lo imprimimos
System.out.println("Bienvenido" +nombre+"Por favor digite la edad");

int edad = sc.nextInt();
System.out.println("usted tiene "+edad+"años");









}

    

             
}
