package ru.maveri.potions.model.enums;


public enum Type {
USER,GRASS;

public static Type getType(String type){
    Type originalType = Type.USER;
    switch (type.toLowerCase())
    {
        case "user": originalType = Type.USER; break;
        case "grass": originalType = Type.GRASS;
    }
    return originalType;

}
}
