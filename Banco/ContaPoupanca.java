package banco;

public class ContaPoupanca extends ContaBancaria {
    ContaPoupanca(String nomeCliente, int numConta, double saldo){
        super(nomeCliente,numConta,saldo);
    }

    public int calcularRendimento(double valor){
        if (valor>0){
        super.saldo = super.saldo + (super.saldo*valor/100);
        return 1;
        }
        else
          return 0;   
    }
}
