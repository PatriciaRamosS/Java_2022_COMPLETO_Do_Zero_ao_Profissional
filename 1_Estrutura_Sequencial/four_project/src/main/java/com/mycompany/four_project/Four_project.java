package com.mycompany.four_project;

import java.util.Locale;
import java.util.Scanner;

public class Four_project {

    public static void main(String[] args) {
        
        double largura;
        double comprimento;
        double area;
        double preco;
        double preco_Metro_Quadrado;
        
        Locale.setDefault(Locale.US);
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira a largura do terreno: ");
        largura = scan.nextDouble();
        
        System.out.println("Insira o comprimento do terreno: ");
        comprimento = scan.nextDouble();
        
        System.out.println("Insira o preço do metro quadrado do terreno: ");
        preco_Metro_Quadrado = scan.nextDouble();
        
        area = largura * comprimento;
        
        preco = area * preco_Metro_Quadrado;
        
        System.out.printf("Area do Terreno %.2f%n", area);
        System.out.printf("Preço do Terreno %.2f%n", preco);
    }
}
