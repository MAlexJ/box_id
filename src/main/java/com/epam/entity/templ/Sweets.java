package com.epam.entity.templ;

public abstract class Sweets {
    private String name;
    private double weigh;
    private int amount;

    public Sweets() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeigh() {
        return weigh;
    }

    public void setWeigh(double weigh) {
        this.weigh = weigh;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sweets sweets = (Sweets) o;

        if (Double.compare(sweets.amount, amount) != 0) return false;
        if (Double.compare(sweets.weigh, weigh) != 0) return false;
        if (name != null ? !name.equals(sweets.name) : sweets.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(weigh);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(amount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Sweets{" +
                "name='" + name + '\'' +
                ", weigh=" + weigh +
                ", amount=" + amount +
                '}';
    }
}
