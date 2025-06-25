package br.com.henriqueaguiiar.boardgame;

public class BoardException extends RuntimeException{
    private static  final long serialVersionUID = 1L;


    public  BoardException(String menssage){
        super(menssage);
    }
}
