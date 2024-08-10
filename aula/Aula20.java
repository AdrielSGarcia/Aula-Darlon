package aula;

import libs.Matematica;
import libs.Entrada;

public class Aula20 {
    public static void aula(){
        System.out.println("++ Aula do dia 09/08/2024 ++");
    }

    public static void exLerInteiro(){
        //Entrada.abrir();
        //int a = Entrada.lerInteiro("Digite o valor de A: ");
        //int b = Entrada.lerInteiro("Digite o valor de B: ");
        exMenorNumeroInteiro();
        //Entrada.fechar();
    }

    public static void exMenorNumeroInteiro(){
        int a,b, menor;
        Entrada.abrir();
        a = Entrada.lerInteiro("Digite um número: ");
        b = Entrada.lerInteiro("Digite outro número: ");
        Entrada.fechar();
        menor = Matematica.menor(a,b);
        System.out.println("O menor valor é: " + menor);
    }
}
