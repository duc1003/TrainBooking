package constant;

public class Schema {
    public static final class Admin {
        public static final String ID = "id";
        public static final String USERNAME = "username";
        public static final String PASSWORD = "password";
        public static final String ACCESS_KEY = "access_key";
    }
    public static final class Customer {
        public static final String CARD_ID = "cardID";
        public static final String EMAIL = "email";
        public static final String PASSWORD = "password";
        public static final String PHONE = "phone";
        public static final String NAME = "name";
    }
    public static final class Train {
        public static final String TRAIN_ID = "trainID";
        public static final String TRAIN_NAME = "trainName";
        public static final String FROM_STATION = "fromStation";
        public static final String TO_STATION = "toStation";
        public static final String SEATS = "seats";
        public static final String PRICE = "price";
        public static final String DATE = "date";
    }
}
