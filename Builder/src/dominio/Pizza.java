package dominio;
import java.util.ArrayList;
import java.util.List;

/**
 * Essa classe implementa um Produto.
 * Nesse exemplo o Produto será uma Pizza.
 */

public class Pizza 
{
	private String nome;
	private String sabor;
	private Double valor;
	private Double tempoFornoMin;
	private Tamanho tamanho;
	private Borda borda;
	private List<Ingrediente> ingredientes;
	
	public Pizza() 
	{
		ingredientes = new ArrayList<Ingrediente>();
	}
	
	/**
	 * Método para calcular o valor de cada tipo de pizza.
	 * O valor é calculado com base no tamanho, borda e ingredientes da pizza
	 * @return o valor calculado da pizza
	 */
	public double calcularValor()
	{
		double total = tamanho.getValor() + borda.getValor();
		
		// Acumula o valor de cada ingrediente
		for(Ingrediente i : ingredientes)
		{
			total += i.getValor();
		}
		return total;
	}
	
	
	/* Getters e setters *************/
	
	public String getNome() 
	{
		return nome;
	}
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	public String getSabor() 
	{
		return sabor;
	}
	
	public void setSabor(String sabor) 
	{
		this.sabor = sabor;
	}
	
	public Double getValor() 
	{
		return valor;
	}
	
	public void setValor(Double valor) 
	{
		this.valor = valor;
	}
	
	public Double getTempoFornoMin() 
	{
		return tempoFornoMin;
	}
	
	public void setTempoFornoMin(Double tempoForno) 
	{
		this.tempoFornoMin = tempoForno;
	}
	
	public Tamanho getTamanho() 
	{
		return tamanho;
	}
	
	public void setTamanho(Tamanho tamanho) 
	{
		this.tamanho = tamanho;
	}
	
	public Borda getBorda() 
	{
		return borda;
	}
	
	public void setBorda(Borda borda) 
	{
		this.borda = borda;
	}
	
	public List<Ingrediente> getIngredientes() 
	{
		return ingredientes;
	}

	@Override
	public String toString() 
	{
		int size = ingredientes.size();
		StringBuffer sb = new StringBuffer();
		sb.append(", ingredientes= {");
		
		for(int i = 0; i < size - 1; i++)
		{
			sb.append(ingredientes.get(i).name().toLowerCase());
			sb.append(", ");
		}
		sb.append(ingredientes.get(size - 1).name().toLowerCase());
		sb.append("}");
		
		return "Pizza [nome=" + nome + ", sabor=" + sabor + ", valor=" + valor + ", tempoForno=" + tempoFornoMin
				+ ", tamanho=" + tamanho + ", borda=" + borda + sb.toString() + "]";
	}
}