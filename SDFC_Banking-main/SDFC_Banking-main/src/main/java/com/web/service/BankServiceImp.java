package com.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.SdfcBank;
import com.web.repo.SdfcBankRepo;

import java.util.Optional;

@Service
public class BankServiceImp implements BankService {

	@Autowired
	private SdfcBankRepo repo;
	@Override
	public String regAccount(String password, String c_password, SdfcBank bank) {
		// TODO Auto-generated method stub
		 @SuppressWarnings("unused")
		    String msg="";
		    String view="";
		    String pass=password;
		    String c_pass=c_password;
		    String acc_status=bank.getStatus();
		    Double amt=bank.getAmount();
		    if(amt>5000)
		    {
		      if (pass.equals(c_pass))
		      {
		        acc_status="Active";
		        bank.setStatus(acc_status);
		        msg = repo.save(bank).toString();
		        view = "regvcreate";
		      } 
		      else {
		        msg = "failed";
		        view = "regvpassword";
		      }
		    }
		    else
		    {
		      msg = "failed";
		      view = "regvbalance";
		    }
		    return view;
	}

	@Override
	public SdfcBank loginAccount(int accno, String name, String password) {
		// TODO Auto-generated method stub
		SdfcBank bank = repo.findById(accno).get();
		int no = accno;
		String uname = name;
		String pass = password;
		
		int no1 = bank.getAccno();
		String uname1 = bank.getName();
		String pass1 = bank.getPassword();
		String stat = bank.getStatus();
		
		if(no == no1 && uname.equalsIgnoreCase(uname1) && pass.equals(pass1) && stat.equalsIgnoreCase("Active"))
		{
			return repo.findById(no).get();
		}
		else
		{
			return null;
		}
		
	}

	@Override
	public SdfcBank getBalanceAccount(int accno) {
		// TODO Auto-generated method stub
		SdfcBank get = repo.findById(accno).get();
		return get;
	}

	@Override
	public SdfcBank getDepositAccount(int accno, String name, String password, double amount) {
		// TODO Auto-generated method stub
Optional<SdfcBank> bankOptional = repo.findById(accno);
if (bankOptional.isPresent()) {
SdfcBank bank = bankOptional.get();
if (bank.getName().equalsIgnoreCase(name) && bank.getPassword().equals(password) && bank.getStatus().equalsIgnoreCase("Active")) {
return bank;
}
}
return null;
	}

	@Override
	public SdfcBank depositInAccount(int accno, String name, String password, double amount) {
		// TODO Auto-generated method stub
Optional<SdfcBank> bankOptional = repo.findById(accno);
if (bankOptional.isPresent()) {
SdfcBank bank = bankOptional.get();
if (bank.getName().equalsIgnoreCase(name) && bank.getPassword().equals(password) && bank.getStatus().equalsIgnoreCase("Active")) {
double currentBalance = bank.getAmount();
bank.setAmount(currentBalance + amount);
repo.save(bank);
return bank;
}
}
return null;
	}

	@Override
	public SdfcBank getwithdrawAccount(int accno, String name, String password, double amount) {
		// TODO Auto-generated method stub

		Optional<SdfcBank> bankOptional = repo.findById(accno);
		if (bankOptional.isPresent()) {
			SdfcBank bank = bankOptional.get();
			if (bank.getName().equalsIgnoreCase(name) && bank.getPassword().equals(password) && bank.getStatus().equalsIgnoreCase("Active")) {
				return bank;
			}
		}
		return null;
	}

	@Override
	public SdfcBank withdrawInAccount(int accno, String name, String password, double amount) {
		// TODO Auto-generated method stub
		//return null;
		Optional<SdfcBank> bankOptional = repo.findById(accno);
		if (bankOptional.isPresent()) {
			SdfcBank bank = bankOptional.get();
			if (bank.getName().equalsIgnoreCase(name) && bank.getPassword().equals(password) && bank.getStatus().equalsIgnoreCase("Active")) {
				double currentBalance = bank.getAmount();
				if (currentBalance >= amount) {
					bank.setAmount(currentBalance - amount);
					repo.save(bank);
					return bank;
				}
			}
		}
		return null;
	}

