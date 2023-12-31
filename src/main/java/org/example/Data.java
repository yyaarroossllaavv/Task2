package org.example;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.*;
import java.util.Objects;

public class Data {
    public Integer id;
    public String status;
    public Name name;
    public BigDecimal monthlySalary;
    public String birthday;
    public String username;
    public String password;
    public ArrayList<String> emails;
    public String phoneNumber;
    public Location location;
    public String website;
    public String domain;
    public Job job;
    public CreditCard creditCard;
    public String uuid;
    public String objectId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public BigDecimal getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(BigDecimal monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<String> getEmails() {
        return emails;
    }

    public void setEmails(ArrayList<String> emails) {
        this.emails = emails;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;
        return Objects.equals(id, data.id) && Objects.equals(status, data.status) && Objects.equals(name, data.name) && Objects.equals(monthlySalary, data.monthlySalary) && Objects.equals(birthday, data.birthday) && Objects.equals(username, data.username) && Objects.equals(password, data.password) && Objects.equals(emails, data.emails) && Objects.equals(phoneNumber, data.phoneNumber) && Objects.equals(location, data.location) && Objects.equals(website, data.website) && Objects.equals(domain, data.domain) && Objects.equals(job, data.job) && Objects.equals(creditCard, data.creditCard) && Objects.equals(uuid, data.uuid) && Objects.equals(objectId, data.objectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, name, monthlySalary, birthday, username, password, emails, phoneNumber, location, website, domain, job, creditCard, uuid, objectId);
    }

    @Override
    public String toString() {
        return "Data{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", name=" + name +
                ", monthlySalary=" + monthlySalary +
                ", birthday='" + birthday + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", emails=" + emails +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", location=" + location +
                ", website='" + website + '\'' +
                ", domain='" + domain + '\'' +
                ", job=" + job +
                ", creditCard=" + creditCard +
                ", uuid='" + uuid + '\'' +
                ", objectId='" + objectId + '\'' +
                '}';
    }
}
