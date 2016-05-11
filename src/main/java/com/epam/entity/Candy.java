package com.epam.entity;

import com.epam.entity.templ.Sweets;

public class Candy extends Sweets {

    private String type;

    private String color;

    public Candy(String name, String type, String color,  double weigh, int amount) {
        this.type = type;
        this.color = color;
        super.setWeigh(weigh);
        super.setAmount(amount);
        super.setName(name);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Candy candy = (Candy) o;

        if (color != null ? !color.equals(candy.color) : candy.color != null) return false;
        if (type != null ? !type.equals(candy.type) : candy.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "name" + super.getName()+
                " type='" + type + '\'' +
                ", color='" + color + '\'' +
                " weigh="+super.getWeigh() +
                " amount="+super.getAmount()+" }";
    }
}
