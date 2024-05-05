package DAO;

import java.sql.SQLException;
import java.util.List;

public interface DAO<T> {
	public T getT(int id) throws SQLException;
	public List<T> getAllT() throws SQLException;
	public void addT(T t)throws SQLException;
	public void updateT(T t) throws SQLException;
	public void deleteT(T t) throws SQLException;
}
