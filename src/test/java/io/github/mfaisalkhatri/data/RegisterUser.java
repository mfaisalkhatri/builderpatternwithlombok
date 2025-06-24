package io.github.mfaisalkhatri.data;

public class RegisterUser {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String country;
    private String mobileNumber;

    public RegisterUser (final String firstName, final String lastName, final String address, final String city,
        final String state, final String country, final String mobileNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.country = country;
        this.mobileNumber = mobileNumber;
    }

    public String getFirstName () {
        return firstName;
    }

    public void setFirstName (final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public void setLastName (final String lastName) {
        this.lastName = lastName;
    }

    public String getAddress () {
        return address;
    }

    public void setAddress (final String address) {
        this.address = address;
    }

    public String getCity () {
        return city;
    }

    public void setCity (final String city) {
        this.city = city;
    }

    public String getState () {
        return state;
    }

    public void setState (final String state) {
        this.state = state;
    }

    public String getCountry () {
        return country;
    }

    public void setCountry (final String country) {
        this.country = country;
    }

    public String getMobileNumber () {
        return mobileNumber;
    }

    public void setMobileNumber (final String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}