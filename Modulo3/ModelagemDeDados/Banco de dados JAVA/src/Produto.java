// Feito por João Guilherme

public class Produto {

	//Atributos
	public int Idproduto;
	public String nome;
	public String descricao;
	public double valor;
	public float nota;
	
	//método construtor
	
	public Produto(int Idproduto, String nome, String descricao, double valor, float nota) {
		this.Idproduto = Idproduto;
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.nota = nota;
	}
	
	
	//métodos getters e setters
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public float getNota() {
		return nota;
	}


	public void setNota(float nota) {
		this.nota = nota;
	}

	public int getIdproduto() {
		return Idproduto;
	}


	public void setIdproduto(int idproduto) {
		Idproduto = idproduto;
	}
	
	//métodos comuns


	public void status() {
		System.out.println("----Sobre o produto-----");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Descrição: " + this.getDescricao());
		System.out.println("Notaa: " + this.getNome());
		System.out.println("Valor: " + this.getValor());
	}
}
