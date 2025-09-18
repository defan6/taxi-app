package my.ddos.service;

import my.ddos.model.dto.PassengerResponse;

import java.util.List;

public interface PassengerService {

    List<PassengerResponse> getAllPassengers();
}
