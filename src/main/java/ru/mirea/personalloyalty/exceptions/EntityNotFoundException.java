package ru.mirea.personalloyalty.exceptions;

public class EntityNotFoundException extends RuntimeException{
    public EntityNotFoundException(){
        super("Entity not found!");
    }

    public EntityNotFoundException(RuntimeException e){
        super("Entity not found!", e);
    }
}
