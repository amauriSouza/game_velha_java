package model;

public class Verificacoes {

    public String inversaoJogadores(String vJogador) {
        String retorno;
        if (vJogador.equals("X")) {
            retorno = "O";
        } else {
            retorno = "X";
        }
        return retorno;
    }
}
