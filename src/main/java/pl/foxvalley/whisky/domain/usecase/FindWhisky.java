package pl.foxvalley.whisky.domain.usecase;

import org.springframework.stereotype.Component;
import pl.foxvalley.whisky.domain.Whisky;
import pl.foxvalley.whisky.repository.WhiskyRepository;

import java.util.List;
import java.util.UUID;

@Component
public class FindWhisky {

    private final WhiskyRepository whiskyRepository;

    public FindWhisky(WhiskyRepository whiskyRepository) {
        this.whiskyRepository = whiskyRepository;
    }

    public List<Whisky> findAll() {
        return whiskyRepository.findAll();
    }

    public Whisky findById(UUID id) {
        return whiskyRepository.findWhiskyById(id);
    }
}
