import java.util.Random;

public class Main {

    public static void main(String[] args){
        takeWalk(46,28);
        takeWalk(15,15);
        takeWalk(25,10);
        takeWalk(33,14);
        takeWalk(49,24);
        takeWalk(generateRandomAge(1,55),10);

    }
    public static String takeWalk(int userAge, int temperature){

        if ((userAge >= 20 && userAge <= 45) && (temperature >= -20 && temperature <= 30)){
           System.out.println("Можно идти гулять");
        }else if((userAge < 20) && (temperature >= 0 && temperature <= 28)){
            System.out.println("Можно идти гулять молодой");
        }
         else if((userAge > 45) && (temperature >= -10 && temperature <= 28)){
            System.out.println("Можно идти гулять дедушка");
        }else{
            System.out.println("Сидите дома!!!");
        }
        return "";
    }

    public static int generateRandomAge(int min , int max){
        Random ageNumber = new Random();
        return ageNumber.nextInt((max - min) + 1)+min;
    }
}