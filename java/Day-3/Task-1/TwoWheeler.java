public class TwoWheeler extends Vehicle {
    private boolean kickStart ;
    TwoWheeler(String make,String vehicleNum, String fuelType,int fuelCapacity, int cc, boolean kickStart){
        super(make, vehicleNum, fuelType, fuelCapacity, cc);
       
        this.kickStart = kickStart;
    }
    
    public void setKickStart(boolean kickStart) {
        this.kickStart = kickStart;
    }
    public boolean getKickStart(){
        return kickStart;
    }
    

    public void displayDetailInfo(){
        System.out.println("The Fuel capacity is :"+getFuelCapacity());
        System.out.println("The vehicle number is :"+ getVehicleNum());
        System.out.println("The fuel type of vehicle is : "+ getFuelType());
        System.out.println("The CC of vehicle is : "+getCc());
        System.out.println("Kickstart avaliability : "+ this.kickStart);

    }



}