/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoramonedas;
import java.util.Scanner;

public class Calculadoramonedas {
   
    
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Calculadora de Conversión de Pesos Mexicanos a Otras Monedas");
        System.out.print("Ingresa la cantidad en pesos mexicanos: ");
        double pesosMexicanos = Scanner.nextDouble();

        double Dolar = 17.07; // Tasa de cambio de MXN a USD
        double Euro = 18.21; // Tasa de cambio de MXN a EUR
        double Yen = 0.12;   // Tasa de cambio de MXN a JPY
        double libras = 21.18;//Tasa de cambio de MXN a LRA
        // Realiza las conversiones
        double dolares = pesosMexicanos * Dolar;
        double euros = pesosMexicanos * Euro;
        double yenes = pesosMexicanos * Yen;
    
        

        // Muestra los resultados
        System.out.println(pesosMexicanos + " pesos mexicanos son equivalentes a:");
        System.out.println(dolares + " dólares");
        System.out.println(euros + " euros");
        System.out.println(yenes + " yenes");
        System.out.println(libras + " libras");

        Scanner.close();
    }
}
    
    

