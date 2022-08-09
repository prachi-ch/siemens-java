package vehicle;

abstract public class Vehicle {
    String vehicleRegNumber;
    String vehicleBrand;
    Category vehicleCategory;
    float vehiclePrice;


    public Vehicle(String vehicleRegNumber, String vehicleBrand, Category vehicleCategory, float vehiclePrice) {
        this.vehicleRegNumber = vehicleRegNumber;
        this.vehicleBrand = vehicleBrand;
        this.vehicleCategory = vehicleCategory;
        this.vehiclePrice = vehiclePrice;
    }

    public String getVehicleRegNumber() {
        return this.vehicleRegNumber;
    }

    public void setVehicleRegNumber(String vehicleRegNumber) {
        this.vehicleRegNumber = vehicleRegNumber;
    }

    public String getVehicleBrand() {
        return this.vehicleBrand;
    }

    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    public Category getVehicleCategory() {
        return this.vehicleCategory;
    }

    public void setVehicleCategory(Category vehicleCategory) {
        this.vehicleCategory = vehicleCategory;
    }

    public float getVehiclePrice() {
        return this.vehiclePrice;
    }

    public void setVehiclePrice(float vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
    }

    @Override
    public String toString() {
        return "{" +
            " vehicleRegNumber='" + getVehicleRegNumber() + "'" +
            ", vehicleBrand='" + getVehicleBrand() + "'" +
            ", vehicleCategory='" + getVehicleCategory() + "'" +
            ", vehiclePrice='" + getVehiclePrice() + "'" +
            "}";
    }
    
    abstract void calculateRtoTax();

    
}
