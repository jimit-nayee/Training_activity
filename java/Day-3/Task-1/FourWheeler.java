public class FourWheeler extends Vehicle {
     private String audioSystem;
     private int numberOfDoor;
 
     FourWheeler(String make,String vehicleNum, String fuelType,int fuelCapacity, int cc,String audioSystem,int numberOfDoor){
         super(make, vehicleNum, fuelType, fuelCapacity, cc);
         this.audioSystem = audioSystem;
         this.numberOfDoor = numberOfDoor;
 
     }
     public void setAudioSystem(String audioSystem) {
         this.audioSystem = audioSystem;
     }
     public String getAudioSystem() {
         return audioSystem;
     }
     public void setNumberOfDoor(int numberOfDoor) {
         this.numberOfDoor = numberOfDoor;
     }
     public int getNumberOfDoor() {
         return numberOfDoor;
     }
     public void displayDetailInfo(){
         System.out.println("The Fuel capacity is :"+getFuelCapacity());
         System.out.println("The vehicle number is :"+ getVehicleNum());
         System.out.println("The fuel type of vehicle is : "+ getFuelType());
         System.out.println("The CC of vehicle is : "+getCc());
         System.out.println("Audio System : "+ this.audioSystem);
         System.out.println("NUmber of doors : "+ this.numberOfDoor);
     }
     
 }