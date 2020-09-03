package builder;

import dominio.Borda;
import dominio.Ingrediente;
import dominio.Pizza;
import dominio.Tamanho;

/**
 * Esse Builder implementa uma Pizza de 5 queijos.
 */

public class PizzaBuilderQueijos implements IPizzaBuilder 
{
	private Pizza pizza;

	public PizzaBuilderQueijos() 
	{
		pizza = new Pizza();
		pizza.setNome("5-Queijos");
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
		pizza.setTempoFornoMin(15.0);
	}

	@Override
	public void calcularValor() 
	{
		// Valor base da pizza de 5-Queijos + valor da categoria 'premium'
		pizza.setValor(pizza.calcularValor() + 3.5);
	}

	@Override
	public void inserirIngredientes() 
	{
		pizza.getIngredientes().add(Ingrediente.PROVOLONE);
		pizza.getIngredientes().add(Ingrediente.CATUPIRY);
		pizza.getIngredientes().add(Ingrediente.MUSSARELA);
		pizza.getIngredientes().add(Ingrediente.CHEDDAR);
		pizza.getIngredientes().add(Ingrediente.PARMESAO);
		pizza.getIngredientes().add(Ingrediente.MOLHO_ESPECIAL);
	}

	@Override
	public Pizza getPizza() 
	{
		return pizza;
	}
}