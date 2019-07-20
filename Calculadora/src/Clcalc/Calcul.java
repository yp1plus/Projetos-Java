//By Yure Pablo em 18/01/2017

package Clcalc;

public class Calcul {
    int som,dv,mt,sub;
    int num1,num2;
    
    public Calcul (){
        this.num1 = 0;
        this.num2 = 0;
    }
    
    public void setNum1(int num1){
        this.num1 = num1;
    }
    
    public void setNum2(int num2){
       this.num2 = num2;
    }
    
    public int getNum1(){
        return num1;
    }
    
    public int getNum2(){
        return num2;
    }
    public void somar(){
        som = num1+num2;
    }
    
    public void dividir(){ 
        dv = num1/num2;
    }
    
    public void multiplicar(){
        mt = num1*num2;
    }
    
    public void subtrair(){
        sub = num1-num2;
    }
    
    public int getSom(){
        return som;
    }
    
    public int getDv(){
        return dv;
    }
    
    public int getMt(){
        return mt;
    }
    
    public int getSub(){
        return sub;
    }
}
