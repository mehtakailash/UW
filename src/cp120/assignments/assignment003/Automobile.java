package cp120.assignments.assignment003;

public class Automobile {
    final int MPG = 33;
    final double FUEL_TANK_SIZE = 13.2;
    final double GAS_PRICE = 4.00;
    private double fuelLevel;
    private double odometerReading;
    double distance;
    double dollarAmount;
    Automobile(double fuelLevel1,double odometerReading1){
        fuelLevel= fuelLevel1;
        odometerReading= odometerReading1;
    }
    public double getFuelLevel(){
        return fuelLevel;
    }

    public double getMileage() {
        return odometerReading;
    }

    public double getFuelTankSize() {
        return FUEL_TANK_SIZE ;
    }

    public void drive(double distance1){
        distance = distance1;

        if((getFuelLevel()*MPG)>distance){
            fuelLevel= fuelLevel -(distance/MPG);
            odometerReading=odometerReading+distance;
            System.out.printf( "You drove %.2f miles. your fuel level is %.2f gallons.The odometer reading is %.2f miles.\n", distance, getFuelLevel(), odometerReading );
        }
        else
        {
            System.out.printf( "There is not enough fuel to drive the %.2f miles. The current fuel level is %.2f gallons.\n", distance, getFuelLevel() );
        }
    }

    public void refuel(double dollarAmount1){
        dollarAmount = dollarAmount1;

        if(((FUEL_TANK_SIZE-getFuelLevel())*GAS_PRICE)<dollarAmount && getFuelLevel() <FUEL_TANK_SIZE){
            System.out.printf( "Please pay %.2f dollars for %.2f gallons.Your change is %.2f dollars.\n", (FUEL_TANK_SIZE-getFuelLevel())*GAS_PRICE, FUEL_TANK_SIZE-getFuelLevel(), dollarAmount- (FUEL_TANK_SIZE-getFuelLevel())*GAS_PRICE );
            fuelLevel=FUEL_TANK_SIZE;
        }
        else if(getFuelLevel() == FUEL_TANK_SIZE){
            System.out.printf( "The fuel tank is already full.\n" );
        }
        else if(((getFuelTankSize()-getFuelLevel())*GAS_PRICE)>dollarAmount) {
            System.out.printf( "Please pay %.2f dollars for %.2f gallons.\n", dollarAmount, dollarAmount/GAS_PRICE  );
            fuelLevel=fuelLevel+dollarAmount/GAS_PRICE;
        }
        else {
            System.out.printf( "Please pay %.2f dollars for %.2f gallons. Your change is %.2f dollars\n", (getFuelTankSize()-getFuelLevel())*GAS_PRICE, dollarAmount/GAS_PRICE , dollarAmount-((getFuelTankSize()-getFuelLevel())*GAS_PRICE) );
            fuelLevel=fuelLevel+dollarAmount/GAS_PRICE;
        }
    }
}
