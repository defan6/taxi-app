package my.ddos.model.dto;

import jakarta.validation.constraints.NotBlank;

public record AuthPassengerRegisterRequest
        (
                @NotBlank(message = "name cannot be empty")
                String name,
                @NotBlank(message = "phone cannot be empty")
                String phone,
                @NotBlank(message = "password cannot be empty")
                String password
        ) {
}
