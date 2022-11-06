class Ai95Calculator {
    double price = 46.35;

    public double calculate(double volume, double discount) {
        double fullPrice = price * (1 - discount);
//        System.out.println("fullPrice = " + fullPrice);
        return volume * fullPrice;
    }
}
