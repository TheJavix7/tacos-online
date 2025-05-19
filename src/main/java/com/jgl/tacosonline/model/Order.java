package com.jgl.tacosonline.model;

import org.hibernate.validator.constraints.CreditCardNumber;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Order {
    @NotBlank(message = "El nombre es obligatorio")
    private String name;
    @NotBlank(message = "La calle es obligatoria")
    private String street;
    @NotBlank(message = "La ciudad es obligatoria")
    private String city;
    @NotBlank(message = "El pais es obligatorio")
    private String state;
    @NotBlank(message = "El codigo postal es obligatorio")
    private String zip;
    @CreditCardNumber(message = "No es una tarjeta valida")
    private String ccNumber;
    @Pattern(regexp = "^(0[1-9]|1[0-2](/)([2-9][0-9]))$", message = "La fecha debe ser MM/AA")
    private String ccExpiration;
    @Digits(integer = 3, fraction = 0, message = "CVV invalido")
    private String ccCVV;

    public Order(String name, String street, String city, String state, String zip, String ccNumber, String ccExpiration, String ccCVV) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.ccNumber = ccNumber;
        this.ccExpiration = ccExpiration;
        this.ccCVV = ccCVV;
    }

    public Order() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCcNumber() {
        return ccNumber;
    }

    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }

    public String getCcExpiration() {
        return ccExpiration;
    }

    public void setCcExpiration(String ccExpiration) {
        this.ccExpiration = ccExpiration;
    }

    public String getCcCVV() {
        return ccCVV;
    }

    public void setCcCVV(String ccCVV) {
        this.ccCVV = ccCVV;
    }
}
