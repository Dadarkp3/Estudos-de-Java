class Conta1{
	private double saldo;
	private double limite;
	private Cliente titular;
	private int agencia;
	private int numero;

	 static int totaldeContas = 0;
		
	public Conta1(Cliente cliente){
		this.titular = cliente;
		totaldeContas++;
		this.numero = totaldeContas;
	}
		
	public void saca(double valor){
		if(this.saldo+this.limite >= valor){
			this.saldo -= valor;
		}
		else System.out.print("Saldo insuficiente");
	}
	
	void deposita(double valor){
		this.saldo += valor;
	}
	
	public void getNumero(){
		System.out.println(this.numero);
	}
	
	public double getSaldo(){
		return (this.saldo); 
	}

}

class Cliente{
	String nome;
	String endereço;
}

class TestaConta{
	public static void main(String[] args){
		Cliente dadosDaiane = new Cliente();
		dadosDaiane.nome = "Daiane Silva";
		Conta1 daiane = new Conta1(dadosDaiane);
		daiane.deposita(200);
		daiane.saca(100);
		System.out.println(daiane.getSaldo());
		Cliente dadosJoao = new Cliente();
		Conta1 joao = new Conta1(dadosJoao);
		joao.getNumero();
		daiane.getNumero();
	}
}
