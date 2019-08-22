package com.company.U1M6Summative.viewmodel;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;
import java.util.Objects;

public class ItemViewModel {
    private int id;
    @NotEmpty(message="Please supply a value for name")
    private String name;
    @NotEmpty(message="Please supply a value for description")
    private String description;
    @DecimalMin(value = "0.0", inclusive = true)
    @DecimalMax(value = "999999.99", inclusive = true)
    private BigDecimal dailyRate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(BigDecimal dailyRate) {
        this.dailyRate = dailyRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemViewModel that = (ItemViewModel) o;
        return id == that.id &&
                name.equals(that.name) &&
                description.equals(that.description) &&
                dailyRate.equals(that.dailyRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, dailyRate);
    }
}

