package my.ddos.mapper;


import my.ddos.model.dto.PassengerResponse;
import my.ddos.model.entity.Passenger;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PassengerMapper {


    PassengerResponse toResponse(Passenger passenger);
}
