public abstract class Statement {

    public String value(Customer aCustomer) {
        StringBuilder result = new StringBuilder();

        result.append(headerString(aCustomer));

        for (Rental each : aCustomer.getRentals()) {
            result.append(eachRentalString(each));
        }

        result.append(footerString(aCustomer));

        return result.toString();
    }

    protected abstract String headerString(Customer aCustomer);

    protected abstract String eachRentalString(Rental aRental);

    protected abstract String footerString(Customer aCustomer);
}
