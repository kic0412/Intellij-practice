package com.store.member;

public class UserInit {
    private static User mUser;

    public static User getmUser() {
        return mUser;
    }

    public static void setmUser(User mUser) {
        UserInit.mUser = mUser;
    }
    public static void init(String name, int phone) {
        mUser = new User(name, phone);
    }
}
