package com.api.rest.accounts.validators;

import com.api.rest.accounts.models.CreateOrUpdateUserRequest;

public class CreateUserValidator extends AbstractValidator {

    public static boolean isValid(CreateOrUpdateUserRequest request) {
        return isNotMissingMandatoryFields(request)
                && nameIsValid(request.getName())
                && usernameIsValid(request.getUsername());

    }

    private static boolean isNotMissingMandatoryFields(CreateOrUpdateUserRequest request) {
        return isNotNull(request)
                && isNotNull(request.getName())
                && isNotNull(request.getUsername())
                && isNotNull(request.getPassword());
    }

    private static boolean nameIsValid(String name) {
        return isLenghtSmallerThan(name, 0) && isLenghtGreaterThan(name, 256);
    }

    private static boolean usernameIsValid(String username) {
        return isLenghtSmallerThan(username, 0) && isLenghtGreaterThan(username, 26);
    }

}
