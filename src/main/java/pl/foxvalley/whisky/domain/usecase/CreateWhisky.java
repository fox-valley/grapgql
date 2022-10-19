package pl.foxvalley.whisky.domain.usecase;

import org.springframework.stereotype.Component;
import pl.foxvalley.whisky.domain.Whisky;
import pl.foxvalley.whisky.repository.WhiskyRepository;

@Component
public class CreateWhisky {

    private final WhiskyRepository whiskyRepository;

    public CreateWhisky(WhiskyRepository whiskyRepository) {
        this.whiskyRepository = whiskyRepository;
    }

    public Whisky createWhisky(Whisky whisky) {
        return whiskyRepository.save(whisky);
    }
}
