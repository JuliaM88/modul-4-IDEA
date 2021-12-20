import java.awt.*;

public class Stars {

    private int count;
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        int countL = this.count;
        String draw = "";
        int i = 0;
        if (countL % 1000 > 0) {
            i = countL / 1000;
            countL %= 1000;
            while (i != 0) {
                draw += "X";
                i--;
               // System.out.println(draw);
            }
        }
        if (countL % 100 > 0) {
            i = countL / 100;
            countL %= 100;
            while (i != 0) {
                draw += "Y";
                i--;
               // System.out.println(draw);
            }
        }
        if (countL % 10 > 0) {
            i = countL / 10;
            countL %= 10;
            while (i != 0) {
                draw += "Z";
                i--;
               // System.out.println(draw);
            }
            if (countL >0) {
                i = countL;
                while (i != 0) {
                    draw += "*";
                    i--;
                    //System.out.println(draw);
                }

            }



        }
        return draw;

    }
public static void main (String [] args){
        Stars stars = new Stars();
        stars.setCount(53);
        System.out.println(stars);
        System.out.println(stars.getCount());

//        System.out.println( stars.count());

    }

}


//        while ( getCount() >=0){
//
//            if (getCount() >=1000){
//                count1000 = getCount()/1000;
//                System.out.println(count1000);
//                getCount() = getCount() - (count1000 * 1000);
//            } else if (getCount() >=100){
//                count100 = (getCount() - count1000*1000)/100;
//                System.out.println(count100);
//
//            } else if (getCount() >=10){
//                count10 = (getCount() - count1000*1000 - count100*100)/10;
//                System.out.println(count10);
//
//            } else {
//                count1 = getCount() - count1000*1000 - count100*100 - count10*10;
//                System.out.println(count1);
//
//            }
