package br.com.bebidasShazam.persistence;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import br.com.bebidasShazam.entites.Funcionario;

public class FuncionarioDAO extends DAO {
	   
	    public void insertFuncionario(Funcionario funcionario) throws Exception{
	        abreConexao();
	        
	        String query = "insert into funcionario (nome, telefone, cargo, cpf) values (?, ?, ?, ?)";
	        
	        stmt = con.prepareStatement(query);
	        
	        stmt.setString(1, funcionario.getNome());
	        stmt.setString(2, funcionario.getTelefone());
	        stmt.setString(3, funcionario.getCargo());
	        stmt.setInt(4, funcionario.getCpf());
	        
	        stmt.execute();
	        
	        stmt.close();
	        
	        fechaConexao();
	        
	    }
	    
	    public Funcionario findByCpf(int cpf) throws Exception{
	        abreConexao();
	        
	        String query = "select * from funcionario where cpf = ?";
	        
	        stmt = con.prepareStatement(query);
	        
	        stmt.setInt(1, cpf);
	        
	        rs = stmt.executeQuery();
	        
	        Funcionario funcionario = new Funcionario();
	        
	        while(rs.next()){
	        	funcionario.setId_funcionario(rs.getInt("id_funcionario"));
	        	funcionario.setNome(rs.getString("nome"));
	        	funcionario.setTelefone(rs.getString("telefone"));
	        	funcionario.setCargo(rs.getString("cargo"));
	        	funcionario.setCpf(rs.getInt("cpf"));
	        
	    }
	        
	        stmt.close();
	        
	        fechaConexao();
	        
	        return funcionario;
	    
	    
	}
	    
	    public void deleteFuncionario(int cpf) throws Exception{
	    	
	    	abreConexao();
	    	
	    	String query = "delete from cliente_pf where cpf = ?";
	    	
	    	stmt = con.prepareStatement(query);
	    	
	    	stmt.setInt(1, cpf);
	    	
	    	stmt.execute();
	    	
	    	stmt.close();
	    	
	    	fechaConexao();
	    	
	    }
	    
	    public ArrayList<Funcionario> findAll() throws Exception{
	    	
	    	String query = "select * from funcionario";
	    	
	    	stmt = con.prepareStatement(query);
	    	
	    	rs = stmt.executeQuery();
	    	
	    	Funcionario funcionario = new Funcionario();
	    	
	    	ArrayList<Funcionario> lista = new ArrayList();
	    	
	    	while(rs.next()){
	    		
	    		stmt.setString(1, funcionario.getNome());
	    		stmt.setString(2, funcionario.getTelefone());
	    		stmt.setString(3, funcionario.getCargo());
	    		stmt.setInt(4, funcionario.getCpf());
	    	}
	    	
	    	stmt.close();
	    	
	    	fechaConexao();
	    	
	    	return lista;
	    }
}
