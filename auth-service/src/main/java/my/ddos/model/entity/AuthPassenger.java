package my.ddos.model.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "auths_passengers")
@AllArgsConstructor
@Data
public class AuthPassenger extends AuthBaseEntity{
}
