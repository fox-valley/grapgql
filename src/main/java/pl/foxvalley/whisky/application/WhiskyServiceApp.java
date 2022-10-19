package pl.foxvalley.whisky.application;

import org.springframework.stereotype.Component;
import pl.foxvalley.whisky.domain.Whisky;
import pl.foxvalley.whisky.domain.usecase.CreateWhisky;
import pl.foxvalley.whisky.domain.usecase.FindWhisky;

import java.util.List;
import java.util.UUID;

@Component
public class WhiskyServiceApp {

    private final CreateWhisky createWhisky;
    private final FindWhisky findWhisky;

    public WhiskyServiceApp(CreateWhisky createWhisky, FindWhisky findWhisky) {
        this.createWhisky = createWhisky;
        this.findWhisky = findWhisky;
    }

    public Whisky createWhisky(Whisky whisky) {
        return createWhisky.createWhisky(whisky);
    }

    public List<Whisky> findAllWhiskies() {
        return findWhisky.findAll();
    }

    public Whisky findWhiskyById(UUID id) {
        return findWhisky.findById(id);
    }
}
