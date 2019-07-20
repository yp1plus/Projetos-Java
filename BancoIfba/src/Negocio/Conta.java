//By Yure Pablo em 18/01/2017

package Negocio;

public class Conta {
    private int numero; // apenas a conta tem acesso a ele. por isso o private
    private String titular;
    private float saldo;
    
    //metodos construtores
    //nome e numero sao obrigatorios de serem informados
    public Conta (int n, String t, float s){
        numero = n;
        titular = t;
        
        if (s>=0) saldo = s; //Não posso receber saldo negativo
        else saldo=0;
                
    }
    
    public Conta (int n, String t){ // Em caso de nao informar o saldo
        numero = n;
        titular = t;
        saldo = 0;
    }
    
    //Metodo para depositar
    public int depositar (float valor)
    {
        if (valor>0)
        {
            saldo = saldo + valor;
            return 1; //Deposito realizado com sucesso
        }
        else
            return 0; // Deposito nao realizado
    } 
    
    //Metodo sacar
    public int sacar (float valor)
    {
        if (saldo>= valor && valor>0)
        {
            saldo = saldo - valor;
            return 1; // Saque realizado com sucesso
        }
        else
            return 0; // Saque não realizado
    }
    
    //Métodos GET
    public int getNumero ()      //Retorna numero
    {
        return numero;
    }        
    
    public String getTitular()   //Retorna nome do titular
    {
        return titular;
    }        
    
    public float getSaldo ()    //Retorna saldo
    {
        return saldo;
    }        
}
