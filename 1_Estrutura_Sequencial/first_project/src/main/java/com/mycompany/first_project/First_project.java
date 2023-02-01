package com.mycompany.first_project;

import java.util.Locale;

public class First_project {

    public static void main(String[] args) {
        double x = 10.35784;
        
        System.out.println(x + "\n");
        
        //Padrão BR
        //%n é a mesma coisa que /n
        System.out.printf("Padrão BR\n");
        System.out.printf("%.2f%n", x); //Imprime 2 casas após a vírgula
        System.out.printf("%.4f%n", x); //Imprime 4 casas após a vírgula
        
        
        Locale.setDefault(Locale.US); //Para considerar o separador de decimais como ponto
        
        // Padrão EUA
        System.out.printf("\nPadrão EUA\n");
        System.out.printf("%.2f%n", x); 
        System.out.printf("%.4f%n", x); 
        
        //Concatenar com println
        System.out.println("\nConcatenar com println");
        System.out.println("RESULTADO = " + x + " METROS");
        
        //Concatenar com println
        System.out.println("\nConcatenar com println");
        System.out.printf("RESULTADO = %.2f metros%n%n", x);
        
        /*
        
        %f = ponto flutuante
        %n = quebra de linha
        %d = inteiro
        %s = texto

        */        
        
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    }
}
