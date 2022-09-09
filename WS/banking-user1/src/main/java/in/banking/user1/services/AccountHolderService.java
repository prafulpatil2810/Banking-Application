package in.banking.user1.services;

import java.util.List;

import in.banking.user1.entities.AccountHolder;
import in.banking.user1.exceptions.AccountHolderException;

public interface AccountHolderService {
	AccountHolder add(AccountHolder ah) throws AccountHolderException;
	AccountHolder getById(Long ahId);
	List<AccountHolder> getAll();
	boolean existsById(Long ahId);	
}