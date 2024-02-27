public class Order {

    private String item;
    private Integer quantity;
    private Double unitPrice;
    private Double totalAmount;
    private PaymentMode paymentMode;

    public Order(String item, Integer quantity, Double unitPrice, Double totalAmount, PaymentMode paymentMode) {
        this.item = item;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalAmount = totalAmount;
        this.paymentMode = paymentMode;
    }

    public Order() {

    }

    public double getTotalAmount() {
        double discountRate = paymentMode.paymentMode();
        return totalAmount - (totalAmount * discountRate);
    }

    // Getters and setters for all properties
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }


    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }
}