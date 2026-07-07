package Heranca;

public class Funcionario {
    private float salario;
    private String cpf;
    private String nome;
    private int idade;


    public Funcionario(float salario, String cpf, String nome, int idade) {
        this.idade = idade;
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
        
    public float getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public String getCPF() {
        return cpf;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

}
