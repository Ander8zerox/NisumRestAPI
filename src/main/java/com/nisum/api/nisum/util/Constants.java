package com.nisum.api.nisum.util;

public class Constants {

    public static final String EMAIL_REGEX = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}";
    public static final String PASSWORD_REGEX = ".*[0-9].*";
    public static  final String SUCCESS = "Success";

    public final static String REQUEST_COMPLETE_FILE_PATH = "src/test/resources/request/completeRequest.json";

    public final static String REQUEST_INVALID_PASSWORD_FILE_PATH = "src/test/resources/request/missingNumberPasswordRequest.json";

    public final static String REQUEST_INVALID_MAIL_FILE_PATH = "src/test/resources/request/incorrectEmailFormatRequest.json";
}
