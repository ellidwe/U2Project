public class LinearEquation {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    LinearEquation(int x1, int y1, int x2, int y2)
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double slope()
    {
        return ((double) (y2 - y1)) / ((double) (x2 - x1));
    }

    public double yIntercept()
    {
        return y1 - slope() * x1;
    }

    public double distance()
    {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public String toString()
    {
        return "The first coordinate is: (" + x1 + "," + y1 + ")\n"
                + "The second coordinate is: (" + x2 + "," + y2 + ")\n"
                + "The equation of the line is: y = " + slope() + "x + " + yIntercept() + "\n"
                + "The slope of the line is: " + slope() +"\n"
                + "The y intercept of the line is: " + yIntercept() + "\n"
                + "The distance between the two points is: " + distance();

     }

}
