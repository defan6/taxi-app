package my.ddos.mapper;


import my.ddos.kafka.event.AuthPassengerRegisterEvent;
import my.ddos.model.dto.AuthPassengerRegisterRequest;
import my.ddos.model.dto.AuthPassengerRegisterResponse;
import my.ddos.model.entity.AuthPassenger;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AuthPassengerMapper {


    AuthPassengerRegisterResponse toResponse(AuthPassenger authPassenger);

    AuthPassenger toEntity(AuthPassengerRegisterRequest authPassengerRegisterRequest);

    AuthPassengerRegisterEvent toRegisterEvent(AuthPassengerRegisterRequest authPassengerRegisterRequest);
}
