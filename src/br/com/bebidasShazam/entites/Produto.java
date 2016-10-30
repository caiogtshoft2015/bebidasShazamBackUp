package br.com.bebidasShazam.entites;

public class Produto {
	private int id_produto;
	private String nome;
	private Integer fornecedor;
	private Integer categoria;
	private double valorVenda;
	private double valorCusto;

	public Produto() {
		// TODO Auto-generated constructor stub
	}

	

	public Produto(int id_produto, String nome, Integer fornecedor, Integer categoria, double valorVenda,
			double valorCusto) {
		super();
		this.id_produto = id_produto;
		this.nome = nome;
		this.fornecedor = fornecedor;
		this.categoria = categoria;
		this.valorVenda = valorVenda;
		this.valorCusto = valorCusto;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCategoria() {
		return categoria;
	}

	public void setCategoria(Integer categoria) {
		this.categoria = categoria;
	}

	public Integer getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Integer fornecedor) {
		this.fornecedor = fornecedor;
	}

	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}

	public double getValorCusto() {
		return valorCusto;
	}

	public void setValorCusto(double valorCusto) {
		this.valorCusto = valorCusto;
	}

	public int getId_produto() {
		return id_produto;
	}

	public void setId_produto(int id_produto) {
		this.id_produto = id_produto;
	}

}
