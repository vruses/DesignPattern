package design.pattern;

import design.pattern.subSystem.SubSystem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huang on 2023/4/21.
 */
public class ConcreteMediator extends Mediator{
    private final List<SubSystem> subSystems = new ArrayList<>();
    @Override
    public void register(SubSystem subSystem) {
        if (!subSystems.contains(subSystem)) {
            subSystems.add(subSystem);
            subSystem.setMediator(this);
        }
    }

    @Override
    public void deliver(SubSystem subSystem) {
        for (SubSystem ob : subSystems) {
            if (!ob.equals(subSystem)) {
                ob.receive();
            }
        }
    }
}
