package com.lms.dao;

import java.util.List;

import com.lms.model.LeaveRes;

public interface LeaveResDao {
	
	public LeaveRes applyLeave(LeaveRes lev );
	public LeaveRes updateLeave(LeaveRes resq) ;
	public boolean updateStatus(String status,int request_id);
	public void deleteStatus(int request_id);
	public List<LeaveRes> showLevres();

}