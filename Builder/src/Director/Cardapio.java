package Director;

import builder.IPizzaBuilder;
import dominio.Borda;
import dominio.Tamanho;

public class Cardapio 
{	
	public void pizzaComBordaNormal(IPizzaBuilder pizzaBuilder, Tamanho tamanho)
	{
		pizzaBuilder.preperarMassa(tamanho);
		pizzaBuilder.inserirIngredientes();
		pizzaBuilder.preperarBorda(Borda.CATUPIRY);
		pizzaBuilder.assar();
		pizzaBuilder.calcularValor();
	}
	
	public void pizzaComBordaEspecial(IPizzaBuilder pizzaBuilder, Tamanho tamanho)
	{
		pizzaBuilder.preperarMassa(tamanho);
		pizzaBuilder.inserirIngredientes();
		pizzaBuilder.preperarBorda(Borda.CHEDDER);
		pizzaBuilder.assar();
		pizzaBuilder.calcularValor();
	}
}

