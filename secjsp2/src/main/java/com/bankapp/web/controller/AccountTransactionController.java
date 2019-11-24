package com.bankapp.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bankapp.model.service.AccountService;
import com.bankapp.web.forms.DepositWithdrawBean;
import com.bankapp.web.forms.FundTransferBean;

@Controller
@RequestMapping(path="transactionmgt")
public class AccountTransactionController {

	@GetMapping
	public String accountMenu(){
		return "transaction_mgt";
	}
	
	@Autowired
	private AccountService accountService;
	
	@GetMapping("/withdraw")
	public String withdrawGet(ModelMap map){
		map.addAttribute("depositWithdrawBean", new DepositWithdrawBean());
		return "withdraw";
	}
	
	@PostMapping("/withdraw")
	public String withdrawPost(@ModelAttribute(name="depositWithdrawBean") DepositWithdrawBean bean){
		accountService.withdraw(bean.getFromAccount(), bean.getAmount());
		return "redirect:/transactionmgt";
	}
	
	
	@GetMapping("/deposit")
	public String depositGet(ModelMap map){
		map.addAttribute("depositWithdrawBean", new DepositWithdrawBean());
		return "deposit";
	}
	
	@PostMapping("/deposit")
	public String depositPost(@ModelAttribute(name="depositWithdrawBean") DepositWithdrawBean bean){
		accountService.deposit(bean.getFromAccount(), bean.getAmount());
		return "redirect:/transactionmgt";
	}
	
	@GetMapping("/transfer")
	public String transferGet(ModelMap map){
		map.addAttribute("fundTransferBean", new FundTransferBean());
		return "transfer";
	}
	
	@PostMapping("/transfer")
	public String transferPost(@ModelAttribute(name="fundTransferBean") FundTransferBean bean){
		accountService.transfer(bean.getFromAccount(), bean.getToAccount(), bean.getAmount());
		return "redirect:/transactionmgt";
	}
	
	
	@GetMapping("/allaccounts")
	public ModelAndView allAccounts(ModelAndView mv){
		mv.addObject("accounts", accountService.getAllAccounts());
		mv.setViewName("allaccounts");
		return mv;
	}
	
}








