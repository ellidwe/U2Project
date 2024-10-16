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
        double x = x2 - x1;
        double y = y2 - y1;

        if ((y / x) % 1 == 0) //Checks if y/x is a whole number
        {
            if ((y / x) == 1) //Checks if whole number slope is 1
            {
                return ""; //Returns an empty string instead of 1
            }
            else if ((y / x) == -1) //Checks if whole number slope is -1
            {
                return "-"; //Returns a negative sign instead of 1
            }
            else
            {
                return ((int) (y / x)) + ""; //Returns as a whole number
            }
        }
        else
        {
            if ((x2 - x1) < 0 && (y2 - y1) >= 0) //Checks if denominator is negative and numerator is positive
            {
                return (-1 * (y2 - y1)) + "/" + (-1 * (x2 - x1)); //Returns with negative sign in numerator rather than denominator
            }
            else if ((x2 - x1) < 0 && (y2 - y1) < 0) //Checks if both numerator and denominator are negative
            {
                return (-1 * (y2 - y1)) + "/" + (-1 * (x2 - x1)); //Returns with numerator and denominator as positive numbers
            }
            return (y2 - y1) + "/" + (x2 - x1); //Returns as fraction
        }
    }

    public double yIntercept()
    {
        double yIntRound =  Math.round((y1 - (slope() * x1)) * 100);
        return yIntRound / 100.0;
    }

    public String equationYIntercept()
    {
        if (yIntercept() == 0) //Checks if y intercept is equal to 0
        {
            return ""; //Returns an empty string instead of "+ 0"
        }
        else if (yIntercept() > 0)
        {
            return "+ " + yIntercept();
        }
        else //Is true if y intercept is negative
        {
            return "- " + Math.abs(yIntercept()); //Returns the y intercept being subtracted instead of it being added as a negative value
        }
    }

    public String formEquation()
    {
        if (yIntercept() == 0 && slope() == 0)
        {
            return "y = 0";
        }
        else
        {
            return "y = " + equationSlope() + "x " + equationYIntercept() + "\n"; //Concatenates slope, intercept, and other strings to form the equation
        }
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
                + "The equation of the line is: " + formEquation()
                + "The slope of the line is: " + slope() +"\n"
                + "The y intercept of the line is: " + yIntercept() + "\n"
                + "The distance between the two points is: " + distance();

     }

     public String thirdCoordinate(double x3)
     {
         return "(" + x3 + "," + ((slope() * x3 + yIntercept())) + ")";
     }

}
