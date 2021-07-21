 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
/**
 *
 * @author eduar
 */
public class Vetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        List<String> esportes = new Vector<>();
        //Add os esportes a lista 
        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Tenis de mesa");
        esportes.add("Handebol");
        
        //Altera a posição 2 do vetor
        esportes.set(2, "Ping Pong");
        
        //Remove o esporte da posição 2; 
        
        esportes.remove(2);
        
        //Retorna o primeiro item do vetor
        System.out.println(esportes.get(0));
        
        for(String esporte: esportes){
            System.out.println(esporte);
        }
    }
}
