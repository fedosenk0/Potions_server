package ru.maveri.potions.model;


import lombok.Data;
import ru.maveri.potions.model.join.table.PotionImage;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table
public class ImageUrl {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String url;


}
