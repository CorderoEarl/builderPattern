public class ECommerce {
    protected final String firstName;
    protected final String lastName;
    protected final String email;
    protected final String address;
    protected final String phone;
    protected final int age;

    private ECommerce(ECommerceBuilder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.address = builder.address;
        this.phone = builder.phone;
        this.age = builder.age;
    }

    protected static class ECommerceBuilder{
        private String firstName;
        private String lastName;
        private String email;
        private String address;
        private String phone;
        private int age;

        public ECommerceBuilder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public ECommerceBuilder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public ECommerceBuilder email(String email){
            this.email = email;
            return this;
        }

        public ECommerceBuilder address(String address){
            this.address = address;
            return this;
        }

        public ECommerceBuilder phone(String phone){
            this.phone = phone;
            return this;
        }

        public ECommerceBuilder age(int age){
            this.age = age;
            return this;
        }

        public ECommerce build() {
            if (firstName == null || lastName == null || email == null) {
                throw new IllegalStateException("Required fields (firstName, lastName, email) must be set.");
            }
            return new ECommerce(this);
        }
    }
}
