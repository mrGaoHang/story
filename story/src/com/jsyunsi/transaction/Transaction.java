package com.jsyunsi.transaction;

import java.sql.SQLException;

public interface Transaction {
	
	public abstract void begin()throws SQLException;
	
	public abstract void commit()throws SQLException;
	
	public abstract void rollback()throws SQLException;
}
