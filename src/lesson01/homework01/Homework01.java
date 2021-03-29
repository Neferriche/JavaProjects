package lesson01.homework01;

public class Homework01 {
    public static void main(String[] args) {
        int a = 23, b = 8, c = 18, d = 9, e = 16, f = 7, g = -3;
        String h = "Евгений";
        float myMathResult = myMath(a, b, c, d);
        boolean myCheckResult = myCheck(e, f);
        String myNumberResult = myNumber(g);
        String myNameResult = myName(h);
        System.out.println(myMathResult);
        System.out.println(myCheckResult);
        System.out.println(myNumberResult);
        System.out.println(myNameResult);
    }
    public static float myMath(int a, int b, int c, float d) {
        return a * (b + (c / d));
    }

    public static boolean myCheck(int e, int f) {
        return (e + f >= 10) && (e + f <= 20);
    }

    public static String myNumber(int g) {
        if (g >= 0) return "Число положительное ^_^";
        else return "Число отрицательное о.о";
    }

    public static String myName(String h) {
        return "Привет, " + h + "!";
    }

}
