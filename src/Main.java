import Director.Cardapio;
import builder.PizzaBuilderCalebresa;
import builder.PizzaBuilderQueijos;
import dominio.Tamanho;

public class Main 
{
	public static void main(String[] args) 
	{
		// Director
		Cardapio cardapio = new Cardapio();
		
		// Pedido 1:
		System.out.println("Pedido 1: pizza de calebresa normal.");
		PizzaBuilderCalebresa pizzaCalebresa = new PizzaBuilderCalebresa();
		cardapio.pizzaComBordaNormal(pizzaCalebresa, Tamanho.GRANDE);
		System.out.println(pizzaCalebresa.getPizza());
		
		// Pedido 2:
		System.out.println("Pedido 2: pizza de 5-queijos especial.");
		PizzaBuilderQueijos pizza5Queijos = new PizzaBuilderQueijos();
		cardapio.pizzaComBordaNormal(pizza5Queijos, Tamanho.BIG);
		System.out.println(pizza5Queijos.getPizza());
	}
}
