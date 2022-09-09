package in.banking.statement1.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import in.banking.statement1.entities.AccountHolder;

@FeignClient(name="profiles",url = "http://localhost:9100")
public interface ProfilesClient {
	
	@GetMapping("/{ahId}/exists")
	public Boolean checkAccountHolderExists(@PathVariable("ahId") Long ahId);
	
	@GetMapping("/{ahId}")
	public AccountHolder getAccountHolder(@PathVariable("ahId") Long ahId);
}
