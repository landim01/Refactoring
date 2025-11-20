public class HtmlStatement extends Statement {

    @Override
    protected String headerString(Customer aCustomer) {
        return "<h1>Rentals for <em>" + aCustomer.getName() + "</em></h1><p>\n";
    }

    @Override
    protected String eachRentalString(Rental aRental) {
        return aRental.getMovie().getTitle() + ": " +
                aRental.getCharge() + "<br>\n";
    }

    @Override
    protected String footerString(Customer aCustomer) {
        return "<p>You owe <em>" + aCustomer.getTotalCharge() +
                "</em><p>You earned <em>" +
                aCustomer.getTotalFrequentRenterPoints() +
                "</em> frequent renter points<p>";
    }
}
