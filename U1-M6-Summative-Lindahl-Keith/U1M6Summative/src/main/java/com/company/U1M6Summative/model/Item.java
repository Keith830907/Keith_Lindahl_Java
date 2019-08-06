package com.company.U1M6Summative.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Item {

    private int id;
    private String Name;
    private String description;
    private BigDecimal daily_rate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getDaily_rate() {
        return daily_rate;
    }

    public void setDaily_rate(BigDecimal daily_rate) {
        this.daily_rate = daily_rate;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id &&
                Name.equals(item.Name) &&
                description.equals(item.description) &&
                daily_rate.equals(item.daily_rate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Name, description, daily_rate);
    }
}
