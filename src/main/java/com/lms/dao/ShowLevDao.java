package com.lms.dao;

import java.sql.ResultSet;
import java.util.List;

import com.lms.model.ShowLevBal;

public interface ShowLevDao {
	
	public ShowLevBal insertleave(ShowLevBal sb);
	public ShowLevBal updatebal(ShowLevBal shw);
	public ShowLevBal updatebal1(ShowLevBal shw1);
	public ShowLevBal updatebal2(ShowLevBal shw2);
	public List<ShowLevBal>showbal();

}
