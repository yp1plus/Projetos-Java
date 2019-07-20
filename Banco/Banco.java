//By Yure Pablo em 16/09/2016

package banco;

import java.util.Scanner;

public class Banco {
    
    public static void main(String[] args) {
        int tipoConta; String nomeCliente; int numConta;
        double saldo, rendimento, valor, limite;

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual conta deseja abrir? Digite: ");
        System.out.println("1 - Conta Bancária");
        System.out.println("2 - Conta Poupança");
        System.out.println("3 - Conta Especial");
        tipoConta = sc.nextInt();

        System.out.print("Informe o nome do cliente: ");
        nomeCliente = sc.nextLine();
        nomeCliente = sc.nextLine();
        System.out.print("Informe o número da conta: ");
        numConta = sc.nextInt();
        System.out.print("Informe o saldo: ");
        saldo = sc.nextDouble();   
            
        switch(tipoConta){
            case 1:
                ContaBancaria cliente1;
                cliente1 = new ContaBancaria(nomeCliente,numConta,saldo);
                cliente1.imprimir();
                System.out.print("\nQuanto deseja sacar? ");
                valor = sc.nextDouble();
                switch (cliente1.sacar(valor)){
                    case 0: 
                        System.out.println("O saque não pôde ser realizado!");
                        break;
                    case 1:
                        System.out.println("Saque realizado com sucesso!"); 
                        break;
                }
                System.out.println("Saldo: "+cliente1.getSaldo());
                System.out.print("\nQuanto deseja depositar? ");
                valor = sc.nextDouble();
                switch (cliente1.depositar(valor)){
                    case 0: 
                        System.out.println("O depósito não pôde ser "
                                + "realizado!");
                        break;
                    case 1:
                        System.out.println("Depósito realizado com sucesso!"); 
                        break;    
                }
                System.out.println("Saldo: "+cliente1.getSaldo());
                break;
            case 2:
                ContaPoupanca cliente2;
                cliente2 = new ContaPoupanca(nomeCliente,numConta,saldo);
                cliente2.imprimir();
                System.out.print("\nInforme a taxa percentual de rendimento "
                        + "do mês: ");
                rendimento = sc.nextDouble();
                switch(cliente2.calcularRendimento(rendimento)){
                    case 0: 
                        System.out.println("Rendimento não pôde ser aplicado!");
                        break;
                    case 1:
                        System.out.println("Rendimento aplicado com sucesso!"); 
                        break;
                }
                System.out.println("Saldo: "+cliente2.getSaldo());
                System.out.print("\nQuanto deseja sacar? ");
                valor = sc.nextDouble();
                switch (cliente2.sacar(valor)){
                    case 0: 
                        System.out.println("O saque não pôde ser realizado!");
                        break;
                    case 1:
                        System.out.println("Saque realizado com sucesso!"); 
                        break;
                
                }
                System.out.println("Saldo: "+cliente2.getSaldo());
                System.out.print("\nQuanto deseja depositar? ");
                valor = sc.nextDouble();
                switch (cliente2.depositar(valor)){
                    case 0: 
                        System.out.println("O depósito não pôde ser "
                                + "realizado!");
                        break;
                    case 1:
                        System.out.println("Depósito realizado com sucesso!"); 
                        break;    
                }
                System.out.println("Saldo: "+cliente2.getSaldo());
                break;  
            case 3:
                System.out.print("Informe o limite da conta: ");
                limite = sc.nextDouble();
                ContaEspecial cliente3;
                cliente3 = new ContaEspecial(nomeCliente, numConta, saldo, 
                limite);
                cliente3.imprimir();
                System.out.print("\nQuanto deseja sacar? ");
                valor = sc.nextDouble();
                switch (cliente3.sacar(valor)){
                    case 0: 
                        System.out.println("O saque não pôde ser realizado!");
                        break;
                    case 1:
                        System.out.println("Saque realizado com sucesso!"); 
                        break;  
                }
                System.out.println("Saldo: "+cliente3.getSaldo());
                System.out.print("\nQuanto deseja depositar? ");
                valor = sc.nextDouble();
                switch (cliente3.depositar(valor)){
                    case 0: 
                        System.out.println("O depósito não pôde ser "
                                + "realizado!");
                        break;
                    case 1:
                        System.out.println("Depósito realizado com sucesso!"); 
                        break;    
                }
                System.out.println("Saldo: "+cliente3.getSaldo());
        }
    }
}
