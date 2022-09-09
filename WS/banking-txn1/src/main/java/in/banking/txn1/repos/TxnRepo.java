package in.banking.txn1.repos;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.banking.txn1.entities.Txn;

public interface TxnRepo extends JpaRepository<Txn,Long>{
	@Query("SELECT t FROM Txn t WHERE t.holder.ahId=:ahId AND t.txnDate BETWEEN :start AND :end")
	List<Txn> getPeriodicTxnByAhId(Long ahId,LocalDate start,LocalDate end);
}
