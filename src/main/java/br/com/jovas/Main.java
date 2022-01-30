package br.com.jovas;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome", "Jovas");
        aluno.put("Idade","22");
        aluno.put("Media", "9.2");
        aluno.put("Turma", "3F");

        System.out.println(aluno);
        //Retorna o grupo das chaves
        System.out.println(aluno.keySet());
        // Retorna todo os valores
        System.out.println(aluno.values());

        System.out.println(aluno.containsKey("Nome"));


    }

}
