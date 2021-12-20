public class Engine {
    private int power;

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower(){
        return power;
    }

    public String getFuelType(){
        return "A500";
    }


}
class XFuelEngine extends Engine{
    @Override
    public String getFuelType(){
        return "XFuel";
    }

    protected String serialNumber;

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

}

class AdvancedXFuelEngine extends XFuelEngine{
  public void printInfo(){
      System.out.println("Serial number is " + this.serialNumber + ", power is " + getPower());
    }

}