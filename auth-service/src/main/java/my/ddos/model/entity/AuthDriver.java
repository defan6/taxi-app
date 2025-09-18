package my.ddos.model.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "auths_drivers")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class AuthDriver extends AuthBaseEntity{
    @Column(name = "car_model")
    private String carModel;

    @Column(name = "car_number", unique = true)
    private String carNumber;
}
