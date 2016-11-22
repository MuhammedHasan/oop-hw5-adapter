class HeavyBaseBomberAircraft implements IBomberBaseAircraft {

    private HeavyBomberAircraft aircraft = new HeavyBomberAircraft();

    @Override
    public void bomb(int[] points) {
        this.aircraft.bomb(points[0], points[1]);
    }
}
