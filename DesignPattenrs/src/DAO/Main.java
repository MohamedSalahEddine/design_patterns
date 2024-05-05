package DAO;

import java.sql.SQLException;

public class Main {
	public static void main(String[] args) throws SQLException {
		SubCategoryDAOImpl subCategoryDAOImpl = new SubCategoryDAOImpl();
		subCategoryDAOImpl.deleteT(new SubCategory(9, "moyen bien","tu auras =) assurance mais pas le top tu vois"));
	}
}
