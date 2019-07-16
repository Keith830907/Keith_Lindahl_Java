package CustomerComposition;

public class Customer {

    private Name name;
    private Address billingAddress;
    private Address shippingAddress;
    private String email;
    private String phone;
    private boolean Rewards;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean getRewards() {
        return Rewards;
    }

    public void setRewards(boolean rewards) {
        Rewards = rewards;
    }
}