package com.kodilla.testing.forum.statistics;

import java.util.List;

public class CalculateAdvStatistics {
    private int usersQuantity;
    private int postsQuantity;
    private int commentsQuantity;
    private double avgPostPerUser;
    private double avgCommentPerUser;
    private double avgCommentPerPost;

    public CalculateAdvStatistics(Statistics statistics) {
        List<String> names = statistics.usersNames();
        usersQuantity = names.size();
        postsQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();

        if(usersQuantity !=0) {
            avgPostPerUser = postsQuantity / usersQuantity;
            avgCommentPerUser = commentsQuantity / usersQuantity;
        }
        if(postsQuantity !=0) {
            avgCommentPerPost = commentsQuantity / postsQuantity;
        }
    }

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getAvgPostPerUser() {
        return avgPostPerUser;
    }

    public double getAvgCommentPerUser() {
        return avgCommentPerUser;
    }

    public double getAvgCommentPerPost() {
        return avgCommentPerPost;
    }
}
