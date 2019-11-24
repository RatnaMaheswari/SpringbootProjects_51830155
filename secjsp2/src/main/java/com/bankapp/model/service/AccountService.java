package com.bankapp.model.service;
import java.util.*;
import com.bankapp.model.entities.Account;

public interface AccountService {
	public List<Account> getAllAccounts();
	public Account findByAccountId(Long accountNumber);
	void blockAccount(Long accountNumber);
    void createAccount(Account account );
    void deposit(Long accountNumber, double amount);
    void withdraw(Long accountNumber, double amount);
    void transfer(Long fromAccNumber, Long toAccNumber, double amount);
}
