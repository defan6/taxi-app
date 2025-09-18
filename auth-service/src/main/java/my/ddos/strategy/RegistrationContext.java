package my.ddos.strategy;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class RegistrationContext {
    private final Map<String, RegistrationStrategy<?, ?>> strategies;


    public RegistrationContext
            (
                    DriverRegistrationStrategy driverRegistrationStrategy,
                    PassengerRegistrationStrategy passengerRegistrationStrategy
            ) {
        strategies = Map.of("DRIVER", driverRegistrationStrategy,
                "PASSENGER", passengerRegistrationStrategy
        );


    }
    @SuppressWarnings("unchecked")
    public <T, R> T register(String type, R request) {
        RegistrationStrategy<T, R> strategy = (RegistrationStrategy<T, R>) strategies.get(type);
        return strategy.register(request);
    }
}
