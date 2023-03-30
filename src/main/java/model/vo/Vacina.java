package model.vo;

import java.sql.Date;

public class Vacina {
	
	private String paisDeOrigem;
	private int estagioDePesquisa;
	private Date dataDePesquisa;
	private Pessoa pesquisador;
	
	public Vacina(String paisDeOrigem, int estagioDePesquisa, Date dataDePesquisa, Pessoa pesquisador) {
		super();
		this.paisDeOrigem = paisDeOrigem;
		this.estagioDePesquisa = estagioDePesquisa;
		this.dataDePesquisa = dataDePesquisa;
		this.pesquisador = pesquisador;
	}

	public String getPaisDeOrigem() {
		return paisDeOrigem;
	}

	public void setPaisDeOrigem(String paisDeOrigem) {
		this.paisDeOrigem = paisDeOrigem;
	}

	public int getEstagioDePesquisa() {
		return estagioDePesquisa;
	}

	public void setEstagioDePesquisa(int estagioDePesquisa) {
		this.estagioDePesquisa = estagioDePesquisa;
	}

	public Date getDataDePesquisa() {
		return dataDePesquisa;
	}

	public void setDataDePesquisa(Date dataDePesquisa) {
		this.dataDePesquisa = dataDePesquisa;
	}

	public Pessoa getPesquisador() {
		return pesquisador;
	}

	public void setPesquisador(Pessoa pesquisador) {
		this.pesquisador = pesquisador;
	}
	
}
