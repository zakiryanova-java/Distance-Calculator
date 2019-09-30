public class Distance {
    public static void main(String[] args) {
        double fuelForHundredKm = 4.7;
        double consumption = 27;
        int distance = (int) (consumption / fuelForHundredKm * 100);

        System.out.println(distance);
    }
}
