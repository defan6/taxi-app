package my.ddos.strategy;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import my.ddos.kafka.event.AuthDriverRegisterEvent;
import my.ddos.mapper.AuthDriverMapper;
import my.ddos.model.dto.AuthDriverRegisterRequest;
import my.ddos.model.dto.AuthDriverRegisterResponse;
import my.ddos.model.entity.AuthDriver;
import my.ddos.repository.AuthDriverRepository;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;


@Component
@Slf4j
@RequiredArgsConstructor
public class DriverRegistrationStrategy
        implements RegistrationStrategy<AuthDriverRegisterResponse, AuthDriverRegisterRequest>{

    private final KafkaTemplate<String, AuthDriverRegisterEvent> kafkaTemplate;

    private final AuthDriverRepository authDriverRepository;

    private final AuthDriverMapper authDriverMapper;

    @Override
    public AuthDriverRegisterResponse register(AuthDriverRegisterRequest registerRequest) {
        AuthDriver auth = authDriverMapper.toEntity(registerRequest);
        AuthDriver savedAuth = authDriverRepository.save(auth);
        log.info("Send driver {} to authDriverRepository", registerRequest.name());
        AuthDriverRegisterEvent authDriverRegisterEvent = authDriverMapper.toRegisterEvent(registerRequest);
        kafkaTemplate.send("driver-register-topic", authDriverRegisterEvent);
        log.info("send authDriverEvent: {} to driver-register-topic", authDriverRegisterEvent);
        return authDriverMapper.toResponse(savedAuth);
    }
}
