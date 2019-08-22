package com.company.U1M6Summative.viewmodel;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

public class CustomerViewModel {


    private int id;
    @NotEmpty(message = "Please supply a value for first name")
    private String firstName;
    @NotEmpty(message = "Please supply a value for last name")
    private String lastName;
    @NotEmpty(message = "Please supply a value for email")
    private String email;
    @NotEmpty(message = "Please supply a value for company")
    private String company;
    @NotEmpty(message = "Please supply a value for phone")
    private String phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerViewModel that = (CustomerViewModel) o;
        return id == that.id &&
                firstName.equals(that.firstName) &&
                lastName.equals(that.lastName) &&
                email.equals(that.email) &&
                company.equals(that.company) &&
                phone.equals(that.phone) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email, company, phone);
    }
}

