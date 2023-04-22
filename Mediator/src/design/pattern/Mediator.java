package design.pattern;

import design.pattern.subSystem.SubSystem;

/**
 * Created by huang on 2023/4/21.
 */
public abstract class Mediator {
    public abstract void register(SubSystem subSystem);
    public abstract void deliver(SubSystem subSystem); //转发
}
