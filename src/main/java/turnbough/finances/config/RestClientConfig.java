package turnbough.finances.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class RestClientConfig
{
	@Bean
	public RestClient accountClient(@Value("${services.accounts.url}") String baseUrl)
	{
		return RestClient.builder()
				.baseUrl(baseUrl)
				.build();
	}

	@Bean
	public RestClient transactionsClient(@Value("${services.transactions.url}") String baseUrl) {
		return RestClient.builder()
				.baseUrl(baseUrl)
				.build();
	}

}
