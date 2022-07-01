package com.example.emperortest;

public class Home {
    int homeId;
    String name;

    public Home() {
    }

    public Home(int id, String name) {
        this.homeId = id;
        this.name = name;
    }

    public int getId() {
        return homeId;
    }

    public void setId(int id) {
        this.homeId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Home{" +
                "homeId=" + homeId +
                ", name='" + name + '\'' +
                '}';
    }
}
