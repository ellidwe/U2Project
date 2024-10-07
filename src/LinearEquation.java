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
        double slopeRound = Math.round(((double) (y2 - y1)) / ((double) (x2 - x1)) * 100);
        return slopeRound / 100;
    }

    public String equationSlope()
    {
        return (y2 - y1) + "/" + (x2 - x1);
    }

    public double yIntercept()
    {
        double yIntRound =  Math.round(y1 - slope() * x1 * 100);
        return yIntRound / 100;
    }

    public double distance()
    {
        double aSquared = Math.pow((x2 - x1), 2);
        double bSquared = Math.pow((y2 - y1), 2);
        double cSquared = aSquared + bSquared;
        double c = Math.sqrt(cSquared);
        double cRound = Math.round(c * 100);
        return cRound / 100;
    }

    public String toString()
    {
        return "The first coordinate is: (" + x1 + "," + y1 + ")\n"
                + "The second coordinate is: (" + x2 + "," + y2 + ")\n"
                + "The equation of the line is: y = " + equationSlope() + "x + " + yIntercept() + "\n"
                + "The slope of the line is: " + slope() +"\n"
                + "The y intercept of the line is: " + yIntercept() + "\n"
                + "The distance between the two points is: " + distance();

     }

     public String thirdCoordinate(double x3)
     {
         return "(" + x3 + "," + ((slope() * x3 + yIntercept())) + ")";
     }

}
