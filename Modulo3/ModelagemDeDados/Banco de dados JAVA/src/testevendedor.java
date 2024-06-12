
public class testevendedor {

	public static void main(String[] args) {
		
		vendedor v[]= new vendedor[3];
		
		v[0] = new vendedor(1, "Edu dos gamecards", "76567845321", 'M');
		v[1] = new vendedor(2, "Antonia das bonecas", "89067534556", 'F');
		v[2] = new vendedor(3, "Joao das joias", "87909896721", 'M');
		
		v[0].verVendedor();
		v[0].verVendedor();
		v[0].verVendedor();
		
		
	}

}
