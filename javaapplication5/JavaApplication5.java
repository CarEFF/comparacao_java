
package javaapplication5;

import java.awt.BorderLayout;
import java.util.Scanner;

public class JavaApplication5 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
      
        float n1, n2, n3, media, freq;
        int cargaH = 40;
        int limiteDeFalta;
        
        
        
        System.out.println("INFORME A PRIMERA NOTA:");
        n1 = teclado.nextFloat();
        System.out.println("INFORME A SEGUNDA NOTA:");
        n2 = teclado.nextFloat();
        System.out.println("INFORME A TERCEIRA NOTA:");
        n3 = teclado.nextFloat();
    
        media = (n1+n2+n3)/3;
        
        System.out.println("FREQUENCIA DO ALUNO:");
        freq = teclado.nextFloat();
        
        freq = (freq / cargaH) * 100;
        limiteDeFalta = (cargaH * 75)/100;
        
        if (limiteDeFalta >=30) {
            System.out.println("REPROVADO POR FALTA: ");
        }
        
        else if(media >=7 && freq <30) {
            System.out.println("SUA FREQUENCIA É: "+freq);
            System.out.println("APROVADO COM MEDIA: "+media);
        }
        else if(media >= 5 && freq <30) {
            System.out.println("RECUPERAÇÃO COM MEDIA: "+media);
        }
        else if(media < 5){
            System.out.println("REPROVADO COM MEDIA: "+media);
        }
        
        else if (freq < 30) {
            System.out.println("REPROVADO POR FREQUENCIA: "+freq);
        }else{
            System.out.println("REPROVADO POR MEDIA: "+media);
        }
        teclado.close();
    }
    
}
