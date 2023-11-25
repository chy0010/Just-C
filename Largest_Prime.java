public class Largest_Prime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(217));

    }

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }
        int i = 2;
        while (i < number) {
            if (number % i == 0) {
                number /= i;
                i = 2;
                continue;
            }
            i++;
        }
        return number;


    }


//    public static int getLargestPrime(int number){
//        int a=-1;
//        boolean firstTime=true;
//        if(number>1){
//            for(int i=number/2;i>1;i--){
//                if(number%i==0){
//                    if(firstTime||a%i==0){
//                        a=i;
//                        firstTime=false;
//                    }
//
//                }
//            }
//        }
//        return a;
//    }
//    public static int getLargestPrime(int number) {
//        int i=2;
//        if(number<=1){
//            return -1;
//        }
//
//        while (i<number) {
//            if (number % i == 0) {
//                number /= i;
//                i=2;
//                continue;
//            }
//            i++;
//
//        }
//        return number;
//    }
}
