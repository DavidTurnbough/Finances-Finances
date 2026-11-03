package turnbough.finances.services;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import turnbough.finances.models.AccountDto;

import java.util.List;

/**
 * FinancesService. A class used to do the business logic for personal-finances.
 *
 * @author David Turnbough
 */
@Service
public class FinancesService
{
	/**
	 * Variables
	 */
	private final RestClient accountsClient;
	private final RestClient transactionClient;

	/**
	 * Constructor
	 *
	 * @param accountsClient
	 * @param transactionClient
	 */
	public FinancesService(RestClient accountsClient, RestClient transactionClient)
	{
		this.accountsClient = accountsClient;
		this.transactionClient = transactionClient;
	}

	/**
	 *
	 *
	 * @return A list of all accounts
	 */
	public List<AccountDto> getAllAccounts()
	{
		return accountsClient.get()
				.uri("/accounts/allAccounts")
				.retrieve()
				.body(new ParameterizedTypeReference<List<AccountDto>>() {});
	}


}
