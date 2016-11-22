class MediumBaseBomberAircraft implements IBomberBaseAircraft {

    @Override
    public void bomb(int[] points) {
        System.out.println("Bombing:");
        System.out.println("x:" + points[0] + " y:" + points[1]);
        System.out.println("x:" + points[0] + 1 + " y:" + points[1] + 1);
    }

}
