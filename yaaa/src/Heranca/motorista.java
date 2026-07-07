package Heranca;

public class Motorista extends Funcionario { 
    private int corridas;
    private int diasTrabalhados;

    public Motorista(float salario, String cpf, String nome, int idade, int corridas, int diasTrabalhados) {
        super(salario, cpf, nome, idade); 
        this.corridas = corridas;
        this.diasTrabalhados = diasTrabalhados;
    }

    public void setCorridas(int corridas) { this.corridas = corridas; }
    public int getCorridas() { return corridas; }

    public void setDiasTrabalhados(int diasTrabalhados) { this.diasTrabalhados = diasTrabalhados; }
    public int getDiasTrabalhados() { return diasTrabalhados; }
}
