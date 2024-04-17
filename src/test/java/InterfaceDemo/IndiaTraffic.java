package InterfaceDemo;

public class IndiaTraffic implements CentralTraffic, ContinentalTraffic{
    public static void main(String[] args) {
        CentralTraffic it = new IndiaTraffic();
        it.flashYellow();
        it.redStop();
        it.greenGO();

        IndiaTraffic ind = new IndiaTraffic();
        ind.walkingSymbol();
    }
    @Override
    public void greenGO() {
        System.out.println("Please Go...");
    }

    @Override
    public void redStop() {
        System.out.println("Please STOP and wait for 30 secs");
    }

    @Override
    public void flashYellow() {
        System.out.println("Please stay alert");
    }

    public void walkingSymbol(){
        System.out.println("Please walk!");
    }

    @Override
    public void triangleSymbol() {
        System.out.println("Triangle Symbol");
    }
}
