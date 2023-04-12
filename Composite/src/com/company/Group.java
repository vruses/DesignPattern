package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huang on 2023/3/22.
 */
public class Group extends AbstractMember {
    private final List<AbstractMember> members = new ArrayList<>();

    public Group(String name) {
        this.name = name;
    }

    @Override
    public void shareTo(AbstractMember target) {
        for (AbstractMember member : members) {
            member.shareTo(target);
        }
    }

    public void addMember(AbstractMember member) {
        members.add(member);
    }

    public void removeMember(AbstractMember member) {
        members.remove(member);
    }
}
