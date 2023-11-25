public class Flour_Pack_Problem {
    public static void main(String[] args) {
        System.out.println( canPack (-3, 2, 12));


    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount >= 0 & smallCount >= 0 && goal >= 0) {
            for (int i = 0; i <= bigCount; i++) {
                int a= i * 5;
                if (a == goal) {
                    return true;
                }
                for (int j = 0; j <= smallCount; j++) {
                    if (a + j == goal) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
