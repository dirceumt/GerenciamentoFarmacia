import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Cadastro cadastro = new Cadastro(); //instancia a classe Cadastro e cria um objeto Cadastro e atribui a var
		// cadastro

		Produtos item1 = new Produtos(); //cria um objeto Produtos instanciando a classe Produtos e atribuindo a item1
		item1.descricao = "Dipirona"; //chama as variáveis de instância descricao e preco atribuindo valores a elas
		item1.preco = 5.00;

		Produtos item2 = new Produtos();//cria outro objeto e faz a mesma coisa do anterior atribuindo a item2
		item2.descricao = "Ibuprofeno";
		item2.preco = 10.00;

		Produtos item3 = new Produtos(); //cria outro objeto e faz a mesma coisa do anterior atribuindo a item3
		item3.descricao = "Fralda G";
		item3.preco = 50.00;

		cadastro.adicionarItem(item1);
		cadastro.adicionarItem(item2);
		cadastro.adicionarItem(item3);
		//pega a variavel cadastro e chama o metodo adicionarItem da classe Cadastro que tem como parametro Produto
		//item que instancia a classe Produtos e recebe os objetos Produtos() criados e armazena no arraylist os
		// objetos(produtos) criados

		ArrayList<Produtos> itensBaratos = cadastro.consultarItensPorPreco(  0, 100);

		for (Produtos item : itensBaratos) {
			System.out.printf("%s x R$%.2f%n", item.descricao, item.preco);
		}
	}

}