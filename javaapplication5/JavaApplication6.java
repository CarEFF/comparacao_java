
package javaapplication5;

public class JavaApplication6 {
    public static void main(String[] args) {
        String nome = "Marta";
        String sobrenome = "Silveira";
        
        //Exibindo quantidade de caracteres
        System.out.println("Tamanho do nome " + nome.length());
        System.out.println("Tamanho do sobrenome " + sobrenome.length());
        
        //Concatenando nome + nomeCompleto
        String nomeCompleto = nome.concat("").concat(sobrenome);
        
        //Exibindo nome completo usando método Strings - Maiúsculas
        System.out.println("Concatenção Maisculas" + nomeCompleto.toUpperCase());
        //Exibindo nome completo usando método Strings - Minusculas
        System.out.println("Concatenção Minúsculas" + nomeCompleto.toLowerCase());
    }
}
