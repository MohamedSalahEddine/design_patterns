package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class SubCategory {

	private int subCategoryId;
	private String subCategoryName;
	private String subCategoryCoverageDetails;
	
	public SubCategory(int subCategoryId, String subCategoryName, String subCategoryCoverageDetails) {
		this.subCategoryId = subCategoryId;
		this.subCategoryName = subCategoryName;
		this.subCategoryCoverageDetails = subCategoryCoverageDetails;
	}

	public int getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(int subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public String getSubCategoryName() {
		return subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

	public String getSubCategoryCoverageDetails() {
		return subCategoryCoverageDetails;
	}

	public void setSubCategoryCoverageDetails(String subCategoryCoverageDetails) {
		this.subCategoryCoverageDetails = subCategoryCoverageDetails;
	}

	@Override
	public String toString() {
		return "SubCategory [subCategoryId=" + subCategoryId + ", subCategoryName=" + subCategoryName
				+ ", subCategoryCoverageDetails=" + subCategoryCoverageDetails + "]";
	}
	
	
}
