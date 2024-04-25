package lab4.controller;

import lab4.model.Group;

public class GroupCreator {
    public Group createGroup(String name) {
        return new Group(name);
    }
}