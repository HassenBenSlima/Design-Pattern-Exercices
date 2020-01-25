package com.builder.user_account;


class Test {
    public static void main(String[] args) {
        UserBuilder userBuilder = UserAccount.getBuilder();
        UserAccount userAccount = userBuilder.setAccessCode("ABC")
                .setAddress("Route de MAHDIA")
                .build();
        System.out.println(userAccount);
    }
}

public class UserAccount {
    String firstName;
    String lastName;
    String titre;
    String address;
    String accessCode;
    String emailAddress;
    String phoneNumber;
    boolean weekendDelivery;

    static UserBuilder getBuilder() {
        return new UserBuilderImp();
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", titre='" + titre + '\'' +
                ", address='" + address + '\'' +
                ", accessCode='" + accessCode + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", weekendDelivery=" + weekendDelivery +
                '}';
    }
}

class UserBuilderImp implements UserBuilder {
    UserAccount userAccount;

    public UserBuilderImp() {
        this.userAccount = new UserAccount();
    }

    @Override
    public UserAccount build() {
        return userAccount;
    }

    @Override
    public UserBuilder setFirstName(String firstName) {
        userAccount.firstName = firstName;
        return this;
    }

    @Override
    public UserBuilder setLastName(String lastName) {
        userAccount.lastName = lastName;
        return this;
    }

    @Override
    public UserBuilder setTitre(String titre) {
        userAccount.titre = titre;
        return this;
    }

    @Override
    public UserBuilder setAddress(String address) {
        userAccount.address = address;
        return this;
    }

    @Override
    public UserBuilder setAccessCode(String accessCode) {
        userAccount.accessCode = accessCode;
        return this;
    }

    @Override
    public UserBuilder setEmailAddress(String emailAddress) {
        userAccount.emailAddress = emailAddress;
        return this;
    }

    @Override
    public UserBuilder setPhoneNumber(String phoneNumber) {
        userAccount.phoneNumber = phoneNumber;
        return this;
    }

    @Override
    public UserBuilder setWeekendDelivery(boolean weekendDelivery) {
        userAccount.weekendDelivery = weekendDelivery;
        return this;
    }
}

interface UserBuilder {

    UserAccount build();

    UserBuilder setFirstName(String firstName);

    UserBuilder setLastName(String lastName);

    UserBuilder setTitre(String titre);

    UserBuilder setAddress(String address);

    UserBuilder setAccessCode(String accessCode);

    UserBuilder setEmailAddress(String emailAddress);

    UserBuilder setPhoneNumber(String phoneNumber);

    UserBuilder setWeekendDelivery(boolean weekendDelivery);
}