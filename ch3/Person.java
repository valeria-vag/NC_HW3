package com.netcracker.ch3;

public class Person {

    private String name;
    private String friendName;
    private int friendCount;

    public Person(String name) {
        this.name = name;
        friendCount = 0;
        friendName = "";
    }

    public void befriend(Person p) {
        this.friendName += p.name + " ";
        friendCount++;
    }

    public void unfriend(Person p) {
        if (friendCount == 0) {
            System.out.println("No friends!");
        }
        else {
            friendName = friendName.replace(p.name + " ", "");
            friendCount--;
        }
    }

    public String getFriendNames() {
        return friendName;
    }

    public int getFriendCount() {
        return friendCount;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person {" +
                "name = '" + name + '\'' +
                ", friendName = '" + friendName + '\'' +
                ", friendCount = " + friendCount +
                '}';
    }
}
