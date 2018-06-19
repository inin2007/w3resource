public class Main {
  public static void main(String[] args) {
    int temp, x, y;
    x = 8;
    y = 2;
    System.out.println("Before swapping x = "+x+"; y = "+y);
    temp = x;
    x = y;
    y = temp;
    System.out.println("After swapping x = "+x+"; y = "+y);
  }
}
