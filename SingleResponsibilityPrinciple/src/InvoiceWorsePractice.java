public class InvoiceWorsePractice {
    // WORSE PRACTICE
    private Book book;
    private int quantity;
    private double discountRate;
    private double taxRate;
    private double total;


    public InvoiceWorsePractice(Book book, int quantity, double discountRate, double taxRate, double total) {
        this.book = book;
        this.quantity = quantity;
        this.discountRate = discountRate;
        this.taxRate = taxRate;
        this.total = total;
    }

    public double calculateTotal(){
        double price = ((book.price - book.price*discountRate)*this.quantity);
        double priceWithTaxes = price * (1 + taxRate);
        return priceWithTaxes;
    }
    public void printInvoice(){
        System.out.println(quantity+" x "+book.name+" "+book.price+" $ ");
        System.out.println("Discount Rate :" + discountRate);
        System.out.println("Tax Rate :" + taxRate);
        System.out.println("Total :"+ total);
    }
    public void saveToFile(String fileName){
        //Creates a file with given name and writes the invoice
    }
}
