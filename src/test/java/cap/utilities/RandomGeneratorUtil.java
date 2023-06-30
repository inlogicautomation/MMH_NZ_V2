package cap.utilities;

import java.util.Random;



public class RandomGeneratorUtil {

    /** getRandomString is used to Instantly generate a secure, random password with the LastPass online tool.*/

    public static String getRandomString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 8;
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (new Random().nextFloat() * (rightLimit - leftLimit));
            buffer.append((char) randomLimitedInt);
        }
        String strRandomID = new StringBuilder("-").append(buffer).toString();
        return strRandomID.toUpperCase();
    }




//    public static void main (String[] args) {
////        Random rand = new Random();
////
////        int num1, num2, num3;
////
////        num1 = rand.nextInt (64) + 10;
////        num2 = rand.nextInt (643) + 100;
////        num3 = rand.nextInt (9000) + 1000;
////
////        System.out.println(num1+"-"+num2+"-"+num3);
////    }
//    Random r = new Random();
//        int i1 = r.nextInt(8);
//        System.out.println(i1);
//
//
//}

    public static void main(String[] args) {
        String mobileNumber = generateRandomMobileNumber();
        System.out.println("Random New Zealand mobile number: " + mobileNumber);
    }


    public static String generateRandomMobileNumber() {
        Random random = new Random();
        int countryCode = 64; // Country code for New Zealand
        int areaCode = random.nextInt(900) + 100; // Generate a random 3-digit area code
        int subscriberNumber = random.nextInt(9000000) + 1000000; // Generate a random 7-digit subscriber number


        return "+" + countryCode + areaCode + subscriberNumber;
    }
}
