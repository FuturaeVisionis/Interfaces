package fiat;

/**
 * Created by ronald on 13/09/16.
 */
public interface Panda {

    void Engine(String cylinders);

    void Doors(int doors);

    void Airco();

}

/*
Remember an interface can't contain body!!
Interfaces are abstract classes taken to extremes.
An interface can define only ABSTRACT methods and constants.
All members of an interface are implicitly PUBLIC.
 */