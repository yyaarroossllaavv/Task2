package org.example;

public class CreditCard {
    public String number;
    public String cvv;
    public String issuer;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "number='" + number + '\'' +
                ", cvv='" + cvv + '\'' +
                ", issuer='" + issuer + '\'' +
                '}';
    }
}
