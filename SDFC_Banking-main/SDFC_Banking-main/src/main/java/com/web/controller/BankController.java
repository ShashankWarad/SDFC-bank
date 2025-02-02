package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;


import com.web.model.SdfcBank;
import com.web.service.BankService;

@Controller
public class BankController 
{
	@Autowired
	private BankService service;
	
	
	@RequestMapping("/")
	public String home() 
	{
		return"home";
	}
		
	@RequestMapping("/register")
	public String newAccount() 
	{
		return"newAccount";
	}
	
	@RequestMapping("/success")
	public String bankNewAccountSave(@RequestParam String password,@RequestParam String c_password, SdfcBank bank)
	  {
	    String save = service.regAccount(password, c_password,bank);
		  return save;
	  }

	
	
	@RequestMapping("/login")
	public String login() 
	{
		return"login";
	}
	
	@RequestMapping("/dashbord")
		public ModelAndView login(@RequestParam int accno,@RequestParam String name,@RequestParam String password,ModelMap model)
		{
			SdfcBank bank = service.loginAccount(accno, name, password);

			if(bank == null)
			{
				RedirectView redirectView = new RedirectView("/passwordcheck",true);
				return new ModelAndView(redirectView);
			}
			else
			{
				model.put("command",bank);
				return new ModelAndView("dashbord");
			}
    }
	
	@RequestMapping("/dashbordl")
	public ModelAndView loginf(@PathVariable int accno, @PathVariable String name, @PathVariable String password, ModelMap model)
	{
		SdfcBank bank=service.loginAccount(accno, name, password);

		if(bank == null)
		{
			RedirectView redirectView =new RedirectView("/passwordcheck",true);
			return new ModelAndView(redirectView);
		}
		else
		{
			model.put("command",bank);
			return new ModelAndView("dashbord");	
		}
	}
	
	@RequestMapping("/passwordcheck")
	public String checkPassword()
	{
		
		return "passwordcheck";
	}
		
	@RequestMapping("/detail")
	public String balancrDetails(@RequestParam int accno, ModelMap model) 
	{
		model.put("command", service.getBalanceAccount(accno));
		return"details";	
	}
	
	@RequestMapping("/deposit")
	public String deposit() {
		return"deposit";	
	}

	@RequestMapping("/depositAmount")
	public ModelAndView depositAmount(@RequestParam int accno, @RequestParam String name, @RequestParam String password, @RequestParam double amount, ModelMap model) {
		SdfcBank bank = service.depositInAccount(accno, name, password, amount);
		if (bank != null) {
			model.put("command", bank);
			return new ModelAndView("depositSuccess");
		} else {
			return new ModelAndView("depositFailed");
		}
	}
	
	@RequestMapping("/withdraw")
	public String withdraw() {
		return"withdraw";	
	}
	@RequestMapping("/withdrawAmount")
	public ModelAndView withdrawAmount(@RequestParam int accno, @RequestParam String name, @RequestParam String password, @RequestParam double amount, ModelMap model) {
		SdfcBank bank = service.withdrawInAccount(accno, name, password, amount);
		if (bank != null) {
			model.put("command", bank);
			return new ModelAndView("withdrawSuccess");
		} else {
			return new ModelAndView("withdrawFailed");
		}
	}
	
	@RequestMapping("/transfer")
	public String transfer() {
		return"transfer";	
	}

	@RequestMapping("/transferAmount")
	public ModelAndView transferAmount(@RequestParam int accno, @RequestParam String name, @RequestParam String password, @RequestParam double amount, @RequestParam int accno1, ModelMap model) {
		SdfcBank bank = service.transferAccount(accno, name, password, amount, accno1, amount);
		if (bank != null) {
			model.put("command", bank);
			return new ModelAndView("transferSuccess");
		} else {
			return new ModelAndView("transferFailed");
		}
	}
	
	/*@RequestMapping("/closeAccount")
	public String close() {
		return"closeAccount";	
	}
	
	@RequestMapping("/reOpenAccount")
	public String reOpenAccount() {
		return"reOpenAccount";	
	}
	*/

	
	@RequestMapping("/aboutUs")
	public String aboutUs() {
		return"aboutUs";	
	}
	
	@RequestMapping("/contact")
	public String contact() {
		return"contact";	
	}

}

/*package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.web.model.SdfcBank;
import com.web.service.BankService;

@Controller
public class BankController {

	@Autowired
	private BankService service;

	@RequestMapping("/deposit")
	public String deposit() {
		return "deposit";
	}

	@RequestMapping("/depositAmount")
	public ModelAndView depositAmount(@RequestParam int accno, @RequestParam String name, @RequestParam String password, @RequestParam double amount, ModelMap model) {
		SdfcBank bank = service.depositInAccount(accno, name, password, amount);
		if (bank != null) {
			model.put("command", bank);
			return new ModelAndView("depositSuccess");
		} else {
			return new ModelAndView("depositFailed");
		}
	}

	@RequestMapping("/withdraw")
	public String withdraw() {
		return "withdraw";
	}

	@RequestMapping("/withdrawAmount")
	public ModelAndView withdrawAmount(@RequestParam int accno, @RequestParam String name, @RequestParam String password, @RequestParam double amount, ModelMap model) {
		SdfcBank bank = service.withdrawInAccount(accno, name, password, amount);
		if (bank != null) {
			model.put("command", bank);
			return new ModelAndView("withdrawSuccess");
		} else {
			return new ModelAndView("withdrawFailed");
		}
	}

	@RequestMapping("/transfer")
	public String transfer() {
		return "transfer";
	}

	@RequestMapping("/transferAmount")
	public ModelAndView transferAmount(@RequestParam int accno, @RequestParam String name, @RequestParam String password, @RequestParam double amount, @RequestParam int accno1, ModelMap model) {
		SdfcBank bank = service.transferAccount(accno, name, password, amount, accno1, amount);
		if (bank != null) {
			model.put("command", bank);
			return new ModelAndView("transferSuccess");
		} else {
			return new ModelAndView("transferFailed");
		}
	}
}
*/
