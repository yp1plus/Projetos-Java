package banco;

public class ContaBancaria {
    String nomeCliente; int numConta; double saldo;

    ContaBancaria(String nomeCliente, int numConta, double saldo){
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        if (saldo>0)
            this.saldo = saldo;
        else
            this.saldo = 0;
    }

    public String getNomeCliente(){
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }

    public int getNumConta(){
        return numConta;
    }

    public void setNumConta(int numConta){
        this.numConta = numConta;
    }

    public double getSaldo(){
        return saldo;
    }

    public int sacar(double valor){
        if (valor>0 && valor<=saldo){
           saldo = saldo - valor;
           return 1;
        }
        else
           return 0;
    }

    public int depositar(double valor){
        if (valor>0){
           saldo = saldo+valor;
           return 1;
        }
        else
           return 0;
    }
    
    public void imprimir(){
        System.out.println("\n----------Dados da Conta------------");
        System.out.println("Nome do Cliente: "+getNomeCliente());
        System.out.println("Número da conta: "+getNumConta());
        System.out.println("Saldo da conta: "+getSaldo());
    }
}
