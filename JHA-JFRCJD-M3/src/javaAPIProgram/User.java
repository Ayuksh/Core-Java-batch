package javaAPIProgram;

public class User {
    private int userId ;
    private String userName ;
    private String email;

//    public User(int userId, String userName, String email) {
//        this.userId = userId;
//        this.userName = userName;
//        this.email = email;
//    }

//    @Override
//    public String toString() {
//        return "User[" +
//                "userId=" + userId +
//                ", userName='" + userName + '\'' +
//                ", email='" + email + '\'' +
//                ']';
//    }


//    public void printThis()
//    {
//        System.out.println(this.hashCode());
//    }

    @Override
    public boolean equals(Object obj) {
        if (  obj.hashCode() == this.hashCode() )
            return true;
        return false ;
    }
}
