
public class Pedido {

	//Atributos
	
	protected int idPedido;
	protected double valor;
	protected String cpf;
	
	//Métodos Públicos
	
	public void verPedido() {
		
		System.out.println("---Dados do pedido---");
		System.out.println("Id do Pedido: " + this.getIdPedido());
		System.out.println("Valor: " + this.getValor());
		System.out.println("CPF: " + this.getCpf());
	}
	
	//construtor
	
	public Pedido(int idPedido, double valor, String cpf) {
		
		this.idPedido = idPedido;
		this.valor = valor;
		this.cpf = cpf;
	}
	
	//métodos especiais

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
