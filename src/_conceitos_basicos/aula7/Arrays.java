package _conceitos_basicos.aula7;

public class Arrays {

	public static void main(String[] args) {
		
		double[] temperaturas = new double[365];
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33;
		temperaturas[3] = 34;
		temperaturas[4] = 33.1;
		
		System.out.println("O valor da temperatura do dia 3 �: " + temperaturas[2]);
		
		System.out.println("O tamanho do array: " + temperaturas.length);
		
		int cont = 0;
		while(cont <  temperaturas.length) {
			System.out.println("O valor da temperatura do dia " + (cont + 1) +" �: " + temperaturas[cont]);
			cont++;
		}
		
		for(double temp: temperaturas) {
			System.out.println(temp);
		}
	}
}
