package my.ddos.repository;

import my.ddos.model.entity.AuthDriver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthDriverRepository extends JpaRepository<AuthDriver, Long> {
}
