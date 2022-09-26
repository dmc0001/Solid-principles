public interface FreeParkingLot extends ParkingLot {

    @Override
    default int getCabacity() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    default void parkCar() {
        // TODO Auto-generated method stub
        
    }

    @Override
    default void unparkCar() {
        // TODO Auto-generated method stub
        
    }
    
}
