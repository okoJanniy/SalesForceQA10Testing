package models;

public class Account {
    String accountName;
    String phone;
    String website;
    String fax;
    String option;
    String industry;
    String employees;
    String annualRevenue;
    String description;
    String billingStreet;
    String shippingStreet;
    String billingCity;
    String billingState;
    String shippingCity;
    String shippingState;
    String billingZip;
    String billingCountry;
    String shippingZip;
    String shippingCountry;

    public Account(String accountName, String phone, String website, String fax, String option, String industry,
                   String employees, String annualRevenue, String description, String billingStreet, String shippingStreet,
                   String billingCity, String billingState, String shippingCity, String shippingState, String billingZip,
                   String billingCountry, String shippingZip, String shippingCountry) {
        this.accountName = accountName;
        this.phone = phone;
        this.website = website;
        this.fax = fax;
        this.option = option;
        this.industry = industry;
        this.employees = employees;
        this.annualRevenue = annualRevenue;
        this.description = description;
        this.billingStreet = billingStreet;
        this.shippingStreet = shippingStreet;
        this.billingCity = billingCity;
        this.billingState = billingState;
        this.shippingCity = shippingCity;
        this.shippingState = shippingState;
        this.billingZip = billingZip;
        this.billingCountry = billingCountry;
        this.shippingZip = shippingZip;
        this.shippingCountry = shippingCountry;
    }


    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getEmployees() {
        return employees;
    }

    public void setEmployees(String employees) {
        this.employees = employees;
    }

    public String getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(String annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBillingStreet() {
        return billingStreet;
    }

    public void setBillingStreet(String billingStreet) {
        this.billingStreet = billingStreet;
    }

    public String getShippingStreet() {
        return shippingStreet;
    }

    public void setShippingStreet(String shippingStreet) {
        this.shippingStreet = shippingStreet;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public String getBillingState() {
        return billingState;
    }

    public void setBillingState(String billingState) {
        this.billingState = billingState;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public void setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity;
    }

    public String getShippingState() {
        return shippingState;
    }

    public void setShippingState(String shippingState) {
        this.shippingState = shippingState;
    }

    public String getBillingZip() {
        return billingZip;
    }

    public void setBillingZip(String billingZip) {
        this.billingZip = billingZip;
    }

    public String getBillingCountry() {
        return billingCountry;
    }

    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }

    public String getShippingZip() {
        return shippingZip;
    }

    public void setShippingZip(String shippingZip) {
        this.shippingZip = shippingZip;
    }

    public String getShippingCountry() {
        return shippingCountry;
    }

    public void setShippingCountry(String shippingCountry) {
        this.shippingCountry = shippingCountry;
    }



    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }



}