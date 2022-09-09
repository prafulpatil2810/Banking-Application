package in.banking.txn1.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import in.banking.txn1.entities.AccountHolder;

public interface AccountHolderRepo extends JpaRepository<AccountHolder,Long> {

}
