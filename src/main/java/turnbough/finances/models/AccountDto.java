package turnbough.finances.models;

import java.math.BigDecimal;

public record AccountDto(
		Long accountId,
		String accountAddress,
		String accountEmail,
		BigDecimal accountInterest,
		String accountPhoneNumber,
		String accountName,
		String accountType,
		BigDecimal balance
)
{
}
