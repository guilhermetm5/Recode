
public class vendedor {

	//atributos
	public int idVendedor;
	public String nome;
	protected String cpf;
	protected char sexo;
	
	
	//construtor
	public vendedor(int idVendedor, String nome, String cpf, char sexo) {
		
		this.idVendedor = idVendedor;
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
	}

	//Métodos
	
	void verVendedor() {
		System.out.println("================================");
		System.out.println("Vendedor nº: " + idVendedor + "\nNome: " + nome +"\nCPF: " + cpf +"\nSexo: " + sexo);
	}

	public int getIdVendedor() {
		return idVendedor;
	}

	public void setIdVendedor(int idVendedor) {
		this.idVendedor = idVendedor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	
}
