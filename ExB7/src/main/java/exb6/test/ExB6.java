package exb6.test;


import exb6.model.Address;

public class ExB6 {
    public static void main(String[] args) {
        Address address = new Address ("street address", "nr address", "zipCode address", "Leuven", "country address", "countryCode address");
        System.out.println(address.getTown());
    }
}
