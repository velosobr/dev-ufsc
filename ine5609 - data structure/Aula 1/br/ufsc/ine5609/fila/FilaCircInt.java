package br.ufsc.ine5609.fila;

public class FilaCircInt {
	
	int[] filaElementos;
	int posIn, posFim, contador ;
	
	public FilaCircInt(int tamanho) {
		filaElementos = new int[tamanho];
		posIn = 0;
		posFim = 0;
		contador = 0;
		
	}
	
	boolean fVazia() {
		return (contador ==0);
	}
	
	boolean fCheia() {
		if(contador == filaElementos.length) {
			return true;
		}else {
			return false;
		}
	}
	public void entrar(int elemento) throws Exception{ 
		if(!this.fCheia()) {
			if(posFim +1 == filaElementos.length) {
				posFim = 0;
			}else {
				this.posFim++;
			}
			filaElementos[this.posFim] = elemento;
			contador++;
		}else {
			throw new Exception("Fila Cheia");
		}
	}
	
	/*
	 * @sair - metodo responsavel por fazer o valor sair da fila circular
	 * 
	 * */
	public int sair() throws Exception{
		if(!this.fVazia()) {
			int temp = filaElementos[posIn];
			posIn = (posIn+1)%filaElementos.length;
			contador--;
			return temp;
		}else {
			throw new Exception("Fila vazia");
		}
	}

}
