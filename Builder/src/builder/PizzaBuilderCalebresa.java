package builder;

import dominio.Borda;
import dominio.Ingrediente;
import dominio.Pizza;
import dominio.Tamanho;

/**
 * Esse Builder implementa uma Pizza de calabresa.
 */

public class PizzaBuilderCalebresa implements IPizzaBuilder 
{
	private Pizza pizza;

	public PizzaBuilderCalebresa() 
	{
		pizza = new Pizza();
		pizza.setNome("Calabresa");
	}

	@Override
	public void preperarBorda(Borda borda) 
	{
		pizza.setBorda(borda);
	}

	@Override
	public void preperarMassa(Tamanho tamanho) 
	{
		pizza.setTamanho(tamanho);
	}

	@Override
	public void assar() {
		pizza.setTempoFornoMin(20.0);	
	}

	@Override
	public void calcularValor() 
	{
		// Valor base da pizza de calebresa + valor da categoria 'tradicional'
		pizza.setValor(pizza.calcularValor() + 2.0);
	}

	@Override
	public void inserirIngredientes() 
	{
		pizza.getIngredientes().add(Ingrediente.CALABRESA);
		pizza.getIngredientes().add(Ingrediente.SALAME);
		pizza.getIngredientes().add(Ingrediente.MUSSARELA);
		pizza.getIngredientes().add(Ingrediente.CEBOLA);
		pizza.getIngredientes().add(Ingrediente.AZEITONA);
		pizza.getIngredientes().add(Ingrediente.MOLHO_TOMATE);
	}

	@Override
	public Pizza getPizza() 
	{
		return pizza;
	}
}