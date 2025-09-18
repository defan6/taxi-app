package my.ddos.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import my.ddos.model.dto.AuthDriverRegisterRequest;
import my.ddos.model.dto.AuthDriverRegisterResponse;
import my.ddos.model.dto.AuthPassengerRegisterRequest;
import my.ddos.model.dto.AuthPassengerRegisterResponse;
import my.ddos.strategy.RegistrationContext;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
@Slf4j
public class AuthServiceImpl implements AuthService{


    private final RegistrationContext registrationContext;


    @Override
    public AuthPassengerRegisterResponse registerPassenger(AuthPassengerRegisterRequest registerRequest) {
        return registrationContext.register("PASSENGER", registerRequest);
    }

    @Override
    public AuthDriverRegisterResponse registerDriver(AuthDriverRegisterRequest registerRequest) {
        return registrationContext.register("DRIVER", registerRequest);
    }
}
