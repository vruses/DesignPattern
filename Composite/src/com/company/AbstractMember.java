package com.company;

/**
 * Created by huang on 2023/3/22.
 */
public abstract class AbstractMember {
    protected String name;

    public abstract void shareTo(AbstractMember target);
}
