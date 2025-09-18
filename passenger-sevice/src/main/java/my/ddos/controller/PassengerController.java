package my.ddos.controller;


import lombok.RequiredArgsConstructor;
import my.ddos.model.dto.PassengerResponse;
import my.ddos.service.PassengerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/passengers")
public class PassengerController {

    private final PassengerService passengerService;

//POST /passengers – регистрация пассажира
//GET /passengers/{id} – получить данные пассажира
//PUT /passengers/{id} – обновить данные
//GET /passengers/{id}/trips – список поездок


    @GetMapping("/all")
    public ResponseEntity<List<PassengerResponse>> getAllPassengers(){
        return ResponseEntity.ok(passengerService.getAllPassengers());
    }
}
