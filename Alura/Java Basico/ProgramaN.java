class Conta {

	int numero;
	Pessoa titular;
	double saldo;
	long agencia;
	
	void deposita(double valor){
		this.saldo += valor;
	}
	
	void sacar(double valor){
		this.saldo -= valor;
	}

}

class Pessoa
{
	String nome;
	String cpf;
	String dataNascimento;	
}

class ProgramaN
{
	public static void main(String[] args){
		Conta daiane = new Conta();
		daiane.numero = 123;
		daiane.saldo = 800.0;
		daiane.titular = new Pessoa();
		daiane.titular.nome = "Daiane";
		daiane.titular.cpf = "1234556";
		daiane.titular.dataNascimento = "123312";
		daiane.agencia = 2957;
		
		Conta lucas = new Conta();
		lucas.saldo = 1000.0;
		lucas.agencia = 2341;
		
		System.out.println(daiane.saldo);
		System.out.println(lucas.saldo);
	}
}
