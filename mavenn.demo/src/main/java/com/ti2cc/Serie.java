package com.ti2cc;

public class Serie {
	private int id;
	private String autor;
	private String personagem;
	private int ano;
	
	public Serie() {
		this.id = -1;
		this.autor = "";
		this.personagem = "";
		this.ano = -1;
	}
	
	public Serie(int id, String autor, String personagem, int ano) {
		this.id = id;
		this.autor = autor;
		this.personagem = personagem;
		this.ano = ano;
	}

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String getautor() {
		return autor;
	}

	public void setautor(String autor) {
		this.autor = autor;
	}

	public String getpersonagem() {
		return personagem;
	}

	public void setpersonagem(String personagem) {
		this.personagem = personagem;
	}

	public int getano() {
		return ano;
	}

	public void setano(int ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", autor=" + autor + ", personagem=" + personagem + ", ano=" + ano + "]";
	}
	
}
