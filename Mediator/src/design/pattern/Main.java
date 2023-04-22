package design.pattern;

import design.pattern.subSystem.AirportSystem;
import design.pattern.subSystem.HotelSystem;
import design.pattern.subSystem.SubSystem;
import design.pattern.subSystem.TravelSystem;

/**
 * Created by huang on 2023/4/12.
 */

public class Main {
    public static void main(String[] args) {
        Mediator md = new ConcreteMediator();
        SubSystem s1,s2,s3;
        s1 = new AirportSystem();
        s2 = new HotelSystem();
        s3 = new TravelSystem();
        md.register(s1);
        md.register(s2);
        md.register(s3);
        s1.send();
        System.out.println("-------------");
        s2.send();
    }
}
