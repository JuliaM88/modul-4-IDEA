

class aTrainings {
    public int calcE(String fuel, int count){
        if (fuel.equals("a")){
            return count*70;
        } else
            return count * 50;

    }
    public static void main(String[] args) {
        aTrainings ddd = new aTrainings();
        System.out.println(ddd.calcE("dla", 70));



}
}
