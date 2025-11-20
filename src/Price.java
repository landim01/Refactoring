public abstract class Price {

    public abstract int getPriceCode();

    public double getCharge(int daysRented) {
        // Já foi movido no passo anterior (Passo 5)
        return 0; // será sobrescrito nas subclasses
    }

    // *** PASSO 6: lógica movida de Movie para Price ***
    public int getFrequentRenterPoints(int daysRented) {
        if (getPriceCode() == Movie.NEW_RELEASE && daysRented > 1) {
            return 2;
        }
        return 1;
    }
}
