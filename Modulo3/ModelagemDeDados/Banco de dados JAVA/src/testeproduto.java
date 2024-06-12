
public class testeproduto {

	public static void main(String[] args) {
		
		//Usando método Construtor
		
		Produto p[]= new Produto[3];
		p[0] = new Produto(1, "Calça Moleton", "Confortavel e custo beneficio", 59.99, 4.2f);
		p[1] = new Produto(2, "Max Steel", "Vem com vários acessórios!", 35.89, 4.9f);
		p[2] = new Produto(3, "Barbie", "A boneca mais famosa do mundo!", 49.99, 5.0f);
		
		//chamando métodos 
		
		p[0].status();
		p[1].status();
		p[2].status();
	}

}
