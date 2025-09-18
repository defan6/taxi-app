package my.ddos.model.dto;

import java.time.LocalDateTime;

public record PassengerResponse(Long id, String name, String phone, LocalDateTime createdAt) {
}
