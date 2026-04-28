public class FormulaExamples {
   public static void main(String[] args) {
      
        double radius = 7;
        int length = 10, width = 5;
        double base = 6, height = 4;
      
        double areaCircle = Math.PI * radius * radius;
        int areaRectangle = length * width;
        double areaTriangle = 0.5 * base * height;

        System.out.println("Area Calculations:");
        System.out.println("Circle: " + areaCircle);
        System.out.println("Rectangle: " + areaRectangle);
        System.out.println("Triangle: " + areaTriangle);
        System.out.println("------");
    }
}
