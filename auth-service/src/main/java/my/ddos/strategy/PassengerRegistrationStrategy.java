package my.ddos.strategy;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import my.ddos.kafka.event.AuthPassengerRegisterEvent;
import my.ddos.mapper.AuthPassengerMapper;
import my.ddos.model.dto.AuthPassengerRegisterRequest;
import my.ddos.model.dto.AuthPassengerRegisterResponse;
import my.ddos.model.entity.AuthPassenger;
import my.ddos.repository.AuthPassengerRepository;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
@Slf4j
public class PassengerRegistrationStrategy
        implements RegistrationStrategy<AuthPassengerRegisterResponse, AuthPassengerRegisterRequest>{

    private final KafkaTemplate<String, AuthPassengerRegisterEvent> kafkaTemplate;

    private final AuthPassengerRepository authPassengerRepository;


    private final AuthPassengerMapper authPassengerMapper;

    @Override
    public AuthPassengerRegisterResponse register(AuthPassengerRegisterRequest registerRequest) {
        AuthPassenger authPassenger = authPassengerMapper.toEntity(registerRequest);
        authPassengerRepository.save(authPassenger);
        log.info("Send passenger {} to authPassengerRepository", registerRequest.name());

        AuthPassengerRegisterEvent authPassengerRegisterEvent = authPassengerMapper.toRegisterEvent(registerRequest);
        kafkaTemplate.send("passenger-register-topic", authPassengerRegisterEvent);

        log.info("send authDriverEvent: {} to passenger-register-topic", authPassengerRegisterEvent);


        return authPassengerMapper.toResponse(authPassenger);

    }
}
