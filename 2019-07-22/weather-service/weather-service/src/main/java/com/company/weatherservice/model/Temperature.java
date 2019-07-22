package com.company.weatherservice.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Temperature {

    @NotEmpty(message = "You must supply a value for fahrenheit")
    private String fahrenheit;
    @NotEmpty(message = "You must supply a value for celsius")
    private String celsius;

    public String getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(String fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public String getCelsius() {
        return celsius;
    }

    public void setCelsius(String celsius) {
        this.celsius = celsius;
    }
}
