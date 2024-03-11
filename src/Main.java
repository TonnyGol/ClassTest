import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AxisSystem axisSystem = new AxisSystem(); //this line displays the initial axis
        ex1(axisSystem);

        //ex2(axisSystem);

        //ex3(axisSystem);

        //ex4(axisSystem);

        //ex5(axisSystem);

        //ex6(axisSystem);

        //ex7(axisSystem);

        //ex8(axisSystem);

    }
    public static void ex1(AxisSystem board){
        board.addSinglePoint(100, 150, "blue");
    }
    public static void ex2(AxisSystem board){
        board.addSinglePoint(-200, 200, "blue");
    }
    public static void ex3(AxisSystem board){
        board.addSinglePoint(50, 50, "blue");
        board.addSinglePoint(60, 60, "blue");
        board.addSinglePoint(70, 70, "blue");
    }
    public static void ex4(AxisSystem board){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x and y coordination");
        board.addSinglePoint(scanner.nextInt(), scanner.nextInt(), "blue");
    }
    public static void ex5(AxisSystem board){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter color for points");
        String color = scanner.nextLine();
        System.out.println("Enter how many points you want to draw");
        int points = scanner.nextInt();
        for (int i = 0; i < points; i++){
            int x = random.nextInt(-250, 250);
            int y = random.nextInt(-250, 250);
            board.addSinglePoint(x, y, color);
        }
    }
    public static void ex6(AxisSystem board){
        int y;
        int start = (-250-100)/2;
        int end = (250-100)/2;
        for (int x = start; x < end; x++){
            y = 2*x + 100;
            board.addSinglePoint(x, y, "blue");
        }
    }
    public static void ex7(AxisSystem board){
        Scanner scanner = new Scanner(System.in);
        System.out.println("For y=mx+n , enter m and n");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int y;
        for (int x = -250; x < 250; x++){
            y = m*x + n;
            if(y > -250 && y < 250){
                board.addSinglePoint(x, y, "blue");
            }
        }
    }
    public static void ex8(AxisSystem board){
        int a = 2;
        int b = 3;
        int c = 50;
        int y;
        for (int x = -250; x < 250; x++){
            y = a*(x*x) - b*x + c;
            if(y > -250 && y < 250){
                System.out.println(x+"     "+y);
                board.addSinglePoint(x, y, "blue");
            }
        }
    }

    // -250 ______ 250
    // axisSystem.addSinglePoint(int x, int y, String color)
    // axisSystem.addMultiplePoints(int[] points, String color)
    // axisSystem.clear()

}