	@Override
	public SdfcBank getTransferAccount(int accno, String name, String password, double amount) {
		// TODO Auto-generated method stub
		Optional<SdfcBank> bankOptional = repo.findById(accno);
		if (bankOptional.isPresent()) {
			SdfcBank bank = bankOptional.get();
			if (bank.getName().equalsIgnoreCase(name) && bank.getPassword().equals(password) && bank.getStatus().equalsIgnoreCase("Active")) {
				return bank;
			}
		}
		return null;
	}

	@Override
	public SdfcBank transferAccount(int accno, String name, String password, double amount, int accno1,
			double t_amount) {
		// TODO Auto-generated method stub
		Optional<SdfcBank> fromAccountOptional = repo.findById(accno);
		Optional<SdfcBank> toAccountOptional = repo.findById(accno1);

		if (fromAccountOptional.isPresent() && toAccountOptional.isPresent()) {
			SdfcBank fromAccount = fromAccountOptional.get();
			SdfcBank toAccount = toAccountOptional.get();

			if (fromAccount.getName().equalsIgnoreCase(name) && fromAccount.getPassword().equals(password) && fromAccount.getStatus().equalsIgnoreCase("Active")) {
				double fromBalance = fromAccount.getAmount();
				if (fromBalance >= t_amount) {
					fromAccount.setAmount(fromBalance - t_amount);
					toAccount.setAmount(toAccount.getAmount() + t_amount);
					repo.save(fromAccount);
					repo.save(toAccount);
					return fromAccount;
				}
			}
		}
		return null;
	}

