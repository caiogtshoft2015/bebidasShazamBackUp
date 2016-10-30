package br.com.bebidasShazam.persistence;

import br.com.bebidasShazam.entites.ClientePF;
import br.com.bebidasShazam.entites.Produto;

public class ProdutoDAO extends DAO {
	
	public void insertProduto(Produto produto) throws Exception{
		abreConexao();

		String query = "insert into produto (nome, fornecedor, categoria"
		+ ",valor_venda, valor_custo) values (?,?,?,?,?)";
		stmt = con.prepareStatement(query);

		stmt.setString(1, produto.getNome());
		stmt.setLong(2, produto.getFornecedor());
		stmt.setLong(3, produto.getCategoria());
		stmt.setDouble(4, produto.getValorVenda());
		stmt.setDouble(5, produto.getValorCusto());

		stmt.execute();

		stmt.close();

		fechaConexao();
		
		
	}
	
	public Produto findById(int id) throws Exception {
		abreConexao();

		String query = "select * from produto where id_produto = ?";

		stmt = con.prepareStatement(query);

		stmt.setInt(1, id);

		rs = stmt.executeQuery();

		Produto produto = new Produto();

		while (rs.next()) {
			produto.setId_produto(rs.getInt("id_produto"));
			produto.setNome(rs.getString("nome"));
			produto.setCategoria(rs.getLong("telefone"));
			produto.setFornecedor(rs.getInt("cpf"));
			produto.setValorCusto(rs.getInt("endereco"));
			produto.setValorVenda(rs.getDouble("valor_venda"));
		}

		stmt.close();

		fechaConexao();

		return cliente;

	}
	
	
}
