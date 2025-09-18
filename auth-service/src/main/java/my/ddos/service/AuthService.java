package my.ddos.service;

import my.ddos.model.dto.AuthDriverRegisterRequest;
import my.ddos.model.dto.AuthDriverRegisterResponse;
import my.ddos.model.dto.AuthPassengerRegisterRequest;
import my.ddos.model.dto.AuthPassengerRegisterResponse;

public interface AuthService{

    AuthPassengerRegisterResponse registerPassenger(AuthPassengerRegisterRequest registerRequest);


    AuthDriverRegisterResponse registerDriver(AuthDriverRegisterRequest registerRequest);
}
