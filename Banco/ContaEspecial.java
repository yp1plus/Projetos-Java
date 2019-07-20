package banco;

public class ContaEspecial extends ContaBancaria{
    double limite;

    public ContaEspecial(String nomeCliente, int numConta, double saldo, 
    double limite) {
        super(nomeCliente, numConta, saldo);
        if (limite>0)
        this.limite = limite;
        else
          this.limite = 0;
    }

    public int sacar(double valor){
        if (valor>0 && valor<=super.saldo+limite){
           super.saldo = super.saldo - valor;
           return 1;
        }
        else
          return 0;
    }
    
    public void imprimir(){
        super.imprimir();
        System.out.println("Limite da conta: "+limite);
    }
    
}
