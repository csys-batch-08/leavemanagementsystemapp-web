package com.lms.dao;

import java.util.List;

import com.lms.model.ShowLevBal;

public interface ShowLevDao {

	public ShowLevBal insertLeave(ShowLevBal sb);

	public ShowLevBal casualBalance(ShowLevBal shw);

	public ShowLevBal medicalBalance(ShowLevBal shw1);

	public ShowLevBal paidLeave(ShowLevBal shw2);

	public List<ShowLevBal> showbal();

}
