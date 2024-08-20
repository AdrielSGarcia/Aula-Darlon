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

    public static char lerChar(){
        return entrada.next().charAt(0);
    }

    public static char lerChar(String msg){
        System.out.println(msg);
        return entrada.next().charAt(0);
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
