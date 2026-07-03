package ExercicioQuinze;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Yay objetoPessoa = new Yay();
		Scanner leitorScanner = new Scanner(System.in);
		
		System.out.print("Digite o peso (ex: 70,5): ");
		objetoPessoa.peso = leitorScanner.nextFloat();
		
		System.out.print("Digite a altura (ex: 1,75): ");
		objetoPessoa.altura = leitorScanner.nextFloat();
		
		System.out.println("O IMC é: " + objetoPessoa.calcularIMC());
		
		leitorScanner.close();	
	}
}