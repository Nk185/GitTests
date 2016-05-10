package Test;

public class Test{

    public static void Main () {

        int someVar  = 5;
        int someVar2 = 3;

        someVar = someVar - (someVar * 2 / someVar);
        InitCity();
    }

    public void InitCity() {

    }
}


public class Building implements IBuilding {

    private final String _buildingType;
    private Vector _existsInX;
    private Vector _existsInY;
    private double _price;

    public Building (String buildingType) {

        this._buildingType = buildingType;
    }

    @Override
    public boolean BuildIn (int xCoord, int yCoord) {

        try {

            this._existsInX.add(xCoord);
            this._existsInY.add(yCoord);

            return true;
        }
        catch (Exception e) {

            return false;            
        }
    }

    @Override
    public boolean DestroyIn (int xCoord, int yCoord) {

        try {

            this._existsInX.remove(xCoord);
            this._existsInY.remove(yCoord);

            return true;
        }
        catch (Exception e) {
            
            return false;
        }
    }

    @Override
    public boolean SetPrice (double price) {

        try {

            this._price = price;

            return  true;
        }
        catch (Exception e) {

            return false;            
        }
    }
    
}

public interface IBuilding{

    boolean BuildIn (int xCoord, int yCoord);
    boolean DestroyIn (int xCoord, int yCoord);
    boolean SetPrice (double price);
}

public class Transport implements ITransport{

    private final String _transportType;

    private int _currentPosX;
    private int _currentPosY;

    public void Transport(String transportType){

        this._transportType = transportType;
    }

    public boolean Move(int toX, int toY, double speed)){

        this._currentPosX = toX;
        this._currentPosY = toY;
    }
}

public interface ITransport{

    boolean Move(int toX, int toY, double speed);
}