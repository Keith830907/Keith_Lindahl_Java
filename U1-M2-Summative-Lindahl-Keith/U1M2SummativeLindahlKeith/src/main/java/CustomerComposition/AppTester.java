package CustomerComposition;

public class AppTester {

    public static void main(String[] args) {

        Name name = new Name("Keith", "Lindahl");
        Address billingAddress = new Address("3141 Marion Street", "NA", "Lake Station", "IN", "46405");
        Address shippingAddress = new Address("2295 Newton Street", "NA", "Lake Station", "IN", "46405");

        Customer customer = new Customer();






        customer.setName(name);
        customer.setBillingAddress(billingAddress);
        customer.setShippingAddress(shippingAddress);
        System.out.println(customer.getName());
        System.out.println(customer.getBillingAddress());
        System.out.println(customer.getShippingAddress());
        customer.setEmail("Keith830907@email.phoenix.edu");
        customer.setPhone("2197759976");
        customer.setRewards(true);
        System.out.println(customer.getEmail());
        System.out.println(customer.getPhone());
        System.out.println("Is a rewards member: "+customer.getRewards());
    }}
