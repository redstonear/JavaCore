package model;

import java.util.Date;
import java.util.Objects;

public class Order {
    private String id;
    private User user;
    private Product product;
    private Date date;
    private int qty;
    private double price;
    private String orderStatus;
    private PaymentMethod paymentMethod;

    public Order(String id, User user, Product product, Date date, int qty, double price, String orderStatus, PaymentMethod payementMethod) {
        this.id = id;
        this.user = user;
        this.product = product;
        this.date = date;
        this.qty = qty;
        this.price = price;
        this.orderStatus = orderStatus;
        this.paymentMethod = payementMethod;
    }

    public Order() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return qty == order.qty && Double.compare(price, order.price) == 0 && Objects.equals(id, order.id) && Objects.equals(user, order.user) && Objects.equals(product, order.product) && Objects.equals(date, order.date) && Objects.equals(orderStatus, order.orderStatus) && paymentMethod == order.paymentMethod;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, product, date, qty, price, orderStatus, paymentMethod);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", user=" + user +
                ", product=" + product +
                ", date=" + date +
                ", qty=" + qty +
                ", price=" + price +
                ", orderStatus='" + orderStatus + '\'' +
                ", paymentMethod=" + paymentMethod +
                '}';
    }
}

