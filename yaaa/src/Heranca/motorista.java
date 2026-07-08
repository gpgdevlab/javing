package Heranca;

public class Motorista extends Funcionario { 
    private int corridas;

    public Motorista(float salario, String cpf, String nome, int idade, int corridas, int diasTrabalhados) {
        super(salario, cpf, nome, idade, diasTrabalhados); 
        this.corridas = corridas;

    }

    public void setCorridas(int corridas) { 
        this.corridas = corridas; 
    }

    public int getCorridas() {
         return corridas; 
    }


}
