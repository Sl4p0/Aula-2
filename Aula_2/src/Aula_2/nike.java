package Aula_2;

public class nike {

	public String modelo;
	public int numeracao;
	public String cor;
	public String raridade;
	
	public void pisa() {
		System.out.println(" O nike é" + modelo + "tenis" + numeracao);
		
	}

	public void GetTenis() {
		System.out.println(
				"Modelo: " + modelo +
				"\nNumeracao:" + numeracao +
				"\nCor: " + cor +
				"\nraridade: " + raridade
				);
}
}