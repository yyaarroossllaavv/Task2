package org.example;

public class Location {
    public String street;
    public String city;
    public String state;
    public String country;
    public String zip;
    public Coordinates coordinates;

    @Override
    public String toString() {
        return "Location{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zip='" + zip + '\'' +
                ", coordinates=" + coordinates +
                '}';
    }
}
