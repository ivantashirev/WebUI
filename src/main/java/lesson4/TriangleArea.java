package lesson4;


public class TriangleArea {
    public static void main(String[] args) throws Exception {
        System.out.println(triangleArea(3,4,5));
    }

    public static double triangleArea(double A, double B, double C) throws Exception {

        if(A <= 0 || B<=0 || C<=0) {
            throw  new Exception("Одна из сторон меньше или равна 0");
        }

        double p = (A + B + C)/2;
        return Math.sqrt(p*(p-A)*(p-B)*(p-C));
    }
}
