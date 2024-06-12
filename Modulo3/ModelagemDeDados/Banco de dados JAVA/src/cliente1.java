public class cliente1 {

	public static void main(String[] args) {
		
		//criando objetos clientes
		
		Clientes c[] = new Clientes[3];
		
		c[0] = new Clientes("João Gui", 21, "70232145692", 1, 'M');
		c[1] = new Clientes("Luiz Edu", 23, "89076534521", 2, 'M');
		c[2] = new Clientes("Rielly Bar", 17, "34567589721", 3,'F');
		
		//Chamando Perfil dos clientes
		c[0].perfil();
		c[0].dadosCliente();
		c[0].fazerPedido();
		
		c[1].dadosCliente();
		c[1].ativo();
		c[1].fazerPedido();
		
		c[2].dadosCliente();
		c[2].ativo();
		c[2].fazerPedido();
	}
}
