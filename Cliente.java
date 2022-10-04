package NickBank;

public class Cliente {
    private String nome;
    private String endereco;
    private String CPF;
    private int idade;

    //Getters e Setters
    public String getNome(){
        return this.nome;
    }

    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public void setEndereco(String novoEndereco){
        this.endereco = novoEndereco;
    }

    public String getCPF(){
        return this.CPF;
    }

    public void setCPF(String novoCPF){
        this.CPF = novoCPF;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int novaIdade){
        this.idade = novaIdade;
    }

    Cliente(String nome, String endereco, String CPF, int idade){
        this.nome = nome;
        this.endereco = endereco;
        this.CPF = CPF;
        this.idade = idade;
    }
}
