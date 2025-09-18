package my.ddos.kafka.event;

public record AuthDriverRegisterEvent
        (
                String name,
                String phone,
                String carModel,
                String carNumber,
                String password
        ) {
}
