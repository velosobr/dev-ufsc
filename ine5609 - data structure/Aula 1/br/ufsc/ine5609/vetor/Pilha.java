package br.ufsc.ine5609.vetor;

public class Pilha {
	
	private int[] elementos;
	private int top;
	
	public Pilha(int capacidade) {
		this.elementos = new int[capacidade];
		this.top = -1;
	}
	
	public void push(int elemento) throws Exception {
		if(this.top < this.elementos.length) {
		this.elementos[this.top] = elemento;
		this.top++;
		}else {
			throw new Exception("Vetor já está cheio");
		}
	} 
	
	public int[] getElementos() {
		return elementos;
		
	}

}
