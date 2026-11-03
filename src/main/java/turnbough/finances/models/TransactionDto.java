package turnbough.finances.models;

import java.math.BigDecimal;

public record TransactionDto(
	Long transactionId,
	BigDecimal transactionAmount,
	String transactionDate,
	String transactionDescription,
	Long accountId
){}
