package com.mycompany.first_project;

import java.util.Locale;
import java.util.Scanner;

public class First_project {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Scanner scan = new Scanner(System.in);
        
        int minutos = scan.nextInt();
        
        double conta = 50.0;
        
        if(minutos > 100) {
            conta = conta + (minutos-100) * 2.0;
        }
        
        System.out.printf("Valor da conta = R$%.2f%n", conta);
    }
}
