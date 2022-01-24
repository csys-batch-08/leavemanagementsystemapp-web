package com.lms.dao;

import java.util.List;

import com.lms.model.LeaveRes;

public interface LeaveResDao {
	
	public LeaveRes applyLeave(LeaveRes lev );
	public LeaveRes updatelev(LeaveRes resq) ;
	public boolean updatestatus(String status,int request_id);
	public void deletestatus(int request_id);
	public List<LeaveRes> showLevres();

}