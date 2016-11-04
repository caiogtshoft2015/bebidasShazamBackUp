package br.com.bebidasShazam.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bebidasShazam.entites.Produto;
import br.com.bebidasShazam.persistence.ProdutoDAO;

@WebServlet("/ControleProduto")
public class ControleProduto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ControleProduto() {

	}

	protected void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String acao = request.getParameter("acao");
		if (acao.equalsIgnoreCase("cadastrarProduto")) {
			try {
				Produto produto = new Produto();
				int optFornecedor = 0;
				int optCategoria = 0;
				if (request.getParameter("fornecedor").equalsIgnoreCase("Broto Sábio")) {
					optFornecedor = 1;
				} else if (request.getParameter("fornecedor").equalsIgnoreCase("Estrela Artois")) {
					optFornecedor = 2;
				} else if (request.getParameter("fornecedor").equalsIgnoreCase("Caracu")) {
					optFornecedor = 3;
				}

				if (request.getParameter("categoria").equalsIgnoreCase("250ml")) {
					optCategoria = 1;
				} else if (request.getParameter("categoria").equalsIgnoreCase("350ml")) {
					optCategoria = 2;
				} else if (request.getParameter("categoria").equalsIgnoreCase("Long Neck")) {
					optCategoria = 3;
				} else if (request.getParameter("categoria").equalsIgnoreCase("Barril")) {
					optCategoria = 4;
				}

				produto.setNome(request.getParameter("nome"));
				produto.setFornecedor(optFornecedor);
				produto.setCategoria(optCategoria);
				produto.setValorVenda(Integer.valueOf("valor_venda"));
				produto.setValorCusto(Integer.valueOf("valor_custo"));

				ProdutoDAO produtoDAO = new ProdutoDAO();

				produtoDAO.insertProduto(produto);

			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
