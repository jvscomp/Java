package colecoes.exercicio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TabelaHash {
	private int tamanho;
	Map<Integer, List<Integer>> mapa;
	
	
	//GET - SET	
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public Map<Integer, List<Integer>> getList() {
		return mapa;
	}

	public void setList(Map<Integer, List<Integer>> list) {
		this.mapa = list;
	}






	public TabelaHash(int tamanho) {
		super();
		this.tamanho = tamanho;
		mapa = new HashMap<>();
		for (int i = 0; i < tamanho; i++) {
			mapa.put(i, new ArrayList<Integer>());
		}
		
	}
	
	public int f(int n) {
		return n % tamanho;
	}
	public void add (int n) {
		mapa.get(f(n)).add(n);
	}
	public void remove(int n) {
		mapa.get(f(n)).remove(n);
	}
	@Override
	public String toString() {
		return "TabelaHash " + mapa;
	}
	
	public static void main(String[] args) {
		TabelaHash t1000 = new TabelaHash(4);
		System.out.println("Insira um valor:");
		Scanner rec = new Scanner(System.in);
		int op = rec.nextInt();
		t1000.add(op);
		
		System.out.println("Insira um valor:");
		op = rec.nextInt();
		t1000.add(op);
		
		System.out.println("Insira um valor:");
		op = rec.nextInt();
		t1000.add(op);
		
		System.out.println(t1000.toString());
		rec.close();
	}
}
