package vehicle;

public class Car extends Vehicle {
   
    boolean carHasSunroof;
    Sound_System carSoundSystem;
    public Car( String vehicleRegNumber, String vehicleBrand, Category vehicleCategory,boolean carhasSunroof,Sound_System carSoundSystem,float vehiclePrice)
    {
        super(vehicleRegNumber,vehicleBrand,vehicleCategory,vehiclePrice);
        this.carHasSunroof=carhasSunroof;
        this.carSoundSystem=carSoundSystem;
    }


    @Override
    void calculateRtoTax(){
        System.out.println(this.getVehiclePrice() * 0.025);

    }
    
}
