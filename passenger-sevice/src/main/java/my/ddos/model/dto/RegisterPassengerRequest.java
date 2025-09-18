package my.ddos.model.dto;

import jakarta.validation.constraints.NotNull;

public record RegisterPassengerRequest(@NotNull String name, @NotNull String phone) {
}
