package ru.maveri.potions.model.join;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UserPotionKey implements Serializable {

    @Column(name = "user_id")
    private long userId;

    @Column(name = "potion_id")
    private long potionId;


}