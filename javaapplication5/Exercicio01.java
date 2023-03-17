/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author senaiden
 */
public class Exercicio01 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        String usuarioCorreto = "jorge";
        String senhaCorreto = "555";

                
        System.out.println("INFORME SEU USUÁRIO");
        String loginUsuario = teclado.nextLine();
        System.out.println("INFORME SUA SENHA");
        String loginSenha = teclado.nextLine();
        
        
        boolean resultadoUsuario = usuarioCorreto.equals(loginUsuario);
        boolean resultadoSenha = senhaCorreto.equals(loginSenha);
        
        if (resultadoUsuario && resultadoSenha) {
            System.out.println("Bem vindo usuario");
            
        }else{
            System.out.println("Tente novamente");
        }
        
        
        teclado.close();
    }
}
