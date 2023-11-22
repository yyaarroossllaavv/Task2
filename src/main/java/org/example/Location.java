package org.example;

import java.util.Objects;

public class Location {
    public String street;
    public String city;
    public String state;
    public String country;
    public String zip;
    public Coordinates coordinates;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return Objects.equals(street, location.street) && Objects.equals(city, location.city) && Objects.equals(state, location.state) && Objects.equals(country, location.country) && Objects.equals(zip, location.zip) && Objects.equals(coordinates, location.coordinates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, city, state, country, zip, coordinates);
    }

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
