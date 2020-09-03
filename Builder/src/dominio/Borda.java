package dominio;

public enum Borda 
{
	CATUPIRY(1.0),
	CHEDDER(2.0);
	
	private double valor;
	
	private Borda(double valor) 
	{
		this.valor = valor;
	}
	
	public double getValor()
	{
		return valor;
	}
}
