package shapes.model;

import java.util.ArrayList;
import java.util.List;

public class PolyLine
{
    private List<Point> points = new ArrayList<>();

    public PolyLine() {}

    public PolyLine(Line line)
    {
        addLine(line);
    }

    public void addPoint(Point point)
    {
        points.add(point);
    }

    public void addLine(Line line)
    {
        addPoint(line.getScratchPoint());
        addPoint(line.getLastPoint());
    }

    public void addPolyLine(PolyLine polyLine)
    {
        points.addAll(polyLine.points);
    }

    public double length()
    {
        double length = 0;
        for (int i = 0; i < points.size() - 1; i++)
        {
            Point p1 = points.get(i);
            Point p2 = points.get(i + 1);
            length += p1.distanceFromPoint(p2);
        }
        return length;
    }

    public PolyLine reverse()
    {
        PolyLine reversedPolyLine = new PolyLine();
        for (int i = points.size() - 1; i >= 0; i--)
        {
            reversedPolyLine.addPoint(points.get(i));
        }
        return reversedPolyLine;
    }

    @Override
    public String toString()
    {
        return points.toString();
    }
}
