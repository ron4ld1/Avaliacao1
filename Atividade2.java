import java.util.Scanner;
public class Atividade2{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("digite a temperatura em celsius");
        double celsius= scanner.nextDouble();
        double farenheit=(celsius *9/5)+32;
        double kelvin=celsius+273.15;
        System.out.println("temperatura em celsius:"+celsius);
        System.out.println("temperatura em farenheit:"+farenheit);
        System.out.println("temperatura e, kelvin:"+kelvin);
    }
}
