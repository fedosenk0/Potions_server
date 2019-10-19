package ru.maveri.potions.JDBC.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import ru.maveri.potions.model.enums.Type;

@Data
public class TestCoordinateClass {
    @JsonIgnore
    private long id;

    private long latitude;
    private long longitude;

    private Type type;

}
