package turnbough.finances.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import turnbough.finances.services.FinancesService;

/**
 * FinancesController. Used to route API calls for personal-finances.
 *
 * @author David Turnbough
 */
@RestController
@RequestMapping
public class FinancesController
{
	FinancesService financesService;

	/**
	 * Constructor
	 *
	 * @param financesService Used to handle the business logic and repository queries.
	 */
	public FinancesController(FinancesService financesService)
	{
		this.financesService = financesService;
	}



	//TODO: Get account information
	//TODO: Get account information and transactions (range of transactions)
	//TODO: Get all accounts
	//TODO: Get range of transactions for an account
	//TODO: Update an account
	//TODO: update a transaction
	//TODO: remove an account
	//TODO: remove a transaction


}
