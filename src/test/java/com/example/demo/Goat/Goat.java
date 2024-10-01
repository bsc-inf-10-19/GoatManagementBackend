package com.example.demo.Goat;

public class Goat {

    private long id;
    private String breed;
    private int weight;
    private int height;
    private long vaccinated;
    private int age;
    private String gender;
    private String feed;
    private long schedule;


    public Goat() {
    }

    public Goat(long id,
                String breed,
                int weight,
                int height,
                long vaccinated,
                int age,
                String gender,
                String feed,
                long schedule) {
        this.id = id;
        this.breed = breed;
        this.weight = weight;
        this.height = height;
        this.vaccinated = vaccinated;
        this.age = age;
        this.gender = gender;
        this.feed = feed;
        this.schedule = schedule;
    }

    public Goat(String breed,
                int weight,
                int height,
                long vaccinated,
                int age,
                String gender,
                String feed,
                long schedule) {
        this.breed = breed;
        this.weight = weight;
        this.height = height;
        this.vaccinated = vaccinated;
        this.age = age;
        this.gender = gender;
        this.feed = feed;
        this.schedule = schedule;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public long getVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(long vaccinated) {
        this.vaccinated = vaccinated;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFeed() {
        return feed;
    }

    public void setFeed(String feed) {
        this.feed = feed;
    }

    public long getSchedule() {
        return schedule;
    }

    public void setSchedule(long schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Goat{" +
                "id=" + id +
                ", breed='" + breed + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", vaccinated=" + vaccinated +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", feed='" + feed + '\'' +
                ", schedule=" + schedule +
                '}';
    }
}
