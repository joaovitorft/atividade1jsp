package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import factory.ConnectionFactory;

public abstract class AbstractDAO<T> {
	protected Connection connection;

	public AbstractDAO() {
		this.connection = new ConnectionFactory().getConnection();

	}

	public abstract List<T> getLista();

	public abstract void adicionar(T objeto);
}
