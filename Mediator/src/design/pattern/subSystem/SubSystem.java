package design.pattern.subSystem;

import design.pattern.Mediator;

/**
 * Created by huang on 2023/4/21.
 */
public abstract class SubSystem {
    protected Mediator mediator;
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
    public abstract void receive();
    public abstract void send();
}
