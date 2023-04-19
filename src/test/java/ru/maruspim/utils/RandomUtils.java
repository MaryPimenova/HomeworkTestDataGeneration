package ru.maruspim.utils;
import com.github.javafaker.Faker;
import java.util.Locale;
import java.text.SimpleDateFormat;

// Class for fake data generating
public class RandomUtils {
        static Faker faker = new Faker(new Locale("en-IND"));
        static SimpleDateFormat sdf = new SimpleDateFormat("yyy MMMM dd", Locale.ENGLISH);
        static String str = sdf.format(faker.date().birthday()); //generating of birthday date
        static String[] splitDate = str.split(" "); //splitting into year? month and day
        static String[]
                gendersChoice = {"Male", "Female", "Other"},
                subjectsChoice = {"Hindi", "English", "Maths", "Physics", "Chemistry", "Biology", "Computer Science", "Commerce", "Accounting", "Economics", "Arts", "Social Studies", "History", "Civics"},
                hobbiesChoice = {"Sports", "Reading", "Music"},
                statesChoice = {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"},
                citiesOfNCR = {"Delhi", "Gurgaon", "Noida"},
                citiesOfUttarPradesh = {"Agra", "Lucknow", "Merrut"},
                citiesOfHaryana = {"Karnal", "Panipat"},
                citiesOfRajasthan = {"Jaipur", "Jaiselmer"},
                months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        public static String createRandomFirstName() {

            return faker.name().firstName();
        }
        public static String createRandomLastName() {

            return faker.name().lastName();
        }
        public static String createRandomEmail() {

            return faker.internet().emailAddress();
        }
        public static String createRandomGender() {

            return faker.options().option(gendersChoice);
        }
        public static String createRandomMobileNumber() {

            return faker.phoneNumber().subscriberNumber(10);
        }
        public static String createRandomYear() {

            return splitDate[0];
        }
        public static String createRandomMonth() {

            return splitDate[1];
        }
        public static String createRandomDay() {

            return splitDate[2];
        }
        public static String createRandomSubject() {

            return faker.options().option(subjectsChoice);
        }
        public static String createRandomHobby() {

            return faker.options().option(hobbiesChoice);
        }
        public static String createRandomCurrentAddress() {

            return faker.address().fullAddress();
        }
        public static String createRandomState() {

            return faker.options().option(statesChoice);
        }
        public static String createRandomCity(String state) {
            switch (state) {
                case "NCR": {
                    return faker.options().option(citiesOfNCR);
                }
                case "Uttar Pradesh": {
                    return faker.options().option(citiesOfUttarPradesh);
                }
                case "Haryana": {
                    return faker.options().option(citiesOfHaryana);
                }
                case "Rajasthan": {
                    return faker.options().option(citiesOfRajasthan);
                }
            }
            return null;
        }

 public static String
         firstName = createRandomFirstName(),
         lastName = createRandomLastName(),
         userEmail = createRandomEmail(),
         gender = createRandomGender(),
         mobileNumber = createRandomMobileNumber(),
         year = createRandomYear(),
         month = createRandomMonth(),
         day = createRandomDay(),
         subject = createRandomSubject(),
         hobby = createRandomHobby(),
         currentAddress = createRandomCurrentAddress(),
         state = createRandomState(),
         city = createRandomCity(state);
}
