package com.itechart.warehouse.core.user;

import com.itechart.warehouse.core.client.Client;
import com.itechart.warehouse.core.entity.Entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@javax.persistence.Entity
@Table(name = "USER")
public class User extends Entity {
    private String firstName;
    private Client client;
    private String lastName;
    private String middleName;
    private Date birthday;
    private String email;
    private String city;
    private String street;
    private String house;
    private String apartment;
    private String login;
    private String password;
    private Date lastModifiedDate;
    private Boolean shown;

    private Set<Role> roles;

    @Column(name = "FIRST_NAME", nullable = false, length = 100)
    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String name) {
        this.firstName = name;
    }

    @ManyToOne(optional = false)
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    public Client getClient() {
        return client;
    }


    public void setClient(Client client) {
        this.client = client;
    }

    @Column(name = "LAST_NAME", nullable = false, length = 100)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "MIDDLE_NAME", nullable = false, length = 100)
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Column(name = "BIRTHDAY", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Column(name = "EMAIL",nullable = false, length = 100)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "CITY",nullable = false, length = 100)
    public String getCity() {
        return city;
    }

    @Column(name = "STREET", nullable = false, length = 100)
    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Column(name = "HOUSE", nullable = false, length = 20)
    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    @Column(name = "APARTMENT", nullable = false, length = 20)
    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    @Column(name = "LOGIN", nullable = false, length = 100)
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Column(name = "HASHPWD", nullable = false, length = 100)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "LAST_MODIFIED_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    @Column(name = "SHOWN", nullable = false)
    public Boolean getShown() {
        return shown;
    }

    public void setShown(Boolean shown) {
        this.shown = shown;
    }

    @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "USER_ROLE", joinColumns = {@JoinColumn(name = "USER_ID")})
    @Column(name = "NAME", nullable = false)
    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public static enum Role {
        SYSTEM_ADMIN, ADMIN, MANAGER, DISPATCHER, CONTROLLER, OWNER;
    }
}
