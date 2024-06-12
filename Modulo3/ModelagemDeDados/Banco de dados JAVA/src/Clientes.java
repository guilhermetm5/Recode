//Feito por João Guilherme RECODE PRO ALDEIA, SQUAD 4.
//Professor: Caique Pereira
public class Clientes {

	//Atributos
	public String nome;
	public int idade;
	protected String cpf;
	protected int idCliente;
	public char sexo;
	public boolean status;
	
	//métodos públicos
	public void perfil() {
		System.out.println("===Perfil Público===");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Sexo: " + this.getSexo());
		System.out.println("Usuário: " + this.getStatus());
	}
	public void dadosCliente() {
		System.out.println("=====DADOS DO CLIENTE=====");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Id do Cliente: " + this.getIdCliente());
		System.out.println("Cpf: " + this.getCpf());
		System.out.println("Sexo: " + this.getSexo());
		
	}
	public void fazerPedido() {
		if (this.getStatus()) {
			if (this.getIdade() < 18) {
				System.out.println("Pedido não pode ser feito por menor de idade!");
			} else {
				System.out.println("Pedido Feito!");
			}
		}else {
			System.out.println("Pedido não foi feito!");
		}
		
	}
	public void ativo() {
		this.setStatus(true);
	}
	//construtor
	
	public Clientes(String nome, int idade, String cpf, int idCliente, char sexo) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.idCliente = idCliente;
		this.sexo = sexo;
	}
	
	//métodos especiais
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public boolean getStatus() {
		if (this.status == true) {
			System.out.println("Usuário Ativo");
		} else {
			System.out.println("Usuário Inativo");
		}
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
