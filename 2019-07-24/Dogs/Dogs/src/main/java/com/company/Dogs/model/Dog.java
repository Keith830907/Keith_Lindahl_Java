package com.company.Dogs.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Dog {
    private int Id;
    @NotEmpty(message = "You must supply a value for name.")
    private String name;
    @Size(min = 1, max = 2, message = "age must be one or two digits in length.")
    private String age;
    @NotEmpty(message = "You must supply a String for breed.")
    private String breed;
    @NotEmpty(message = "You must give a brief description of health.")
    private String health;
    private boolean isShotted;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public boolean isShotted() {
        return isShotted;
    }

    public void setShotted(boolean shotted) {
        isShotted = shotted;
    }

    public Dog(int id, @NotEmpty(message = "You must supply a value for name.") String name, @Size(min = 1, max = 2, message = "age must be one or two digits in length.") String age, @NotEmpty(message = "You must supply a String for breed.") String breed, @NotEmpty(message = "You must give a brief description of health.") String health, boolean isShotted) {
        Id = id;
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.health = health;
        this.isShotted = isShotted;
    }

    public Dog() {
    }

    @Override
    public String toString() {
        return "Dog{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", breed='" + breed + '\'' +
                ", health='" + health + '\'' +
                ", isShotted=" + isShotted +
                '}';
    }
}
