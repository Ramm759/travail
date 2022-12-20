package com.mycompany.patients.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
@Table(name = "patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "Le champ ne peut être vide.")
    private String firstname;

    @NotBlank(message = "Le champ ne peut être vide.")
    private String lastname;

    //@NotEmpty(message = "Le champ ne peut être vide.")
    private Date dateOfBirth;

    //@NotEmpty(message = "Le champ ne peut être vide.")
    private Character genre;

    @NotEmpty(message = "Le champ ne peut être vide.")
    private String adress;

    @NotEmpty(message = "Le champ ne peut être vide.")
    private String adressCp;

    @NotEmpty(message = "Le champ ne peut être vide.")
    private String adressCity;

    public Patient() {
    }

    public Patient(String firstname, String lastname, Date dateOfBirth, Character genre, String adress, String adressCp, String adressCity) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
        this.genre = genre;
        this.adress = adress;
        this.adressCp = adressCp;
        this.adressCity = adressCity;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Character getGenre() {
        return genre;
    }

    public void setGenre(Character genre) {
        this.genre = genre;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getAdressCp() {
        return adressCp;
    }

    public void setAdressCp(String adressCp) {
        this.adressCp = adressCp;
    }

    public String getAdressCity() {
        return adressCity;
    }

    public void setAdressCity(String adressCity) {
        this.adressCity = adressCity;
    }
}
