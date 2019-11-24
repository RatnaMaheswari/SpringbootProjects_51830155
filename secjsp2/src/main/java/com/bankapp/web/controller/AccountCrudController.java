package com.bankapp.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bankapp.model.entities.Account;
import com.bankapp.model.entities.Customer;
import com.bankapp.model.service.AccountService;
import com.bankapp.web.forms.AccountFormBean;

@Controller
@RequestMapping(path="accountmgt")
public class AccountCrudController {
	
	@Autowired
	private AccountService accountService;
	
	@GetMapping
	public String accountMenu(){
		return "account_mgt";
	}
	@GetMapping(path="addaccount")
	public String addNewAccountGet(ModelMap map){
		map.addAttribute("accountFormBean", new AccountFormBean());
		return "add_account";
	}
	
	@PostMapping(path="addaccount")
	public String addNewAccountPost(@ModelAttribute(name="accountFormBean") 
	AccountFormBean accountFormBean){
	
		Customer customer = initCustomer(accountFormBean);
		
		Account account=new Account(accountFormBean.getBalance());
		account.setCustomer(customer);
		
		
		accountService.createAccount(account);
		return "redirect:/accountmgt";
	}
	
	
	
	private Customer initCustomer(AccountFormBean accountFormBean) {
		Customer customer=new Customer(accountFormBean.getName(),
				accountFormBean.getEmail(),
				accountFormBean.getPhone(),
				accountFormBean.getAddress(),
				accountFormBean.getCity(),
				accountFormBean.getCountry());
		return customer;
	}
	
}









