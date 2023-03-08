package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import factory.ConnectionFactory;
import model.Usuario;

public class UsuarioDao extends AbstractDAO<Usuario> {
	private List<Usuario> lista;

	public UsuarioDao() {
		super();
		lista = new ArrayList<Usuario>();
	}

	Connection connection = new ConnectionFactory().getConnection();
	PreparedStatement pstm = null;
	ResultSet rs = null;

	public List<Usuario> getLista() {
		try {
			pstm = connection.prepareStatement("select * from usuario");
			rs = pstm.executeQuery();
			while (rs.next()) {
				Usuario usuario = new Usuario(rs.getString("nome"), rs.getString("endereco"));
				lista.add(usuario);
			}
			rs.close();
			pstm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return lista;
	}

	public void adicionar(Usuario usuario) {
		try {
			pstm = connection.prepareStatement("insert into usuario(nome,endereco) values (?, ?)");
			pstm.setString(1, usuario.getNome());
			pstm.setString(2, usuario.getEndereco());
			pstm.executeUpdate();
			pstm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
