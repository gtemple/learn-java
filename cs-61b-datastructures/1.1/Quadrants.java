public class Quadrants {
    public static int quadrant(double x, double y) {
        if (x > 0 && y > 0) {
            return 1; // Upper-right quadrant
        } else if (x < 0 && y > 0) {
            return 2; // Upper-left quadrant
        } else if (x < 0 && y < 0) {
            return 3; // Lower-left quadrant
        } else if (x > 0 && y < 0) {
            return 4; // Lower-right quadrant
        } else {
            return 0; // On the x-axis or the y-axis
        }
    }

    public static void main(String[] args) {
        System.out.println(quadrant(12.4, 17.8));   // Output: 1
        System.out.println(quadrant(-2.3, 3.5));   // Output: 2
        System.out.println(quadrant(-15.2, -3.1)); // Output: 3
        System.out.println(quadrant(4.5, -42.0));  // Output: 4
        System.out.println(quadrant(0.0, 3.14));   // Output: 0
    }
}
