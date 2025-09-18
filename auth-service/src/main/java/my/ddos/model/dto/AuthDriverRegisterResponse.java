package my.ddos.model.dto;

import java.time.LocalDateTime;

public record AuthDriverRegisterResponse
        (
                Long id,
                String name,
                String phone,
                String carModel,
                String carNumber,
                LocalDateTime createdAt
        ) {
}
