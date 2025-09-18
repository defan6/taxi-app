package my.ddos.mapper;


import my.ddos.kafka.event.AuthDriverRegisterEvent;
import my.ddos.model.dto.AuthDriverRegisterRequest;
import my.ddos.model.dto.AuthDriverRegisterResponse;
import my.ddos.model.entity.AuthDriver;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AuthDriverMapper {


    AuthDriverRegisterResponse toResponse(AuthDriver authDriver);

    AuthDriver toEntity(AuthDriverRegisterRequest authDriverRegisterRequest);

    AuthDriverRegisterEvent toRegisterEvent(AuthDriverRegisterRequest authDriverRegisterRequest);
}
