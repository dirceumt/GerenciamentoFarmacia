public class Produtos {
	//cria classe produtos
	String descricao;
	double preco;
	boolean possuiPrecoEntre(double precoMinimo, double precoMaximo) {
		return preco >= precoMinimo && preco <= precoMaximo;
	} //cria dois métodos um para dar o preço dos produtos que recebe como argumentos o precoMinimo e precoMaximo
	// retornando os precos maior igual ao preco minimo e preco menor igual ao precoMaximo

	void imprimir() {
		System.out.printf("%s x R$%.2f%n", descricao, preco);
		//imprime a descricao e o preco do produto
	}

}