package ru.maveri.potions.model.join.table;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Data;
import ru.maveri.potions.model.ImageUrl;
import ru.maveri.potions.model.Potion;
import ru.maveri.potions.model.User;
import ru.maveri.potions.model.join.UserPotionKey;

import javax.persistence.*;
import java.awt.*;

@Data
@Entity
@Table
public class UserPotion {

    @EmbeddedId
    @JsonIgnore
    private UserPotionKey id;

    @ManyToOne
    @MapsId("user_id")
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private User users;

    @ManyToOne
    @MapsId("potion_id")
 // @JoinColumn(name = "potion_id")
    @JsonUnwrapped
    private Potion potion;



    @ManyToOne
    @MapsId("image_url_id")

    @JsonIgnore
    private ImageUrl imageUrl;

    private int amount;

    @JsonUnwrapped
    private long getImageId(){
        return potion.getId();
    }

}
