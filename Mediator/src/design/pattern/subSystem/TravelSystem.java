package design.pattern.subSystem;

/**
 * Created by huang on 2023/4/21.
 */
public class TravelSystem extends SubSystem{
    @Override
    public void receive() {
        System.out.println("旅游社子系统接受信息。");
    }

    @Override
    public void send() {
        System.out.println("旅游社子系统传递信息。");
        mediator.deliver(this); //请中介者转发
    }
}
