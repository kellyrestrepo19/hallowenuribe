package org.example;

import org.example.clasesHalloween.Fiesta;
import org.example.clasesHalloween.Invitado;
import org.example.clasesHalloween.Lugar;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Scanner entradaPorTeclado=new Scanner(System.in);
        Invitado objetoInvitado = new Invitado();
        Lugar objetoLugar = new Lugar();
        Fiesta objetoFiesta = new Fiesta();

        //DEFINIENDO COSTOS DE LA FIESTA
        System.out.println("****** GRAN FIESTA GRUPO URIBE**********");
        System.out.println("***************************************");
        System.out.println("1.Digita el costo de la comida:");
        double costosAlimentos=entradaPorTeclado.nextDouble();
        if (costosAlimentos>0){
            objetoFiesta.costosAlimentos=costosAlimentos;
        }else{
            System.out.println("Ingresa un valor valido");
        }

        System.out.println("El costo de alimentos fue: "+ objetoFiesta.costosAlimentos);

        
        System.out.println("2.Digita el costo del bebidas:");
        double costoBebidas=entradaPorTeclado.nextDouble();
        if (costosAlimentos>0){
            objetoFiesta.costosBebidas=costoBebidas;
        }else{
            System.out.println("Ingresa un valor valido");
        }
        System.out.println("El costo de bebidas fue: "+ objetoFiesta.costosBebidas);


        System.out.println("3.Digita el costo de las lugar:");
        double costoLugar=entradaPorTeclado.nextDouble();
        if (costosAlimentos>0){
            objetoFiesta.costoLugar=costoLugar;
        }else{
            System.out.println("Ingresa un valor valido");
        }
        System.out.println("El costo del lugar fue:"+ objetoFiesta.costoLugar);


        System.out.println("4.Digita el costo de las equipos:");
        double costoEquipos=entradaPorTeclado.nextDouble();
        if (costosAlimentos>0){
            objetoFiesta.costoEquipos=costoEquipos;
        }else{
            System.out.println("Ingresa un valor valido");
        }
        System.out.println("El costo de los equipos fue:"+ objetoFiesta.costoEquipos);








    }
}