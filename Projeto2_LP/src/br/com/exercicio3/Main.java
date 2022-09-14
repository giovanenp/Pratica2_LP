package br.com.exercicio3;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String frase;
    Scanner entrada = new Scanner(System.in);
    int cont = 0;
    char vogais[] = new char[5];

    System.out.println("Digite uma frase");
    frase = entrada.nextLine();

    for (int i = 0; i < frase.length(); i++) {
      if (frase.contains("A") || frase.contains("a"))
        vogais[0]++;
      if (frase.contains("E") || frase.contains("e"))
        vogais[1]++;
      if (frase.contains("I") || frase.contains("i"))
        vogais[2]++;
      if (frase.contains("O") || frase.contains("o"))
        vogais[3]++;
      if (frase.contains("U") || frase.contains("u"))
        vogais[4]++;
    }

    for (int i = 0; i < vogais.length; i++) {
      if (vogais[i] != 0) {
        cont++;
      }
    }

    System.out.println(cont);
  }
}
