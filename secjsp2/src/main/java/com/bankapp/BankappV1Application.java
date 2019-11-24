package com.bankapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.bankapp.model.entities.Account;
import com.bankapp.model.entities.User;
import com.bankapp.model.repo.AccountRepository;
import com.bankapp.model.repo.AccountTransactionRepository;
import com.bankapp.model.repo.CustomerRepository;
import com.bankapp.model.repo.TransactionLogRepository;
import com.bankapp.model.repo.UserRepository;
import com.bankapp.model.service.AccountService;
import com.bankapp.model.service.UserService;
@EnableTransactionManagement
@SpringBootApplication
public class BankappV1Application implements CommandLineRunner {

	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private AccountTransactionRepository accountTransactionRepository;

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private TransactionLogRepository transactionLogRepository;

	public static void main(String[] args) {
		SpringApplication.run(BankappV1Application.class, args);

	}
	
	@Autowired
	private UserService  userService;
	
	@Autowired
	private AccountService accountService;
	

	@Override
	public void run(String... args) throws Exception {
		// accountService.deposit(3L, 100);
				// accountService.withdraw(4L,100 );
				// accountService.transfer(4L, 3L,100);

				// Account account =
				// accountRepository.findById(2L).orElseThrow(RuntimeException::new);
				// accountRepository.delete(account);
				/*
				 * Customer customer = new Customer("divya", "divya@gmail.com",
				 * 5454545554L, 23456782L, "abc", 523455L, "ongole", "india");
				 * 
				 * Customer customer1 = new Customer("pras", "pras@gmail.com",
				 * 545456664L, 12345678L, "def", 523477L, "guntur", "india"); Customer
				 * customer2 = new Customer("divya", "divya@gmail.com", 545457774L,
				 * 82345678L, "ghi", 523488L, "darsi", "india");
				 * 
				 * Account account1 = new Account(2000.0, customer, false); Account
				 * account2 = new Account(1000.0, customer1, false); Account account3 =
				 * new Account(2500.0, customer2, false);
				 * 
				 * customer.setAccount(account1); customer1.setAccount(account2);
				 * customer2.setAccount(account3);
				 * 
				 * accountRepository.save(account1); accountRepository.save(account2);
				 * accountRepository.save(account3);
				 */

				/*
				 * User user1 = new User("mahi", "mahi@m.com", "mahi123", "ongole", new
				 * String[] { "ROLE_ADMIN", "ROLE_MGR", "ROLE_CLERK" }, true);
				 * 
				 * User user2 = new User("vijay", "vijay@v.com", "vijay123", "guntur",
				 * new String[] { "ROLE_MGR", "ROLE_CLERK" }, true);
				 * 
				 * User user3 = new User("babi", "babi@b.com", "babi123", "Hyd", new
				 * String[] { "ROLE_CLERK" }, true);
				 * 
				 * User user4 = new User("vishnu", "vishnu@m.com", "vishnu123", "adk",
				 * new String[] { "ROLE_CLERK" }, true);
				 * 
				 * userRepository.save(user1); userRepository.save(user2);
				 * userRepository.save(user3); userRepository.save(user4);
				 */

		
}
}
















