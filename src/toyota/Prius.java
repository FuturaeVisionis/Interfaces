package toyota;

import mini.Cooper;

/**
 * Created by ronald on 13/09/16.
 */
public class Prius extends Cooper {

    public static void Hybrid(){
        System.out.println("My Prius runs on electricity.");
    }
    public abstract class PriusXT extends Cooper{

        public String Turbo(String turbo){
            System.out.println("The Prius XT has " + turbo + " turbo's.");
            return turbo;
        }
        public void Airco(){
            System.out.println("My Prius has two airco's.");
        }
    }
}
