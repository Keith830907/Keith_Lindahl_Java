package com.company.weatherservice.model;

import javax.validation.constraints.NotEmpty;

public class Conditions {

    @NotEmpty(message = "You must supply an integer for windSpeed")
    private String windSpeed;
    @NotEmpty(message = "You must supply a value for windDirection")
    private String windDirection;
    @NotEmpty(message = "You must supply a value for skies")
    private String skies;
    @NotEmpty(message = "You must supply a value for precipitation")
    private String precipitation;


    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public String getSkies() {
        return skies;
    }

    public void setSkies(String skies) {
        this.skies = skies;
    }

    public String getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(String precipitation) {
        this.precipitation = precipitation;
    }
}
