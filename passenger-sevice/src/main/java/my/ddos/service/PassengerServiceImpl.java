package my.ddos.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import my.ddos.mapper.PassengerMapper;
import my.ddos.model.dto.PassengerResponse;
import my.ddos.repository.PassengerRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
@Slf4j
public class PassengerServiceImpl implements PassengerService{

    private final PassengerRepository passengerRepository;


    private final PassengerMapper passengerMapper;

    @Override
    public List<PassengerResponse> getAllPassengers() {
        log.info("Called getAllPassengers");
        return passengerRepository
                .findAll()
                .stream()
                .map(passengerMapper::toResponse)
                .toList();
    }
}
