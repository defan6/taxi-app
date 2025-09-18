package my.ddos.kafka.event;

public record AuthPassengerRegisterEvent
        (
                String name,
                String phone,
                String password
        ) {
}
