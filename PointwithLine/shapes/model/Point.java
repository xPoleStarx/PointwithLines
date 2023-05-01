package shapes.model;

public class Point {
    private int x_coordinate;
    private int y_coordinate;

    public Point(int x_coordinates, int y_coordinates)
    {
        this.x_coordinate = x_coordinates;
        this.y_coordinate = y_coordinates;
    }

    public int getX_coordinate()
    {
        return x_coordinate;
    }

    public int getY_coordinate()
    {
        return y_coordinate;
    }

    public double distanceFromPoint(Point otherPoint)
    {
        double dx = x_coordinate - otherPoint.getX_coordinate();
        double dy = y_coordinate - otherPoint.getY_coordinate();
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString()
    {
        return "(x = " + x_coordinate + ", y = " + y_coordinate + ")";
    }
}