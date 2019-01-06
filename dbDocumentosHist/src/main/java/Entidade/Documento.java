package Entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Documento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	int tipoDoc;
	String governoCap;
	String autoridade;
	String provido;
	String cargo;
	String condicoes;
	String observacoes;
	String fonte;
	int dia;
	int mes;
	int ano;
	
	public Documento() {
		
	}
	
	public Documento(int tipoDoc, String governoCap, String autoridade, String provido, String cargo,
			String condicoes, String observacoes, String fonte, int dia, int mes, int ano) {
		this.tipoDoc = tipoDoc;
		this.governoCap = governoCap;
		this.autoridade = autoridade;
		this.provido = provido;
		this.cargo = cargo;
		this.condicoes = condicoes;
		this.observacoes = observacoes;
		this.fonte = fonte;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTipoDoc() {
		return tipoDoc;
	}

	public void setTipoDoc(int tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	public String getGovernoCap() {
		return governoCap;
	}

	public void setGovernoCap(String governoCap) {
		this.governoCap = governoCap;
	}

	public String getAutoridade() {
		return autoridade;
	}

	public void setAutoridade(String autoridade) {
		this.autoridade = autoridade;
	}

	public String getProvido() {
		return provido;
	}

	public void setProvido(String provido) {
		this.provido = provido;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getCondicoes() {
		return condicoes;
	}

	public void setCondicoes(String condicoes) {
		this.condicoes = condicoes;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public String getFonte() {
		return fonte;
	}

	public void setFonte(String fonte) {
		this.fonte = fonte;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
}
