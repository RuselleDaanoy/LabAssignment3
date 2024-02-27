public class PaymentApp {
    public static void main(String[] args) {

        // Create an Order with Gcash payment mode
        Order gcash = new Order("keyboard", 10, 300.0, 3000.0, new Gcash());

        // Display order details
        System.out.println("\nOrder item is " + gcash.getItem() + ".");
        System.out.println("Unit price is " + gcash.getUnitPrice());
        System.out.println("Quantity is " + gcash.getQuantity());


        // Display payment details for Gcash
        System.out.println("\nPayment order details if " + gcash.getPaymentMode().getClass().getSimpleName());
        System.out.println("Discount rate is " + gcash.getPaymentMode().paymentMode());
        System.out.println("Payment amount is " + gcash.getTotalAmount());


        // Payment details for Maya in SETTING VALUES
        Order mayaOrder = new Order();
        mayaOrder.setItem("keyboard");
        mayaOrder.setQuantity(10);
        mayaOrder.setUnitPrice(300.0);
        mayaOrder.setTotalAmount(3000.0);
        mayaOrder.setPaymentMode(new Maya());

        System.out.println("\nPayment order details if " + mayaOrder.getPaymentMode().getClass().getSimpleName());
        System.out.println("Discount rate is " + mayaOrder.getPaymentMode().paymentMode());
        System.out.println("Payment amount is " + mayaOrder.getTotalAmount());


        // Payment details for ShopeePay
        Order shopeePay = new Order("keyboard", 10, 300.0, 3000.0, new ShopeePay());

        System.out.println("\nPayment order details if " + shopeePay.getPaymentMode().getClass().getSimpleName());
        System.out.println("Discount rate is " + shopeePay.getPaymentMode().paymentMode());
        System.out.println("Payment amount is " + shopeePay.getTotalAmount());

    }
}