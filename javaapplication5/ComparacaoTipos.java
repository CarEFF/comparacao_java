/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author senaiden
 */
public class ComparacaoTipos {
    public static void main(String[] args) {
        //Declarando variáveis
        String nomeUsuario = "Marta";
        int senha = 123;
        //Comparação de Strings e inteiros
        boolean resultadoNome = nomeUsuario.equals("Marta");
        boolean resultadoSenha = nomeUsuario.equals("456");
        //Exibindo resultados
        System.out.println("o nome do usuario está correto? " + resultadoNome);
        System.out.println("a senha está correta? " + resultadoSenha);
    }
}
