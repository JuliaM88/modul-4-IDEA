class FirNum {

    public int calc(int n){

        return n;
    }
}
class FirNumSum extends FirNum{

    @Override
    public int calc(int n){
        int sum = 0 ;
            while (n>0){
                sum = n + sum;
                n--;
               System.out.println(sum);
            }

        return sum ;
    }
}

class FirNumFactorial extends FirNum{

    @Override
    public int calc(int n){
        int fuc = 1 ;
        while (n>0){
            fuc = n * fuc;
            n--;
            //System.out.println(fuc);
        }

        return fuc ;
    }
}
class FirNumMultiplyOdd extends FirNum {
    @Override
    public int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 ==0) {
                continue;

            }
            result *= i;

        }return result;
    }
}

class FirNumFizzBuzz extends FirNum{
    @Override
    public int calc(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
                 if (i % 3 ==0 ^ i % 5 == 0){
                sum += i;
            }


        }return sum;
    }


}
//Половина суммы четных чисел от 1 до n включительно
class FirNumBasis extends FirNum{
        @Override
        public int calc(int n) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                if (i % 2 ==0 ){
                    sum += i;
                }


            }return sum/2;
}


}

class FirTest {
    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

//    public static void main(String[] args) {
//        FirNum firNum = new FirNumSum();
//        FirTest firTest = new FirTest();
//
//        //Should be 6
//        System.out.println(firTest.test(firNum, 3));
//
//    }

//

//    public static void main(String[] args) {
//        FirNum firNum = new FirNumMultiplyOdd();
//        FirTest firTest = new FirTest();
//
//        //Should be 15
//        System.out.println(firTest.test(firNum, 5));
//    }
//
//    public static void main(String[] args) {
//        FirNum firNum = new FirNumFizzBuzz();
//        FirTest firTest = new FirTest();
//
//        //Should be 83
//        System.out.println(firTest.test(firNum, 20));
//    }


    public static void main(String[] args) {
        FirNum firNum = new FirNumBasis();
        FirTest firTest = new FirTest();

        //Should be 20
        System.out.println(firTest.test(firNum, 9));
    }
}