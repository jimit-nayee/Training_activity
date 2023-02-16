public class Vehicle{
    private String make,vehicleNum,fuelType;
    private int fuelCapacity,cc;
     Vehicle(String make,String vehicleNum, String fuelType,int fuelCapacity, int cc ){
        this.make=make;
        this.fuelCapacity = fuelCapacity;
        this.vehicleNum = vehicleNum;
        this.fuelType = fuelType;
        this.cc = cc;
     }
     public void setCc(int cc) {
         this.cc = cc;
     }
     public int getCc() {
         return cc;
     }
     public void setFuelCapacity(int fuelCapacity) {
         this.fuelCapacity = fuelCapacity;
     }
     public int getFuelCapacity() {
         return fuelCapacity;
     }
     public void setFuelType(String fuelType) {
         this.fuelType = fuelType;
     }
     public String getFuelType() {
         return fuelType;
     }
     public String getMake() {
         return make;
     }
     public void setMake(String make) {
         this.make = make;
     }
     public String getVehicleNum() {
         return vehicleNum;
     }
     public void setVehicleNum(String vehicleNum) {
         this.vehicleNum = vehicleNum;
     }
    public void displayMake() {
            System.out.println("Make type : "+ this.make);
            
        }
    public void displayBasicInfo(){
        System.out.println("The Fuel capacity is :"+ this.fuelCapacity);
        System.out.println("The vehicle number is :"+ this.vehicleNum);
        System.out.println("The fuel type of vehicle is : "+ this.fuelType);
        System.out.println("The CC of vehicle is : "+this.cc);
    }
    public void displayDetailInfo(){

    }
}