package in.banking.txn1.services;

import java.time.LocalDate;
import java.util.List;

import in.banking.txn1.entities.Txn;
import in.banking.txn1.exceptions.AccountHolderException;
import in.banking.txn1.exceptions.TxnException;

public interface TxnService {
	double getBalance(Long ahId) throws AccountHolderException;
	List<Txn> getPeriodicTxnsByAhId(Long ahId,LocalDate start,LocalDate end) throws AccountHolderException;
	Txn getById(Long txnId);
	Txn add(Txn txn) throws AccountHolderException,TxnException;
	Txn update(Txn txn) throws AccountHolderException,TxnException;
	void deleteById(Long txnId) throws TxnException;
}