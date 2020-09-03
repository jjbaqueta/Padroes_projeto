package dominio;

public enum Tamanho 
{
	PEQUENA(9.99),
	MEDIA(15.99),
	GRANDE(25.99),
	FAMILIA(30.5),
	BIG(49.0);
	
	private Double valor;
	
	private Tamanho(double valor) 
	{
		this.valor = valor;
	}
	
	public double getValor()
	{
		return valor;
	}
}
