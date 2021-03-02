package mercadoDoZe;

import java.util.ArrayList;
import java.util.Date;


public class Mercadoria {
	private String nome;
	private Date validade;
	private Double peso;
	private	String marca;
	private	Double valor;
	
	private	boolean isActive;
	private	EnumSetor setor;
	private ArrayList<Fornecedor> fornecedores;
	
	public Mercadoria(String nome, Double valor) {
		this.nome = nome;
		this.valor = valor;
		this.isActive = true;
	}
	
	public Mercadoria() {
		this.isActive = true;
	}
	
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public EnumSetor getSetor() {
		return setor;
	}
	public void setSetor(EnumSetor setor) {
		this.setor = setor;
	}
	public ArrayList<Fornecedor> getFornecedores() {
		return fornecedores;
	}
	public void setFornecedores(ArrayList<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getValidade() {
		return validade;
	}
	public void setValidade(Date validade) {
		this.validade = validade;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
}
