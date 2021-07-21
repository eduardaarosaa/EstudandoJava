/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/**
 *
 * @author eduar
 */
public class listsJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        List<String> nomes = new ArrayList<>();
        nomes.add("Rosa");
        nomes.add("Duda");
        nomes.add("Jonatas");
        nomes.add("Eduarda");
      
        System.out.println(nomes);
        //Ordena os nomes por ordem alfabetica 
        Collections.sort(nomes);
        System.out.println(nomes);
        
         /**
          * O uso do for para imprimir a lista completa
          */
         for(String nomeItem: nomes){
            
            System.out.println(nomeItem);
        }
        /**
         * O uso do iterator com while para imprimir a lista completa
         */
         Iterator<String> iterator = nomes.iterator();
         
         while(iterator.hasNext()){
             System.out.println("--->" + iterator.next());
         }
         
        
        //Alteração de conteudo dentro da lista 
        /**
         * @param first - a posicao 
         * @param seccond - o valor novo a ser alterado
         */
        nomes.set(0, "Rosinha"); 
        
        System.out.println(nomes);
        
        //Remove uma posição de um array - Pode-se usar a posicao ou o valor da posicao 
        nomes.remove(1);
       
        System.out.println(nomes);
        
        nomes.remove("Rosa");
        
        System.out.println(nomes);
        /**
         * O metodo GET RETORNA um valor ao ser atribuido a uma variavel
         */
        String nome = nomes.get(1);
        System.out.println(nome);
        
        /**
         * Quando adicionamos uma posição que não contem no nosso array, ele dá o erro
         * IndexOutOfBoundsExeception - Error
         */
        
        //Retornando a posicao do elemento que estamos solicitando.
        //Quando retorno -1 é porque o elemento não existe na lista.
        int posicao = nomes.indexOf("Rosinha");
        
        System.out.println(posicao);
        
        //Descobrindo o tamanho de um array
        int tamanho = nomes.size(); 
        System.out.println(tamanho);
        
        //procurando um elemento na lista - boolean
        boolean temJonatas = nomes.contains("Jonatas");
        System.out.println(temJonatas);
        
        //Limpando o lista 
       
        nomes.clear();
        
         //Verificar se o arrary está vazio
        boolean listaVazia = nomes.isEmpty(); 
        System.out.println(listaVazia);
        
        
    }
    
}
