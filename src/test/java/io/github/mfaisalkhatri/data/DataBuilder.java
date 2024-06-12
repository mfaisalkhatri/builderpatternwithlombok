package io.github.mfaisalkhatri.data;

import net.datafaker.Faker;

/**
 * Created By Faisal Khatri on 09-09-2022
 */
public class DataBuilder {

    private static final Faker FAKER = new Faker();

    public static RegisterUserWithBuilder getUserData () {
        return RegisterUserWithBuilder.builder ()
            .firstName (FAKER.name ()
                .firstName ())
            .lastName (FAKER.name ()
                .lastName ())
            .address (FAKER.address ()
                .streetAddress ())
            .state (FAKER.address ()
                .state ())
            .city (FAKER.address ()
                .city ())
            .country (FAKER.address ()
                .country ())
            .mobileNumber (String.valueOf (FAKER.number ()
                .numberBetween (9990000000L, 9999999999L)))
            .build ();
    }
}