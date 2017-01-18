package Task_1_1_5;
import edu.princeton.cs.algs4.StdOut;

public class Task{

    private double x;
    private double y;
    public Task(double x, double y) {
        this.x = x;
        this.y = y;

        if (x>0 && x<1 && y >0 && y<1) {
            StdOut.print("true");
        }
        else {
            StdOut.print("false");
        }
    }

}