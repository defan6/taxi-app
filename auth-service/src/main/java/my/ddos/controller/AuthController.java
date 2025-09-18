package my.ddos.controller;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import my.ddos.model.dto.AuthDriverRegisterRequest;
import my.ddos.model.dto.AuthDriverRegisterResponse;
import my.ddos.model.dto.AuthPassengerRegisterRequest;
import my.ddos.model.dto.AuthPassengerRegisterResponse;
import my.ddos.service.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auths")
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register/driver")
    public ResponseEntity<AuthDriverRegisterResponse> registerDriver
            (
                    @Valid @RequestBody AuthDriverRegisterRequest authDriverRequest
            )
    {
        AuthDriverRegisterResponse authDriverResponse = authService.registerDriver(authDriverRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(authDriverResponse);
    }


    @PostMapping("/register/passenger")
    public ResponseEntity<AuthPassengerRegisterResponse> registerPassenger
            (
                    @Valid @RequestBody AuthPassengerRegisterRequest authPassengerRegisterRequest
            )
    {
        AuthPassengerRegisterResponse authPassengerRegisterResponse = authService.registerPassenger(authPassengerRegisterRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(authPassengerRegisterResponse);
    }


}
