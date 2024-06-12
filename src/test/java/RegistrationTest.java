import io.github.mfaisalkhatri.data.RegisterUser;
import io.github.mfaisalkhatri.data.RegisterUserWithBuilder;
import org.testng.annotations.Test;

import static io.github.mfaisalkhatri.data.DataBuilder.getUserData;
import static org.testng.Assert.assertEquals;

/**
 * Created By Faisal Khatri on 09-09-2022
 */
public class RegistrationTest {

    @Test
    public void testRegisterUser () {
        RegisterUser registerUser = new RegisterUser ("John", "Doe", "302, Adam Street, 1st Lane", "New Orleans",
            "New Jersey", "US", "52145364");

        assertEquals (registerUser.getFirstName (), "John");
        assertEquals (registerUser.getCountry (), "US");
    }

    @Test
    public void testRegisterUserWithBuilder () {
        RegisterUserWithBuilder registerUserWithBuilder = getUserData ();
        System.out.println (registerUserWithBuilder.getFirstName ());
        System.out.println (registerUserWithBuilder.getLastName ());
        System.out.println (registerUserWithBuilder.getAddress ());
        System.out.println (registerUserWithBuilder.getCity ());
        System.out.println (registerUserWithBuilder.getState ());
        System.out.println (registerUserWithBuilder.getCountry ());
        System.out.println (registerUserWithBuilder.getMobileNumber ());
    }
}