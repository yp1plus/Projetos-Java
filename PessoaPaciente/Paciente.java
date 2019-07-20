package pessoa_paciente;

public class Paciente extends Pessoa{
    double peso, altura;
    
    Paciente(double peso, double altura, String nome, int idade){
        super(nome,idade);
        this.peso = peso;
        this.altura = altura;    
    }
    
    public double calcularIMC(){
        return peso/(altura*altura);
    }
    
    public double pesoMínimo(){
        return 18.5*altura*altura;
    }
    
    public double pesoMáximo(){
        return 24.9*altura*altura;
    }
    
    public double pesoMédio(){
        return (pesoMínimo()+pesoMáximo())/2;
    }
    
    public void interpretarIMC(){
        if (calcularIMC()<18.5)
            System.out.println("Você está abaixo do peso ideal");
        else if (calcularIMC()<=24.9)
            System.out.println("Parabéns! Você está em seu peso normal");
        else if (calcularIMC()<=29.9)
            System.out.println("Atenção! Você está acima do seu peso normal "
                    + "(sobrepeso)");
        else if (calcularIMC()<=34.9)
            System.out.println("Cuidado! Obesidade grau I");
        else if (calcularIMC()<=39.9)
            System.out.println("Alerta! Obesidade grau II");
        else
            System.out.println("Alerta máximo! Obesidade grau III");
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Peso: "+peso);
        System.out.println("Altura: "+altura);
        System.out.println("Peso Mínimo: "+pesoMínimo());
        System.out.println("Peso Máximo: "+pesoMáximo());
        System.out.println("Peso Médio: "+pesoMédio());
        System.out.println("IMC: "+calcularIMC());
        interpretarIMC();
    } 
}
