package my.ddos.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record AuthDriverRegisterRequest
        (
                @NotBlank(message = "name cannot be empty")
                String name,
                @NotBlank(message = "workPhone cannot be empty")
                @Size(min = 6, max = 6, message = "workPhone need to be exactly 6 digits")
                String phone,
                @NotBlank(message = "carModel cannot be empty")
                String carModel,
                @NotBlank(message = "carNumber cannot be empty")
                String carNumber,
                @NotBlank(message = "password cannot be empty")
                String password
        ) {
}
