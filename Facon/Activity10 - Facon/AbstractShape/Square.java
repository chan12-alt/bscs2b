class squareObj extends shapeFig {
    double length;
    double width;

    public squareObj(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String getName() {
        return "Square";
    }
}