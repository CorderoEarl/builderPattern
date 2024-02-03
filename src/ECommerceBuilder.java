public class ECommerceBuilder {
    public static void main(String[] args) {
        ECommerce eCommerce = new ECommerce.ECommerceBuilder()
                .firstName("Earl")
                .lastName("Cordero")
                .email("earl.cordero@gmail.com")
                .address("11-21 Mayor St")
                .phone("0995881993")
                .age(20)
                .build();


        System.out.println(eCommerce.firstName);
        System.out.println(eCommerce.lastName);
        System.out.println(eCommerce.email);
        System.out.println(eCommerce.address);
        System.out.println(eCommerce.phone);
        System.out.println(eCommerce.age);
    }
}