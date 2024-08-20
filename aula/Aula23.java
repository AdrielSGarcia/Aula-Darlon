package aula;
import libs.Entrada;

public class Aula23{

    public static void entradaPalavra(){
        String palavra;
        char letraBusca;
        int pos_ini;
        int resposta;

        Entrada.abrir();
        palavra = Entrada.lerString("Escreva uma palavra: ");
        letraBusca = Entrada.lerChar("Escreva o caracter que você deseja procurar: ");
        pos_ini = Entrada.lerInteiro("Escreva a posição inicial da busca: ");
        Entrada.fechar();
        resposta = obterPosicaoProxChar(palavra, pos_ini, letraBusca);
            System.out.println("Foi possível encontrar a letra '" + palavra.charAt(resposta) + "' na posição " + resposta);
    }
        
    public static int obterPosicaoProxChar(String palavra, int pos_ini, char letraBusca){
        int i, pos_retorno = -1;

        for(i=pos_ini; i<palavra.length(); i++){
            if (palavra.charAt(i) == letraBusca){
                return i;
            }
        }
        return pos_retorno;
    }

}
