package br.com.bebidasShazam.principal;

import br.com.bebidasShazam.entites.Endereco;
import br.com.bebidasShazam.persistence.EnderecoDAO;

public class Main {

	public static void main(String[] args) {
		
//		Endereco e = new Endereco("Rua teste", "Jardom Angela", "12457-265", "S�o Paulo", "SP");
//
//		EnderecoDAO enderecoDao = new EnderecoDAO();
//		
//		try {
//			enderecoDao.insertEndereco(e);
//		} catch (Exception e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		String valor = "25";
		Integer teste = Integer.valueOf(valor);
		System.out.println(teste+3);
		
	}

}
