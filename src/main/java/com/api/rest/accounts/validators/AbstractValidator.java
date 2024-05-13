package com.api.rest.accounts.validators;

public abstract class AbstractValidator {

    protected static boolean isNotNull(Object object) {
        return object != null;
    }

    protected static boolean isLenghtSmallerThan(String string, int length) {
        return string.length() < length;
    }

    protected static boolean isLenghtGreaterThan(String string, int length) {
        return string.length() > length;
    }
}
