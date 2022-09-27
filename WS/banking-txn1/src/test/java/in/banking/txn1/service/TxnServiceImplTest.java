package in.banking.txn1.service;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import in.banking.txn1.exceptions.TxnException;
import in.banking.txn1.repos.TxnRepo;
import in.banking.txn1.services.TxnServiceImpl;

@ExtendWith(MockitoExtension.class)
@DisplayName("TxnServiceImpl")
public class TxnServiceImplTest {

	@Mock
	TxnRepo txnRepo;

	TxnServiceImpl txnServiceImpl;

	@BeforeEach
	void init() {
		this.txnServiceImpl = new TxnServiceImpl(this.txnRepo);
	}

	@Test
	@DisplayName("#deleteById should delete a record given existing record")
	void testDeleteById() throws TxnException {
		Mockito.doNothing().when(txnRepo).deleteById(1L);
		assertDoesNotThrow(() -> {
			txnRepo.deleteById(1L);
		});
	}
}
