package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SubCategoryDAOImpl implements SubCategoryDAO{
	
	@Override
	public SubCategory getT(int id) throws SQLException {
		Connection conn = Database.getConnection();
		String sql = "SELECT * FROM subcategory WHERE subCategoryId = ?";
	    PreparedStatement stmt = conn.prepareStatement(sql);
	    stmt.setInt(1, id);
		ResultSet rs = stmt.executeQuery();
		if(rs.next()) {
			return new SubCategory(rs.getInt("subCategoryId"), rs.getString("subCategoryName"), rs.getString("subCategoryCoverageDetails"));
		}
		return null;
	}

	@Override
	public List<SubCategory> getAllT() throws SQLException {
		List<SubCategory> list = new ArrayList<SubCategory>();
		Connection conn = Database.getConnection();
		String sql = "SELECT * FROM subcategory";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			list.add(new SubCategory(rs.getInt("subCategoryId"), rs.getString("subCategoryName"), rs.getString("subCategoryCoverageDetails")));
		}
		return list;
	}
	@Override
	public void addT(SubCategory t) throws SQLException {
		Connection conn = Database.getConnection();
		String str = "INSERT INTO subCategory VALUES (?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(str);
		pstmt.setInt(1, t.getSubCategoryId());
		pstmt.setString(2, t.getSubCategoryName());
		pstmt.setString(3, t.getSubCategoryCoverageDetails());
		int rows_affected = pstmt.executeUpdate();
		System.out.println(rows_affected);
	}

	@Override
	public void updateT(SubCategory t) throws SQLException {
		Connection conn = Database.getConnection();
		String sql = "UPDATE subCategory SET subCategoryId=?, subCategoryName=?, "
				+ "subCategoryCoverageDetails=? WHERE subCategoryId=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, t.getSubCategoryId());
		pstmt.setString(2, t.getSubCategoryName());
		pstmt.setString(3, t.getSubCategoryCoverageDetails());
		pstmt.setInt(4, t.getSubCategoryId());
		int rows = pstmt.executeUpdate();
		System.out.println(rows);
	}

	@Override
	public void deleteT(SubCategory t) throws SQLException {
		Connection conn = Database.getConnection();
		String sql = "DELETE FROM subCategory WHERE subCategoryId = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, t.getSubCategoryId());
		int rows = pstmt.executeUpdate();
		System.out.println(rows);
		
	}

}
