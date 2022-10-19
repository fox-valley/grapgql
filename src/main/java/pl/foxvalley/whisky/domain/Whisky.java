package pl.foxvalley.whisky.domain;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "whisky")
public class Whisky {

    @Id
    private UUID id;
    @Enumerated(EnumType.STRING)
    private WhiskyType whiskyType;
    private String name;
    private int age;

    public Whisky() {

    }

    public Whisky(WhiskyType whiskyType, String name, int age) {
        this.id = UUID.randomUUID();
        this.whiskyType = whiskyType;
        this.name = name;
        this.age = age;
    }

    public static Whisky from(CreateWhiskyInput createWhiskyInput) {
        return new Whisky(
                createWhiskyInput.getWhiskyType(),
                createWhiskyInput.getName(),
                createWhiskyInput.getAge());
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public WhiskyType getWhiskyType() {
        return whiskyType;
    }

    public void setWhiskyType(WhiskyType whiskyType) {
        this.whiskyType = whiskyType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
