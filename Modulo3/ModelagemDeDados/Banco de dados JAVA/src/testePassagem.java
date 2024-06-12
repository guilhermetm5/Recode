
public class testePassagem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//novas passagens
		
		Passagem p1 = new Passagem();
		Passagem p2 = new Passagem();
		Passagem p3 = new Passagem();
		
		p1.id = 1;
		p1.quantidade = 2f;
		p1.tipo = "Ticket Parintins";
		p1.valor = 599.99;
		
		p2.id = 2;
		p2.quantidade = 5f;
		p2.tipo = "Ticket Manacapuru";
		p2.valor = 109.99;
		
		p3.id = 3;
		p3.quantidade = 8f;
		p3.tipo = "Ticket Novo Airão";
		p3.valor = 89.99;
		
		p1.verPassagem();
		p2.verPassagem();
		p3.verPassagem();
	}

}
