package ru.maveri.potions.model.join.table;


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
    private UserPotionKey id;

    @ManyToOne
    @MapsId("user_id")
    @JoinColumn(name = "user_id")
    private User users;

    @ManyToOne
    @MapsId("potion_id")
 // @JoinColumn(name = "potion_id")
    private Potion potion;



    @ManyToOne
    @MapsId("image_url_id")
    private ImageUrl imageUrl;

    private int amount;

    private long getImageId(){
        return potion.getId();
    }

}
