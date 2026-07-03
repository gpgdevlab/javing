package ExercicioQuinze;

public class Yay {
	float peso;
	float altura;
	
	public float calcularIMC() {
		float imc = peso /(altura * altura);
		return imc;
	}
}
