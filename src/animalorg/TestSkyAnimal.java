package animalorg;

public class TestSkyAnimal {
    //Learning Java loop
    public static void main(String[] args) {
        String fullName = "Nguyen Duy Hung";
        //Print every characters of fullName
//        for (int i = 0; i < fullName.length(); i++) {
//            System.out.println(fullName.charAt(i));
//        }
        //Print every characters of fullName 5 times
//        for (int j = 1; j < 6; j++) {
//            for (int i = 0; i < fullName.length(); i++) {
//                System.out.println(fullName.charAt(i));
//            }
//            System.out.println("--------------------------");
//        }
        //using foreach to loop
        int [] oneToTen = {0,1,2,3,4,5,6,7,8,9,10};
        for (int number : oneToTen) {
            System.out.println(number);
        }

        //using while loop
//        int number = 0;
//        while(true){
//            System.out.println(number);
//            if (number >= 6) {
//                break;
//            }
//        }
        //Print number from 0-10 except 5
        for (int i = 0; i < 11; i++) {
            if (i != 5) {
                System.out.println(i);
            }
        }

        //Using continue in loop
        int number = 0;
        while (number <= 10) {
            if (number == 5) {
                number++;
                continue;
            }
            System.out.println(number);
            number++;

        }
        int num = 0;
        do {
            if (num == 5) {
                num++;
                continue;
            }
            System.out.println(num);
            num++;
        } while (num <= 10);
    }
}
