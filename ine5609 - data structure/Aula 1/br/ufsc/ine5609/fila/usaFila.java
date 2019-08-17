package br.ufsc.ine5609.fila;

public class usaFila {

	public static void main(String[] args) throws Exception {
		FilaCircInt mf1, mf2;
		
		mf1 = new FilaCircInt(10);
		mf2 = new FilaCircInt(5727);
		
		mf1.entrar(55);
		mf1.entrar(11);
		mf1.entrar(22);
		mf2.entrar(mf1.sair());
		
		
	}

}
