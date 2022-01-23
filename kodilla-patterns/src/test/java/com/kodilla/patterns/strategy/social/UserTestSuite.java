package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies(){
        //Given
        User thomas = new Millenials("Thomas Clark");
        User john = new YGeneration("John Smith");
        User ann = new ZGeneration("Ann Stevens");
        //When
        String thomasSocial = thomas.sharePost();
        System.out.println("Thomas is using: "+thomasSocial);
        String johnSocial = john.sharePost();
        System.out.println("John is using: "+johnSocial);
        String annSocial = ann.sharePost();
        System.out.println("Ann is using: "+annSocial);
        //Then
        assertEquals("Snapchat", thomasSocial);
        assertEquals("Facebook", johnSocial);
        assertEquals("Twitter", annSocial);
    }

    @Test
    void testIndividualSharingStrategy(){
        //Given
        User andrew = new ZGeneration("Andrew Joe");
        //When
        String andrewSocial = andrew.sharePost();
        System.out.println("Andrew is using: "+andrewSocial);
        andrew.setIndividualSocial(new FacebookPublisher());
        andrewSocial = andrew.sharePost();
        System.out.println("Now Andrew is using: "+andrewSocial);
        //Then
        assertEquals("Facebook", andrewSocial);

    }
}
