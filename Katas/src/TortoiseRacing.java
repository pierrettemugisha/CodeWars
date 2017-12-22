import java.util.Arrays;

public class TortoiseRacing {
    public static int[] race(int v1, int v2, int g) {
        // your code
        int[] time = new int[0];
        double sec = (v2 * g) / (v1 * (v2 - v1))*3.6e+6;
        int min = (int) (sec / 60);
        int hours = min / 60;
        time = new int[]{(int) ((sec / 3600)%24), (int) ((sec / 60)%60), (int) (sec % 60)};
        return time;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(race(720, 850, 70)));
        System.out.println(Arrays.toString(race(80, 91, 37)));
        System.out.println(Arrays.toString(race(80, 100, 40)));
    }
}
