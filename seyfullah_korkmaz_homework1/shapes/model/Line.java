package shapes.model;

public class Line
{
    private Point scratchPoint;
    private Point lastPoint;

    public Line(Point startPoint, Point endPoint)
    {
        this.scratchPoint = startPoint;
        this.lastPoint = endPoint;
    }

    public Point getScratchPoint()
    {
        return scratchPoint;
    }

    public Point getLastPoint()
    {
        return lastPoint;
    }

    public double length()
    {
        return scratchPoint.distanceFromPoint(lastPoint);
    }

    @Override
    public String toString()
    {
        return scratchPoint.toString() + ", " + lastPoint.toString();
    }
}
