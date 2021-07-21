/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduar
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        //Convertendo idade que é int para String
        int idade = 30; 
        String valor = Integer.toString(idade);
        System.out.println(valor);
        
        //Convertendo um valor String para int 
        String valorText = "50"; 
        int numero = Integer.parseInt(valorText);
        System.out.println(numero);
        
        //Convertendo um valor em String para Float
        String valorFloat = "3.5";
        float valorQuebrado = Float.parseFloat(valorFloat);
        System.out.println(valorQuebrado);
        
    }
}
