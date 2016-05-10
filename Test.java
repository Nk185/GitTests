package Test;

public class Test{



    public static void Main() {

        int someVar  = 5;
        int someVar2 = 3;

        someVar = someVar - (someVar * 2 / someVar);
        InitCity();
    }

    public void InitCity() {

    }
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