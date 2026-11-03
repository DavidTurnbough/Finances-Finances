package turnbough.finances.models;

import java.util.List;

public record FinanceDto(
	AccountDto accountDto,
	List<TransactionDto> recentTransactions
){}
