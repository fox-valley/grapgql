package pl.foxvalley.whisky.domain;

import java.util.UUID;

public class CreateWhiskyInput {

    private final UUID id;
    private final WhiskyType whiskyType;
    private final String name;
    private final int age;

    public CreateWhiskyInput(UUID id, WhiskyType whiskyType, String name, int age) {
        this.id = id;
        this.whiskyType = whiskyType;
        this.name = name;
        this.age = age;
    }

    public UUID getId() {
        return id;
    }

    public WhiskyType getWhiskyType() {
        return whiskyType;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
