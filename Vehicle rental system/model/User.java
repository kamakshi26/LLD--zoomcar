package model;

public class User {

        int userId;
        String username;
        long contactnumber;
        Location location;
        Account account;
        public User(int userId, String username, long contactnumber, Location location, Account account) {
            this.userId = userId;
            this.username = username;
            this.contactnumber = contactnumber;
            this.location = location;
            this.account = account;
        }
        @Override
        public String toString() {
            return "User [userId=" + userId + ", username=" + username + ", contactnumber=" + contactnumber
                    + ", location=" + location + ", account=" + account + "]";
        }

        
     
}
