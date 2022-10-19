package pl.foxvalley.whisky.controller;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import pl.foxvalley.whisky.application.WhiskyServiceApp;
import pl.foxvalley.whisky.domain.CreateWhiskyInput;
import pl.foxvalley.whisky.domain.Whisky;

import java.util.List;
import java.util.UUID;

@Controller
public class WhiskyController {

    private final WhiskyServiceApp whiskyServiceApp;

    public WhiskyController(WhiskyServiceApp whiskyServiceApp) {
        this.whiskyServiceApp = whiskyServiceApp;
    }

    @QueryMapping
    public Whisky whiskyById(@Argument UUID id) {
        return whiskyServiceApp.findWhiskyById(id);
    }

    @QueryMapping
    public List<Whisky> allWhiskies() {
        return whiskyServiceApp.findAllWhiskies();
    }

    @MutationMapping
    public Whisky addWhisky(@Argument CreateWhiskyInput whisky) {
        return whiskyServiceApp.createWhisky(Whisky.from(whisky));
    }
}
