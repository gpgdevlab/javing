package Heranca;

public class vendedor extends Funcionario {
    private int item;

    public vendedor(float salario, String cpf, String nome, int idade, int item, int diasTrabalhados) {
        super(salario, cpf, nome, idade, diasTrabalhados); 
        this.item = item;
    }

    public void setItem(int item) { 
        this.item = item; 
    }
    public int getItem() { 
        return item; 
    }

}
