package javabasico;

//primeiro dia funçoes basicas com parametros
//segundo dia uso de arrays e metodo de entrada
public class Iniciante {

	public static void main(String[] args) {
	System.out.println("Hello World!");
	// variaveis
			int numero1;
			int numero2;
			int resultado;
		numero1=5;
		numero2=7;
		resultado=numero1+numero2;
		System.out.println( "é "+resultado+" pois é a soma de "+ numero1 +" e " + numero2);
		// Abaixo funções
soma(numero1, 58);

	}
	public static int soma(int num1,int num2) {
		//funçao do tipo inteira com parametros
		int resultado2=num1+num2;
		System.out.println(resultado2);
		return resultado2;
	}
	public static void listaDeCompra() {
		String listCompras[];
		listCompras[]=("arroz","feijão","Carne","sabão");
		System.out.println(listCompras);
		
		
	}

	
	
}
