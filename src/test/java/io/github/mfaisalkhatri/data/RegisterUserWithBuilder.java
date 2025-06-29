package io.github.mfaisalkhatri.data;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class RegisterUserWithBuilder {

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String country;
    private String mobileNumber;
}