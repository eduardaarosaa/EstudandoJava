package com.company;
import java.awt.*;
import java.util.Date;
import java.util.Locale;

public class Main {
    //Hora do sistema
    public static void main(String[] args) {
        //Criando um objeto
        Date relogio  = new Date();
        System.out.println("A hora do sistema é ");
        System.out.println(relogio.toString());
        setIdioma();
        setResolucao();
    }
    //Idioma do sistema operacional
    public static void setIdioma(){
        Locale idioma = Locale.getDefault();
        System.out.println(idioma.getDisplayLanguage());
    }
    //Pegar resoluca da tela
    public static void setResolucao(){
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int largura = (int) tela.getWidth();
        int altura = (int) tela.getHeight();
        System.out.println("Sua tela tem resolução " + largura + " x " + altura);
    }
}
