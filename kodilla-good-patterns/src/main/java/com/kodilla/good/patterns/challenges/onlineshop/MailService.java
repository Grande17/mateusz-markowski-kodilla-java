package com.kodilla.good.patterns.challenges.onlineshop;

public class MailService implements InformationService{

    @Override
    public void inform(User user) {
        System.out.println("Thank you "+user.getUserName()+" for creating a new order!");
    }
}
