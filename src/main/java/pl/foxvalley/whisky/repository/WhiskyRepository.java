package pl.foxvalley.whisky.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.foxvalley.whisky.domain.Whisky;

import java.util.UUID;

public interface WhiskyRepository extends JpaRepository<Whisky, UUID> {

    Whisky findWhiskyById(UUID id);

}
