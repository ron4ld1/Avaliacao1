import java.util.Scanner;
public class Atividade1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("digite a 1ª nota");
        double notaUm=scanner.nextDouble();
        System.out.println("digite a 2ª nota");
        double notaDois=scanner.nextDouble();
        System.out.println("digite a 3ª nota");
        double notaTres=scanner.nextDouble();
        System.out.println("digite a 4 nota");
        double notaQuatro=scanner.nextDouble();
        System.out.println("digite a 5 nota");
        double notaCinco=scanner.nextDouble();
        System.out.println("digite a 6 nota");
        double notaSeis=scanner.nextDouble();
        System.out.println("digite a 7 nota");
        double notaSete=scanner.nextDouble();
        System.out.println("digite a 8 nota");
        double nota0ito=scanner.nextDouble();
        double mediaBi1=(notaUm+notaDois)/2;
        double mediaBi2=(notaTres+notaQuatro)/2;
        double mediaBi3=(notaCinco+notaSeis)/2;
        double mediaBi4=(notaSete+nota0ito)/2;
        double mediasemestre1=(mediaBi1+mediaBi2)/2;
        double mediasemestre2=(mediaBi3+mediaBi4)/2;
        double mediafinal=(mediasemestre1+mediasemestre2)/2;
        System.out.println("1ºbimestre:"+ mediaBi1);
        System.out.println("2ºbimestre:"+ mediaBi2);
        System.out.println("1ºSemestre:"+mediasemestre1);
        System.out.println("---------------------");
        System.out.println("3ºbimestre:"+mediaBi3);
        System.out.println("4°bimestre:"+mediaBi4);
        System.out.println("2°Semestre:"+ mediasemestre2);
        System.out.println("---------------------");
        System.out.println("media final" +mediafinal);
    }
}

