//By Yure Pablo em 23/01/2017

package PctPesquisa;

public class Pesquisa {
    private float salario, somasalario, maior, menor;
    private int quantfilhos, quant, somamsf;
    
    public Pesquisa(){
        salario = 0;
        quant = 0;
        quantfilhos = 0;
        somasalario = 0;
        maior = Float.MIN_VALUE;
        menor = Float.MAX_VALUE;
        quantfilhos = 0;
        somamsf = 0;
    }
    
    public int CalcularSalario(float s){
        if (s>=0){
            salario = s;
            return 1;
        }
        else{
            salario = 0;
            return 0;
        }
    }
    
    public int CalcularQuantFilhos(int q){
        if (q>=0){
            quantfilhos = q;
            return 1;
        }
        else{
            quantfilhos = 0;
            return 0;
        }
    }
    
    public void ContarPessoas(){
        quant = quant+1;
    }
    
    public int getQuant(){
        return quant;
    }
    
    public void SomarSalario(){
        somasalario = somasalario+salario;
    }
    
    public float getSomaSalario(){
        return somasalario;
    }
    
    public float media(){
        return somasalario/quant;
    }
    
    public void SomarMSF(){
        if (quantfilhos==0){
               somamsf = somamsf+1;
        }
    }
    
    public float Percentual(){
        return (somamsf*100)/quant;
    }
    
    public void CompararSalario(){
        if (salario>maior){
              maior = salario;
           }
           if (salario<menor){
               menor = salario;
           }
    }
    
    public float getMaior(){
        return maior;
    }
    
    public float getMenor(){
        return menor;
    }
    
}
