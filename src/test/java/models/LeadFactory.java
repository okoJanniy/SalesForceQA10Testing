package models;

import com.github.javafaker.Faker;

public class LeadFactory {
    public static Leads get(){
        Faker faker = new Faker();
        return Leads.builder()
                .leadStatus("New")
                .phone(faker.phoneNumber().phoneNumber())
                .salutation("Mr.")
                .firstName(faker.name().firstName())
                .lastName(faker.name().lastName())
                .company(faker.company().name())
                .email(faker.internet().emailAddress())
                .title("BA")
                .rating("Hot")
                .street(faker.address().streetName())
                .website(faker.internet().domainName())
                .city(faker.address().city())
                .state(faker.address().state())
                .zip(faker.address().zipCode())
                .country(faker.address().country())
                .numberOfEmployees("500")
                .leadSource("Employee Referral")
                .annualRevenue("100")
                .industry("Banking")
                .description("Some text")
                .accountName("")
                .build();

    }
}
