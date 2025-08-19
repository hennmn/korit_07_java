public class OrderMain {
    public static void main(String[] args) {
        Order order = new Order.Builder().orderId(100)
                .productName("Samsung GalaxyBook2 Pro").
                consumerName("홍길동").
                price(1450000).
                stock(2)
                .build();
//        System.out.println(order);
        order.showOrderInfo();
    }
}
