package tiposprimitivos; 


/**
 * @author EduardaRosa
 */

public class TiposPrimitivos {
       /**
        * @param args the command line arguments
        */
        public static void main(String[] args){
            
            //Declarando variaveis e tipos
            float nota = 8.5f;
            String nome = "Duda";
            
            System.out.println("A nota é " + nota);
            //Para trabalhar com casas decimais
            System.out.printf("A nota é %f \n", nota);
            System.out.printf("A nota é %.2f \n", nota);
            //Mais um formato de escrita na tela
            System.out.format("A nota de %s é %.4f \n", nome , nota);
        }
}