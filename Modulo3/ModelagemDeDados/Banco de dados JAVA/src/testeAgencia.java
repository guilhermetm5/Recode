
public class testeAgencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Agencia agencia = new Agencia();
		Agencia agencia1 = new Agencia();
		Agencia agencia2 = new Agencia();
		
		
		agencia.id = 1;
		agencia.nome = "Wonka Travel";
		agencia.cnpj = "76936129371";
		
		agencia1.id = 2;
		agencia1.nome = "Billi Trips";
		agencia1.cnpj = "769329371";
		
		agencia2.id = 3;
		agencia2.nome = "Quadrivago";
		agencia2.cnpj = "76129371";
		
		agencia.verAgencia();
		agencia1.verAgencia();
		agencia2.verAgencia();
	}

}
