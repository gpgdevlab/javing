package ExercicioQuinze;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

<<<<<<< HEAD
        Pessoa objetoPessoa = new Pessoa(70.0f, 1.70f);
        boolean x = true;

        try (Scanner leitorScanner = new Scanner(System.in)) {
            
            while (x) {
                try {
                    System.out.print("Digite o peso (ex: 70,5): ");
                    objetoPessoa.setPeso(leitorScanner.nextFloat());

                    System.out.print("Digite a altura (ex: 1,75): ");
                    objetoPessoa.setAltura(leitorScanner.nextFloat());

                    System.out.println("O IMC é: " + objetoPessoa.calcularIMC());

                    x = false; 

                } catch (InputMismatchException e) {
                    System.out.println("Erro: Por favor, digite apenas números usando a vírgula como separador decimal.");
                    leitorScanner.nextLine(); 
                } catch (Exception e) {
                    System.out.println("Algo deu errado. Tente novamente.");
                    leitorScanner.nextLine();
                }
            }
        } 
    }
}
=======
		Pessoa objetoPessoa = new Pessoa(70.0f, 1.70f);
		Scanner leitorScanner = new Scanner(System.in);
		
		System.out.print("Digite o peso (ex: 70,5): ");
		objetoPessoa.setPeso(leitorScanner.nextFloat());
		
		System.out.print("Digite a altura (ex: 1,75): ");
		objetoPessoa.setAltura(leitorScanner.nextFloat());
		
		System.out.println("O IMC é: " + objetoPessoa.calcularIMC());
		
		leitorScanner.close();
	}
}
>>>>>>> 09f8f08 (herança things)
