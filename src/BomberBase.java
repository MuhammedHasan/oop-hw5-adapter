import java.util.Objects;

class BomberBase implements IBomberBase {

    private IBomberBaseAircraft aircraft;

    @Override
    public void bomb(int[] points, boolean heavy) {
        if (heavy)
            new HeavyBaseBomberAircraft().bomb(points);
        else
            new MediumBaseBomberAircraft().bomb(points);
    }

}
