package ru.maruspim.tests;
import org.junit.jupiter.api.Test;
import static ru.maruspim.utils.RandomUtils.*;
public class RegistrationWithTestDataTests extends TestBase {

    @Test
    void successfulFillFormTest() {

        registrationPage.openPage("/automation-practice-form")
                .footerRemoving()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setUserEmail(userEmail)
                .setGenderWrapper(gender)
                .setMobileNumber(mobileNumber)
                .setDate(day,month,year)
                .setSubjects(subject)
                .setHobby(hobby)
                .uploadPicture("images/batty.jpg")
                .setCurrentAddress(currentAddress)
                .setState(state)
                .setCity(city)
                .clickSubmit();

        registrationPage.verifyRegistrationResultsModalAppears()
                .verifyResult("Student Name", firstName + " " + lastName)
                .verifyResult("Student Email", userEmail)
                .verifyResult("Gender", gender)
                .verifyResult("Mobile", mobileNumber)
                .verifyResult("Date of Birth", day + " " + month + "," + year)
                .verifyResult("Subjects", subject)
                .verifyResult("Hobbies", hobby)
                .verifyResult("Picture", "batty.jpg")
                .verifyResult("Address", currentAddress)
                .verifyResult("State and City", state + " " + city);


    }

}
