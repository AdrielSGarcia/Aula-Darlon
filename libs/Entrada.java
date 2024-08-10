package libs;

import java.util.Scanner;

public class Entrada {
    
    public static Scanner entrada;

    public static void abrir(){
        entrada = new Scanner(System.in);
    }

    public static void fechar(){
        entrada.close();
    }

    public static int lerInteiro(String mensagem){
        System.out.println(mensagem);
        return entrada.nextInt();
    }

    public static int lerInteiro(){
        return entrada.nextInt();
    }

    public static double lerDouble(){
        return entrada.nextDouble();
    }

    public static double lerDouble(String mensagem){
        System.out.println(mensagem);
        return entrada.nextDouble();
    }

    public static String lerString(){
        return entrada.next();
    }

    public static String lerString(String mensagem){
        System.out.println(mensagem);
        return entrada.next();
    }
}
