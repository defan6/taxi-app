package my.ddos.repository;

import my.ddos.model.entity.AuthPassenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthPassengerRepository extends JpaRepository<AuthPassenger, Long> {
}
