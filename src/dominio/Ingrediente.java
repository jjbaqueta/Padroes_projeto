package dominio;

public enum Ingrediente 
{
	CALABRESA(2.0),
	CATUPIRY(2.0),
	CHEDDAR(2.5),
	CEBOLA(0.5),
	AZEITONA(1.0),
	SALAME(3.5),
	TOMATE(0.5),
	PIMENTAO(1.0),
	MANJERICAO(0.2),
	ALHO(0.2),
	MUSSARELA(1.0),
	MOLHO_TOMATE(1.0),
	MOLHO_ESPECIAL(3.0),
	PROVOLONE(3.0),
	PARMESAO(2.5);
	
	private Double valor;
	
	private Ingrediente(Double valor) 
	{
		this.valor = valor;
	}
	
	public double getValor()
	{
		return valor;
	}
}