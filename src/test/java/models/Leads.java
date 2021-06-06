package models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Leads {
    String leadStatus;
    String phone;
    String salutation;
    String firstName;
    String lastName;
    String company;
    String email;
    String title;
    String rating;
    String street;
    String website;
    String city;
    String state;
    String zip;
    String country;
    String numberOfEmployees;
    String leadSource;
    String annualRevenue;
    String industry;
    String description;
    String accountName;
}
