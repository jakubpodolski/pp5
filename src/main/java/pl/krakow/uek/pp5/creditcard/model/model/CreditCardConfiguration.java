package pl.krakow.uek.pp5.creditcard.model.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.krakow.uek.pp5.creditcard.model.InMemoryCCStorage;

@Configuration
public class CreditCardConfiguration {
    @Bean
    CreditCardFacade create() {
        return  new CreditCardFacade(new InMemoryCCStorage());
    }
}
