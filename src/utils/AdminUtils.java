package utils;

import model.Admin;

public class AdminUtils {
    private static Admin currentAdmin = null;

    public static Admin getCurrentAdmin() {
        return currentAdmin;
    }
    public static void setCurrentAdmin(Admin currentAdmin){
        AdminUtils.currentAdmin = currentAdmin;
    }
}
