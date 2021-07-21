package tiposprimitivos; 
import java.util.Scanner;
/**
 * @author EduardaRosa
 */

public class TiposPrimitivos {
       /**
        * @param args the command line arguments
        */
        public static void main(String[] args){
           
            Scanner teclado = new Scanner(System.in);
            //Declarando variaveis e tipos
            System.out.println("Digite o nome do aluno: ");
            String nome = teclado.nextLine();
            System.out.println("Digite a nota do aluno: ");
            float nota = teclado.nextFloat();
            System.out.println("A nota é " + nota);
            //Para trabalhar com casas decimais
            System.out.printf("A nota é %f \n", nota);
            System.out.printf("A nota é %.2f \n", nota);
            //Mais um formato de escrita na tela
            System.out.format("A nota de %s é %.1f \n", nome , nota);
        }
}