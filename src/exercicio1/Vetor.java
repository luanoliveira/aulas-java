package exercicio1;

import java.util.Arrays;

public class Vetor {
	private Aluno[] alunos = new Aluno[100];
	
	public void adiciona(Aluno aluno) {
		for (int i = 0; i < alunos.length; i++) {
			if ( this.alunos[i] == null ) {
				this.alunos[i] = aluno;
				break;
			}
		}
	}
	
	public void adiciona(int posicao, Aluno aluno) {
		this.alunos[posicao] = aluno;
	}
	
	public Aluno pega(int posicao) {
		return this.alunos[posicao];
	}
	
	public void remove(int posicao) {
		this.alunos[posicao] = null;
	}
	
	public boolean contem(Aluno aluno) {
		for (Aluno a : this.alunos) {
			if ( a != null && a.equals(aluno) ) {
				return true;
			}
		}
		
		return false;
	}
	
	public int tamanho() {
		int tamanho = 0;
		
		for (int i = 0; i < alunos.length; i++) {
			if ( this.alunos[i] != null ) {
				tamanho+=1;
			}
		}
		
		return tamanho;
	}
	
	public String toString() {
		return Arrays.toString(alunos);
	}
}
