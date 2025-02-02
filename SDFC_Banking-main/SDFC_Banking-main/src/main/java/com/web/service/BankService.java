package com.web.service;

import com.web.model.SdfcBank;

public interface BankService {
	
	public String regAccount(String password,String cpassword,SdfcBank bank);
	public SdfcBank loginAccount(int accno,String name,String password);
	public SdfcBank getBalanceAccount(int accno);
	public SdfcBank getDepositAccount(int accno,String name,String password,double amount);
	public SdfcBank depositInAccount(int accno,String name,String password,double amount);
	public SdfcBank getwithdrawAccount(int accno,String name,String password,double amount);
	public SdfcBank withdrawInAccount(int accno,String name,String password,double amount);
	public SdfcBank getTransferAccount(int accno,String name,String password,double amount);
	public SdfcBank transferAccount(int accno,String name,String password,double amount,int accno1,double t_ammount);
	public SdfcBank getCloseForm(int accno,String name,String password);
	public SdfcBank deactiveAccount(int accno,String name,String password);	 
	
}
