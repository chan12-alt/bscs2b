public class Main {
        public static void main(String[] args) {
            circleObj c = new circleObj(5);
            squareObj s= new squareObj(8,8);
            System.out.println(c.getName() + " Area: " + c.getArea());
            System.out.println(s.getName() + " Area: " + s.getArea());
        }
}

