package Aula_2;

public class Cachorro {
public String nome;
public int idade;
public String cor;
public String raca;

public void Latir () {
	System.out.println(" O cachorro:" + nome + "Latiu");
	
}

public void GetCachorro() {
	System.out.println(
			"Nome: " + nome +
			"\nRaça:" + raca +
			"\nIdade:" + idade + 
			"\nCor: " + cor
			);
}
}

