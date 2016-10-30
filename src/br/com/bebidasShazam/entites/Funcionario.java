package br.com.bebidasShazam.entites;

public class Funcionario extends PessoaFisica{
	private Integer id_funcionario;
	private String cargo;
	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}
	
	public Funcionario(String cargo, Integer cpf, String nome, String telefone) {
		super(cpf, nome, telefone);
		this.cargo = cargo;
	}

	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Integer getId_funcionario() {
		return id_funcionario;
	}
	public void setId_funcionario(Integer id_funcionario) {
		this.id_funcionario = id_funcionario;
	}
}
