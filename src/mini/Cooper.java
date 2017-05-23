package mini;

import fiat.Panda;

/**
 * Created by ronald on 13/09/16.
 */
public class Cooper implements Panda {
    @Override
    public void Engine(String amount) {
        System.out.println("The mini cooper has " + amount + " cylinders.");
    }

    @Override
    public void Doors(int number) {
        System.out.println("The mini has " + number + " doors.");
    }

    @Override
    public void Airco() {

    }

    public void model(){
        color("Red");
        tyres(("Dunlop's"));

    }
    public void color (String color){
        System.out.println("The Mini Cooper's color is " + color);
    }
    public void tyres(String tyres){
        System.out.println("The Minis' tyres are " + tyres);
    }
}