	@Override
	public SdfcBank getCloseForm(int accno, String name, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SdfcBank deactiveAccount(int accno, String name, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}

/**
package com.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.SdfcBank;
import com.web.repo.SdfcBankRepo;

import java.util.Optional;

@Service
public class BankServiceImp implements BankService {

	@Autowired
	private SdfcBankRepo repo;

	@Override
	public String regAccount(String password, String c_password, SdfcBank bank) {
		@SuppressWarnings("unused")
		String msg = "";
		String view = "";
		String pass = password;
		String c_pass = c_password;
		String acc_status = bank.getStatus();
		Double amt = bank.getAmount();
		if (amt > 5000) {
			if (pass.equals(c_pass)) {
				acc_status = "Active";
				bank.setStatus(acc_status);
				msg = repo.save(bank).toString();
				view = "regvcreate";
			} else {
				msg = "failed";
				view = "regvpassword";
			}
		} else {
			msg = "failed";
			view = "regvbalance";
		}
		return view;
	}

	@Override
	public SdfcBank loginAccount(int accno, String name, String password) {
		Optional<SdfcBank> bankOptional = repo.findById(accno);
		if (bankOptional.isPresent()) {
			SdfcBank bank = bankOptional.get();
			if (bank.getAccno() == accno && bank.getName().equalsIgnoreCase(name) && bank.getPassword().equals(password) && bank.getStatus().equalsIgnoreCase("Active")) {
				return bank;
			}
		}
		return null;
	}

	@Override
	public SdfcBank getBalanceAccount(int accno) {
		Optional<SdfcBank> bankOptional = repo.findById(accno);
		return bankOptional.orElse(null);
	}

	@Override
	public SdfcBank getDepositAccount(int accno, String name, String password, double amount) {
		Optional<SdfcBank> bankOptional = repo.findById(accno);
		if (bankOptional.isPresent()) {
			SdfcBank bank = bankOptional.get();
			if (bank.getName().equalsIgnoreCase(name) && bank.getPassword().equals(password) && bank.getStatus().equalsIgnoreCase("Active")) {
				return bank;
			}
		}
		return null;
	}

	@Override
	public SdfcBank depositInAccount(int accno, String name, String password, double amount) {
		Optional<SdfcBank> bankOptional = repo.findById(accno);
		if (bankOptional.isPresent()) {
			SdfcBank bank = bankOptional.get();
			if (bank.getName().equalsIgnoreCase(name) && bank.getPassword().equals(password) && bank.getStatus().equalsIgnoreCase("Active")) {
				double currentBalance = bank.getAmount();
				bank.setAmount(currentBalance + amount);
				repo.save(bank);
				return bank;
			}
		}
		return null;
	}

	@Override
	public SdfcBank getwithdrawAccount(int accno, String name, String password, double amount) {
		Optional<SdfcBank> bankOptional = repo.findById(accno);
		if (bankOptional.isPresent()) {
			SdfcBank bank = bankOptional.get();
			if (bank.getName().equalsIgnoreCase(name) && bank.getPassword().equals(password) && bank.getStatus().equalsIgnoreCase("Active")) {
				return bank;
			}
		}
		return null;
	}

	@Override
	public SdfcBank withdrawInAccount(int accno, String name, String password, double amount) {
		Optional<SdfcBank> bankOptional = repo.findById(accno);
		if (bankOptional.isPresent()) {
			SdfcBank bank = bankOptional.get();
			if (bank.getName().equalsIgnoreCase(name) && bank.getPassword().equals(password) && bank.getStatus().equalsIgnoreCase("Active")) {
				double currentBalance = bank.getAmount();
				if (currentBalance >= amount) {
					bank.setAmount(currentBalance - amount);
					repo.save(bank);
					return bank;
				}
			}
		}
		return null;
	}

	@Override
	public SdfcBank getTransferAccount(int accno, String name, String password, double amount) {
		Optional<SdfcBank> bankOptional = repo.findById(accno);
		if (bankOptional.isPresent()) {
			SdfcBank bank = bankOptional.get();
			if (bank.getName().equalsIgnoreCase(name) && bank.getPassword().equals(password) && bank.getStatus().equalsIgnoreCase("Active")) {
				return bank;
			}
		}
		return null;
	}

	@Override
	public SdfcBank transferAccount(int accno, String name, String password, double amount, int accno1, double t_amount) {
		Optional<SdfcBank> fromAccountOptional = repo.findById(accno);
		Optional<SdfcBank> toAccountOptional = repo.findById(accno1);

		if (fromAccountOptional.isPresent() && toAccountOptional.isPresent()) {
			SdfcBank fromAccount = fromAccountOptional.get();
			SdfcBank toAccount = toAccountOptional.get();

			if (fromAccount.getName().equalsIgnoreCase(name) && fromAccount.getPassword().equals(password) && fromAccount.getStatus().equalsIgnoreCase("Active")) {
				double fromBalance = fromAccount.getAmount();
				if (fromBalance >= t_amount) {
					fromAccount.setAmount(fromBalance - t_amount);
					toAccount.setAmount(toAccount.getAmount() + t_amount);
					repo.save(fromAccount);
					repo.save(toAccount);
					return fromAccount;
				}
			}
		}
		return null;
	}

	@Override
	public SdfcBank getCloseForm(int accno, String name, String password) {
		Optional<SdfcBank> bankOptional = repo.findById(accno);
		if (bankOptional.isPresent()) {
			SdfcBank bank = bankOptional.get();
			if (bank.getName().equalsIgnoreCase(name) && bank.getPassword().equals(password) && bank.getStatus().equalsIgnoreCase("Active")) {
				return bank;
			}
		}
		return null;
	}

	@Override
	public SdfcBank deactiveAccount(int accno, String name, String password) {
		Optional<SdfcBank> bankOptional = repo.findById(accno);
		if (bankOptional.isPresent()) {
			SdfcBank bank = bankOptional.get();
			if (bank.getName().equalsIgnoreCase(name) && bank.getPassword().equals(password) && bank.getStatus().equalsIgnoreCase("Active")) {
				bank.setStatus("Inactive");
				repo.save(bank);
				return bank;
			}
		}
		return null;
	}
}
 */