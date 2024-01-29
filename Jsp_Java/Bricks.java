package Jsp_Java;

public class Bricks {
    public static void main(String[] args) {
        System.out.println(makeBricks(3, 1, 9));
        // makeBricks(3, 1, 8);
    }

    public static boolean makeBricks(int small, int big, int goal) {
        if (goal == 0)
    return true;
  
  if (goal < 0)
    return false;
    
  if (big > 0 && goal >= 5)
    return makeBricks(small, big - 1, goal - 5);
  else if (small > 0 && goal <= small)
    goal -= small;
    return (goal == 0) ? true : false;
      }
}
