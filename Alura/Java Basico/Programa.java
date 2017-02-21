class Programa {
	public static void main(String[] args){
		int idadeJoao = 18;
		int idadeMaria = 21;
		
		int soma  = idadeJoao+idadeMaria;
		System.out.println(soma);
		
		double pi = 3.1415;
		System.out.println(pi*2);
		
		boolean amigo = true;
		boolean inimigo = !amigo;
		
		System.out.println(amigo +"\n"+ inimigo);
		
		boolean maiordeIdade = idadeJoao <= 18;
		char letra = 'M';
		String nomeCompleto = "Daiane Silva";
		
		//tipos com letras minusculas já vem da linguagem
		
		System.out.println(nomeCompleto);
		long numeroGrande = 999999999999999L;
		System.out.println(numeroGrande);
		float outroPi = (float) 3.1;
		
		int numero2 = 10;
		long copiaNumero = numero2;
		//tudo que cabe no inteiro cabe no long
		
		
		long numero = 314;
		int CopiaNumero = (int) numero; //estamos forçando a conversão "Casting"
		
		int idadeVisitante = 15;
		boolean amigoDoDono = true;
		if (idadeVisitante >= 18 && amigoDoDono) {
			System.out.println("Entra na festa\n");
		}				
		else{
			System.out.println("Volte para casa\n");
		}
		
		for(int i = 0; i <= 100; i++){
			System.out.println("Parabéns pelo aniverário "+i);
		}
		
		for(int i = 0; i <= 10; i++){
			if(i % 2 == 0)
			{
				System.out.println(i*3);
			}
		}
		
		int num = 1;
		
		switch(num){
			case 1:
				System.out.println("um");
				break;
			case 2:
				System.out.println("dois");
				break;
			default:
				System.out.println("Numero muito grande");
		}
	}
}
