package ru.maveri.potions.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Data
@Entity
@Table
@Component
public class ImageUrl {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String url;


}
