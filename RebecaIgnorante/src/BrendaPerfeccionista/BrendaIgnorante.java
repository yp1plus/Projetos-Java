//By Yure Pablo em 27/01/2017

package BrendaPerfeccionista;

import java.awt.Color;

public class BrendaIgnorante {
    private Color brendaAzul = Color.blue;
    private Color rebecaVermelho = Color.red;
    private int raiva;
    private int oassuntoestadificil = 1;
    private int humilhação;
    private int euestousendohumilhado = 1;
    private boolean ironia;
    
    public void AgirBrenda(Color azul,int humilhação,String falso, String chato){
        Estressar(azul);
        Humilhar(humilhação);
        ChamarFalso(falso);
        ChamarChato(chato);
        SerIrônica();   
    }
    
    public String Ignorar(Color red){
        if (rebecaVermelho == Color.red){
           raiva = 1;
           return "Vou me matar!";
        }
        else {
           raiva = 0;
           return "Awwwnt!"; }
    }
    
    public String Perguntar(int dificil){
        if (oassuntoestadificil == dificil){
            return "AAAAAAAAA";
        }
        else return "Eba!";
    }
    
    public String Estressar(Color azul){
        if (brendaAzul == azul){
           raiva = 2;
           return "OOOO";
        }
        else{ raiva = 3; return "EEE";}
    }
    
    public String Humilhar(int humilhação){
        if (euestousendohumilhado == humilhação){
            return "Estou triste";
        }
        else return "Estou feliz";
    }
    
    public String ChamarFalso(String falso){
        if (falso == "Falso"){
            raiva = 5000;
            return "Triste Demais!";
        }
        else{ raiva = 0; return "Feliz!";}
    }
    
    public String ChamarChato(String Chato){
        if (Chato == "Chato"){
            raiva = 2000;
            return "Magoado!";
        }
        else {raiva = 0; return "Obrigado!";}
    }
    
    public String SerIrônica(){
        ironia = true;
        return "Oxe!";
    }

    public int getRaiva() {
        return raiva;
    }
    
    public String Elogiar(){
        raiva = 0;
        return "Estou felicíssimo!";    
    }
      
}
