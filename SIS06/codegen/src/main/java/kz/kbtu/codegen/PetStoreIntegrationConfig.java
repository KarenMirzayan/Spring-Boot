package kz.kbtu.codegen;

import com.baeldung.petstore.client.invoker.ApiClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.baeldung.petstore.client.api.PetApi;

@Configuration
public class PetStoreIntegrationConfig {

    @Bean
    public PetApi petApi() {
        return new PetApi(apiClient());
    }

    @Bean
    public ApiClient apiClient() {
        return new ApiClient().setBasePath("https://petstore.swagger.io/v2");
    }
}