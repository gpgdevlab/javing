package ExercicioQuinze;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Pessoa objetoPessoa = new Pessoa(70.0f, 1.70f);

		boolean x = true;

		while (x) {
			try (Scanner leitorScanner = new Scanner(System.in)) {
			System.out.print("Digite o peso (ex: 70,5): ");
			objetoPessoa.setPeso(leitorScanner.nextFloat());

			System.out.print("Digite a altura (ex: 1,75): ");
			objetoPessoa.setAltura(leitorScanner.nextFloat());

			System.out.println("O IMC é: " + objetoPessoa.calcularIMC());

			x = false;
			
			leitorScanner.close();
		} catch (Exception e) {
     		 System.out.println("Something went wrong.");
		}
		}
		
	}
}
