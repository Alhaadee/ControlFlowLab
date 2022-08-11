import java.util.Scanner;

public class whatToWear {
    public static void main(String[] args) {
        System.out.println("What is the weather like today?");
        Scanner reader = new Scanner(System.in);
        String weatherInput = reader.nextLine();

        System.out.println("whats the temperature today?");
        Scanner tempReader = new Scanner(System.in);
        String tempInput = tempReader.nextLine();
        int temperature = Integer.parseInt(tempInput);

        if (weatherInput.equals("rainy") || weatherInput.equals("cloudy") && temperature < 10){
            System.out.println("wear a waterproof winter coat");
        } else if (weatherInput.equals("sunny") && temperature > 20){
            System.out.println("wear a t-shirt and shorts");
        } else if (weatherInput.equals("snowy") && temperature < 5){
            System.out.println("wrap up in many layers!");
        } else System.out.println("I don't know what to wear either");


    }
}
