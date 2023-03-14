//POJI implementation

package com.java.layer3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.java.layer2.Currency;

public class CurrencyDaoImpl implements CurrencyDao {

	Connection conn;

	public CurrencyDaoImpl() {
		try {
			System.out.println("Trying to load the driver...");
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			System.out.println("1. driver...loaded");

			System.out.println("Trying to connect to the DB...");
			this.conn = DriverManager.getConnection("jdbc:mysql://localhost/mysql", "root", "root123");
			System.out.println("2. Connected to the DB :" + conn);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addCurrency(Currency e) {

		try {

			PreparedStatement pst = conn.prepareStatement("insert into currency values(?,?,?,?)");
			System.out.println("3. Statement created....");

			pst.setInt(1, e.getCurrencyId());
			pst.setString(2, e.getSourceCurrency());
			pst.setString(3, e.getTargetCurrency());
			pst.setFloat(4, e.getLoadFactor());

			int rows = pst.executeUpdate(); // run the insert query

			System.out.println("4. executed the query: " + rows + " row(s) inserted");

		} catch (SQLException e1) {
			e1.printStackTrace();
		}

	}

	@Override
	public List<Currency> getCurrency() {

		List<Currency> empList = new ArrayList<Currency>(); // blank list

		try {

			Statement statement = conn.createStatement();
			System.out.println("3. Statement created....");

			ResultSet result = statement.executeQuery("SELECT * FROM CURRENCY");
			System.out.println("4. execute the query");

			System.out.println("5. acquire the result and process it");

			while (result.next()) {

				Currency currency = new Currency();

				currency.setCurrencyId(result.getInt(1));
				currency.setSourceCurrency(result.getString(2));
				currency.setTargetCurrency(result.getString(3));
				currency.setLoadFactor(result.getFloat(4));
				empList.add(currency); // push this object in the list
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		return empList;
	}

	@Override
	public Currency getCurrency(int empno) {

		Currency currency = new Currency();
		try {

			Statement statement = conn.createStatement();
			System.out.println("3. Statement created....");

			ResultSet result = statement.executeQuery("SELECT * FROM CURRENCY WHERE currencyId = "+empno);
			System.out.println("4. execute the query");
			
			System.out.println("5. acquire the result and process it");

			
			if (result.next()) {
				currency.setCurrencyId(result.getInt(1));
				currency.setSourceCurrency(result.getString(2));
				currency.setTargetCurrency(result.getString(3));
				currency.setLoadFactor(result.getFloat(4));
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		return currency;
	}

	@Override
	public void updateCurrency(Currency e) {
		try {

			PreparedStatement pst = conn.prepareStatement("update currency set source_currency=?, target_currency=?, amount_to_convert=? where currencyId=?");
			System.out.println("3. Statement created....");

			pst.setString(1, e.getSourceCurrency());
			pst.setString(2, e.getTargetCurrency());
			pst.setFloat(3, e.getLoadFactor());
			pst.setInt(4, e.getCurrencyId());

			int rows = pst.executeUpdate(); // run the insert query

			System.out.println("4. executed the query: " + rows + " row(s) updated");

		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}

	@Override
	public void deleteCurrency(int empno) {

		try {
			PreparedStatement pst = conn.prepareStatement("delete from currency where currencyId="+empno);
			System.out.println("3. Statement created....");


			int rows = pst.executeUpdate(); // run the insert query

			System.out.println("4. executed the query: " + rows + " row(s) deleted");

		}
		catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
}
