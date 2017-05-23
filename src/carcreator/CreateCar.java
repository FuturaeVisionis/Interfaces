package carcreator;

import fiat.Panda;
import kia.Picanto;
import mini.Cooper;
import toyota.Prius;

/**
 * Created by ronald on 13/09/16.
 */
public class CreateCar {
    public static void main(String[] args) {

        Cooper cooper = new Cooper();
        cooper.model();

        System.out.println();

        Picanto picanto = new Picanto() {
            @Override
            public void Engine(String cylinders) {
                System.out.println("The Kia Picanto only has " + cylinders + " cylinders.");
            }

            @Override
            public void Doors(int doors) {
                System.out.println("The Kia Picanto only has " + doors + " doors.");
            }

            @Override
            public void Airco() {
                System.out.println("The Kia Picanto doesn't have an airco.");
            }
        };
        picanto.Engine("four");
        picanto.Doors(3);
        picanto.Airco();

        System.out.println();

        Panda panda = new Panda() {
            @Override
            public void Engine(String cylinders) {
                System.out.println("The fiat Panda only has " + cylinders + " cylinders.");
            }

            @Override
            public void Doors(int doors) {
                System.out.println("The fiat Panda only has " + doors + " doors.");
            }

            @Override
            public void Airco() {
                System.out.println("The fiat Panda does have airco.");
            }
        };
        panda.Engine("five");
        panda.Doors(5);
        panda.Airco();

        System.out.println();

        Prius prius = new Prius();
        prius.Hybrid();

        Prius innerclass = new Prius();
        Prius.PriusXT myPrius = innerclass.new PriusXT() {
        };
        myPrius.Turbo("twin");
        myPrius.Airco();


    }
}
