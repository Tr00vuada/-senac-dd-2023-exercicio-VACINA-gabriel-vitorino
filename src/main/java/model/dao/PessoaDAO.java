package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.vo.Pessoa;


public class PessoaDAO {
	
	//Insert de pessoa:
	public Pessoa inserir(Pessoa novaPessoa) {
		Connection conexao = Banco.getConnection();
		String sql =  " INSERT INTO PESSOA (ID, NOME, CPF, "
					+ " SEXO, DATADENASCIMENTO) "
				    + " VALUES (?,?,?,?,?) ";
		
		PreparedStatement query = Banco.getPreparedStatementWithPk(conexao, sql);
		
		try {
			query.setInt(1, novaPessoa.getId());
			query.setString(2, novaPessoa.getNome());
			query.setInt(3, novaPessoa.getCpf());
			query.setString(4, novaPessoa.getSexo());
			query.setInt(5, novaPessoa.getDataDeNascimento());
			query.execute();
			
			ResultSet resultado = query.getGeneratedKeys();
			if(resultado.next()) {
				novaPessoa.setId(resultado.getInt(1));
			}
			
		}catch (SQLException e){
			System.out.println("Erro ao inserir uma nova pessoa ! "
					+ "\nCausa: " + e.getMessage());
		}finally {
			Banco.closePreparedStatement(query);
			Banco.closeConnection(conexao);
		}
		
	return novaPessoa;
	}
	
	//Update de pessoa:
	public boolean atualizar(Pessoa atualizarPessoa) {
		boolean atualizou = false;
		
		Connection conexao = Banco.getConnection();
		String sql = "UPDATE PESSOA "
				+ "	SET ID = ?, NOME = ?, CPF = ?, SEXO = ?, DATADENASCIMENTO = ? "
				+ "	WHERE ID = ? ";
		PreparedStatement query = Banco.getPreparedStatement(conexao, sql);
		
		
		
		
		
		return atualizou;
	}
}
