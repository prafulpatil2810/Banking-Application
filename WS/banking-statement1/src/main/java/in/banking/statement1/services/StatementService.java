package in.banking.statement1.services;

import java.time.LocalDate;

import in.banking.statement1.entities.Statement;
import in.banking.statement1.exceptions.StatementException;

public interface StatementService {
	Statement getStatement(long ahid,LocalDate start,LocalDate end) throws StatementException;
}
