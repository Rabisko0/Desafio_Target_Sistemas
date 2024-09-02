package com.targetSistemas;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //O usuário deve fornecer a String
        System.out.println("Digite uma string: ");
        String input = scanner.nextLine();
        String minuscula = input.toLowerCase();

        int quantidade = 0;

        for (int i = 0; i < minuscula.length(); i++){
            if (minuscula.charAt(i) == 'a'){
                quantidade++;
            } else continue;
        }

        System.out.println("A letra 'A' foi encontrada " + quantidade + " vez(es) nesta string");
    }
}
