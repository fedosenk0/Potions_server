package ru.maveri.potions.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.stereotype.Component;
import ru.maveri.potions.model.enums.Type;

import javax.persistence.*;

// подумать над изменением ( так как описывает все объекты карты)
// Изменения явно будут!!! Необходима возможность расширения
@Data
@Table
@Entity
public class Coordinate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private long id;

    private long latitude;
    private long longitude;

    @Enumerated(value = EnumType.STRING)
    private Type type;






}
