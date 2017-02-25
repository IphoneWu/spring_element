package demo1;

/**
 * Created by win8 on 2017/2/25.
 */
public class Customer {
    private int Type;
    private String action;
    private String Country;

    @Override
    public String toString() {
        return "Customer{" +
                "Type=" + Type +
                ", action='" + action + '\'' +
                ", Country='" + Country + '\'' +
                '}';
    }

    public int getType() {
        return Type;
    }

    public void setType(int type) {
        Type = type;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }
}
