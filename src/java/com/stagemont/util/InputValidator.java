package com.stagemont.util;

/**
 *
 * @author Nicolas Brunet
 */
public class InputValidator {

    public static boolean isValidName(String fname) {
        return fname != null && 0 < fname.length() && 255 > fname.length() && fname.matches("[A-Za-zÀ-ú|-]+");
    }

    public static boolean isValidDA(String da) {
        return da != null && 0 < da.length() && da.length() < 12 && da.matches("[0-9]+");
    }

    public static boolean isValidPassword(String pw) {
        return pw != null && 0 < pw.length() && 255 > pw.length();
    }

    public static boolean isValidPhone(String phone) {
        return phone != null && 0 < phone.length() && phone.length() < 25 && phone.matches("[0-9-()]+");
    }

    public static boolean isValidEmail(String email) {
        return email != null && 0 < email.length() && 255 > email.length() && email.matches(".+\\@.+\\..+");
    }
}
