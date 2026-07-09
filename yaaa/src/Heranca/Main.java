package Heranca;

package Heranca;

public class Main {
    public static void main(String[] args) {
  
        Motorista motora = new Motorista(3000.50f, "123.456.789-00", "Carlos Silva", 35, 42, 22);
     
        vendedor vend = new vendedor(2500.00f, "987.654.321-11", "Karla Souza", 28, 150, 20);
  
        System.out.println("=== DADOS DO MOTORISTA ===");
        System.out.println("Nome: " + motora.getNome());
        System.out.println("CPF: " + motora.getCPF());
        System.out.println("Idade: " + motora.getIdade());
        System.out.println("Salário: R$ " + motora.getSalario());
        System.out.println("Dias Trabalhados: " + motora.getDiasTrabalhados());
        System.out.println("Corridas realizadas: " + motora.getCorridas());
        
        System.out.println(); 
  
        System.out.println("=== DADOS DO VENDEDOR ===");
        System.out.println("Nome: " + vend.getNome());
        System.out.println("CPF: " + vend.getCPF());
        System.out.println("Idade: " + vend.getIdade());
        System.out.println("Salário: R$ " + vend.getSalario());
        System.out.println("Dias Trabalhados: " + vend.getDiasTrabalhados());
        System.out.println("Itens vendidos: " + vend.getItem());
    }
}
