abstract class shapeFig {
    public abstract String getName();
    public abstract double getArea();
}

class circleObj extends shapeFig {
    double radius;

    public circleObj (double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public String getName() {
        return "Circle";
    }
}