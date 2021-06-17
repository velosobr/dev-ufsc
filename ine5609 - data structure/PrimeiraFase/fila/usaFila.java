package fila;

public class usaFila {

	public static void main(String[] args) throws Exception {
		FilaCircInt mf1, mf2;

		mf1 = new FilaCircInt(10);
		mf2 = new FilaCircInt(5727);
		
		mf1.entrar(55);
		mf1.entrar(11);
		mf1.entrar(22);
		mf2.entrar(mf1.sair());
		mf1.entrar(543);
		
		int[] elementosMf1 = mf1.getFilaElementos();
		int[] elementosMf2 = mf2.getFilaElementos();


		for (int elm:
			 elementosMf1) {
			System.out.println(elm);
		}
		System.out.println("############-----------############");
		for (int elm:
			 elementosMf2) {
			System.out.println(elm);
		}
		System.out.println("############-----------############");
		for (int elm:
				elementosMf1) {
			System.out.println(elm);
		}
		

		
	}

}
