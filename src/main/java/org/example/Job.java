package org.example;

import java.util.Objects;

public class Job {
    public String title;
    public String descriptor;
    public String area;
    public String type;
    public String company;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return Objects.equals(title, job.title) && Objects.equals(descriptor, job.descriptor) && Objects.equals(area, job.area) && Objects.equals(type, job.type) && Objects.equals(company, job.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, descriptor, area, type, company);
    }

    @Override
    public String toString() {
        return "Job{" +
                "title='" + title + '\'' +
                ", descriptor='" + descriptor + '\'' +
                ", area='" + area + '\'' +
                ", type='" + type + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
