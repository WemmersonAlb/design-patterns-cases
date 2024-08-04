package com.factorymethodpp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite um conjunto de nomes utilizando este formato:");
        System.out.println("\"McNealy, Scott\" \"James Gosling\" \"Naughton, Patrick\"");
        System.out.print("-->");

        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();

        scanner.close();

        String[] nomes = entrada.split("\" \"");

        for(String n : nomes){
            NomeSobrenomeFactory nomeSobrenomeFactory = new NomeSobrenomeFactory();
            NomeCompleto tentativa1 = nomeSobrenomeFactory.criarNome(n);
            SobrenomeNomeFactory sobrenomeNomeFactory = new SobrenomeNomeFactory();
            NomeCompleto tentativa2 = sobrenomeNomeFactory.criarNome(n);

            System.out.println(
                tentativa1.getNome().equalsIgnoreCase("")?tentativa2.getNome():tentativa1.getNome());
        }
    }
}