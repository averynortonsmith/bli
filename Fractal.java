import java.util.*;

public class Fractal {
  public static void main(String[] args) {
    var chars = "BEZzc=<+:~~----     ".toCharArray();

    for (var y0 = -1.3; y0 <= 1.3; y0 += 0.062) {
      for (var x0 = -2.0; x0 <= 1.0; x0 += 0.03) {
        var x = 0.0;
        var y = 0.0;
        var iters = 0;

        while (iters + 1 < 20 && x * x + y * y < 4) {
          iters++;
          var tempX = x * x - y * y + x0;
          y = 2 * x * y + y0;
          x = tempX;
        }

        System.out.print(chars[iters]);
      }      
      System.out.println("");
    }
  }
}
