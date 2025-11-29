package chapter03;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("1","A",12,20);
        Invoice invoice2 = new Invoice("2","B",-5,10);

        System.out.println(invoice1.getInvoiceAmount());
        System.out.println(invoice2.getInvoiceAmount());

        invoice2.setQuantity(6);
        System.out.println(invoice2.getInvoiceAmount());
    }
}
