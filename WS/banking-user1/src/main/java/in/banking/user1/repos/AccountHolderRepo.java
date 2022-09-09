package in.banking.user1.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import in.banking.user1.entities.AccountHolder;

public interface AccountHolderRepo extends JpaRepository<AccountHolder, Long> {

}
