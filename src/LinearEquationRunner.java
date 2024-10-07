import java.util.Scanner;

public class LinearEquationRunner {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter your first coordinate point: ");
        String coordinate1 = s.nextLine(); //User enters their first coordinate

        int coordinate1Length = coordinate1.length();
        String coordinate1Shortened = coordinate1.substring(1, coordinate1Length - 1); //Removes parentheses from first coordinate

        String x1String = coordinate1Shortened.substring(0, coordinate1Shortened.indexOf(",")); //Gets x1 from coordinate
        int x1 = Integer.parseInt(x1String); //Makes an int with the value of x1

        String y1String = coordinate1Shortened.substring(coordinate1Shortened.indexOf(",") + 1); //Gets y1 from coordinate
        int y1 = Integer.parseInt(y1String); //Makes an int with the value of y1

        System.out.print("Enter your second coordinate point: ");
        String coordinate2 = s.nextLine(); //User enters their second coordinate

        int coordinate2Length = coordinate2.length();
        String coordinate2Shortened = coordinate2.substring(1, coordinate2Length - 1); //Removes parentheses from second coordinate

        String x2String = coordinate2Shortened.substring(0, coordinate2Shortened.indexOf(",")); //Gets x2 from coordinate
        int x2 = Integer.parseInt(x2String); //Makes an int with the value of x2

        String y2String = coordinate2Shortened.substring(coordinate2Shortened.indexOf(",") + 1); //Gets y2 from coordinate
        int y2 = Integer.parseInt(y2String); //Makes an int with the value of y2

        LinearEquation equation = new LinearEquation(x1, y1, x2, y2);

        System.out.println();
        System.out.println(equation.toString());
        System.out.println();

        System.out.print("Enter a third x value: ");
        String x3String = s.nextLine(); //User enters their third x value
        double x3 = Double.parseDouble(x3String); //Makes a double with the value of x3

        System.out.println("The coordinate on the line with that x value is: " + equation.thirdCoordinate(x3));
    }
}
