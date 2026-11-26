/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectobimestral02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ASUS-A15G
 */
public class ProyectoBimestral02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String usuario;
        double consumoAgua;
        int horasSueño;
        int minutos_Actividad_Fisica;
        int dias;
        double meta_Agua;
        double meta_Sueño;
        double meta_Actividad_Fisica;

        dias = 0;

        System.out.println("Ingrese su nombre de Usuario:");
        usuario = entrada.nextLine();
        System.out.println("Ingrese la meta de consumo de Agua:");
        meta_Agua = entrada.nextDouble();
        System.out.println("Ingrese su meta de horas de Sueño");
        meta_Sueño = entrada.nextDouble();
        System.out.println("Ingrese su meta de minutos alcanzados en Actividad Fisica:");
        meta_Actividad_Fisica = entrada.nextDouble();

        while (dias <= 7) {
            System.out.println("Ingrese los litros de agua del dia:");
            consumoAgua = entrada.nextDouble();
            System.out.println("Ingrese su meta de horas de Sueño");
            horasSueño = entrada.nextInt();
            System.out.println("Ingrese su meta de minutos alcanzados en Actividad Fisica:");
            minutos_Actividad_Fisica = entrada.nextInt();
            dias = dias + 1;
            if (consumoAgua == meta_Agua) {
                System.out.println("meta cumplida");
            } else {
                if (horasSueño == meta_Sueño) {
                    System.out.println("meta cumplida");
                } else {
                    if (minutos_Actividad_Fisica == meta_Actividad_Fisica) {
                        System.out.println("meta cumplida");
                    }else{
                        System.out.println("no cumplio con la meta");
                    }
                }
            }
        }
    }

}
