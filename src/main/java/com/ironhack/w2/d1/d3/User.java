package com.ironhack.w2.d1.d3;

public class User {
    private long id;
    private String name;
    private Status status;

    private static long lastId = 1;

    public User(String name) {
        this.name = name;
        this.status = Status.ONLINE;
        this.id = lastId; // <- se le asigna el ultimo id de la ult persona + 1
        lastId++;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                '}';
    }
}
