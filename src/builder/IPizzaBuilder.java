package builder;

import dominio.Borda;
import dominio.Pizza;
import dominio.Tamanho;


/**
 * Essa classe implementa o contrato que um builder deve cumprir.
 * Note a ordem correta de produção da pizza será definida pelo Director.
 */

public interface IPizzaBuilder 
{
	public void preperarBorda(Borda borda);
	public void preperarMassa(Tamanho tamanho);
	public void assar();
	public void calcularValor();
	public void inserirIngredientes();
	public Pizza getPizza();
}