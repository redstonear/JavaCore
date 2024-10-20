package homeWorks.storage;

import enums.UserType;
import model.Order;
import model.Product;
import model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataStorage {
    private Map<String, User> userMap = new HashMap<String, User>();
    private List<Product> productList = new ArrayList<Product>();
    private List<Order> orders = new ArrayList<>();

    public void addUser(User user) {
        userMap.put(user.getEmail(), user);
    }
    public User getUserByEmail(String email) {
        return userMap.get(email);
    }
    public void addProduct(Product product) {
        productList.add(product);
    }
    public void addOrder(Order order) {
        orders.add(order);
    }
    public Product getProductListById(String id) {
        for (Product product : productList) {
            if(product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    public Order getOrderListById(String id) {
        for (Order order : orders) {
            if (order.getId().equals(id)) {
                return order;
            }
        }
        return null;
    }

        public List<Order> getOrdersByUser(User user){
        List<Order> result = new ArrayList<>();
            for (Order order : orders) {
        if(order.getUser().getEmail().equals(user.getEmail())) {
            result.add(order);
             }
           }
            return result;
        }

        public void printProductList() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public void printOrderList() {
        for (Order order : orders) {
            System.out.println(order);
        }
    }
    public void changeOrderStatus(Order order) {

    }
}
