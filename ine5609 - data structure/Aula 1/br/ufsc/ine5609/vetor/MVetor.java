package br.ufsc.ine5609.vetor;

public class MVetor {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(2);
		try {

			vetor.adiciona("elemento 1");
			vetor.adiciona("elemento 2");
			vetor.adiciona("elemento 3");
				
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
