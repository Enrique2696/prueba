package ejer11;

import java.util.Scanner;

public class Ejer11 {
    public static void main(String[] args) {
        final double IVA = 0.21;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Dime una cantidad de productos (Recuerda que es un numero entero): ");
        int producto = teclado.nextInt();
        System.out.println("Dime ahora el precio de del producto que has adquirido: ");
        double precio=teclado.nextDouble();
        System.out.printf("El precioi total sin iva es %.2f%n", producto*precio);
        System.out.printf("El precioi total con iva es %.2f%n", (producto*precio)*(1+IVA));
        
    }
    
}
