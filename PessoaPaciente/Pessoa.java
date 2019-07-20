package pessoa_paciente;

public class Pessoa {
    String nome; int idade;
    
    Pessoa(String nome,int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void imprimir(){
        System.out.println("Nome: "+getNome());
        System.out.println("Idade: "+getIdade());
    }
}
