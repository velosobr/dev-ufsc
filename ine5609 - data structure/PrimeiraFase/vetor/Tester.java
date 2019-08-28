package vetor;

public class Tester {

	public static void main(String[] args) {
		Pilha pilha= new Pilha(4);
		try {

			pilha.push(43);
			pilha.push(11);
			pilha.push(45);
			pilha.push(41);

				
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		int[] elementos = pilha.getElementos();
		
		for (int i = 0; i < elementos.length; i++) {
			System.out.println(elementos[i]);
			
		}
	}

}
