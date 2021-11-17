package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theUsersList = new ArrayList<>();

    public Forum(){
        theUsersList.add(new ForumUser(001,"Adam Adamski",'M', LocalDate.of(2000,9,21),12));
        theUsersList.add(new ForumUser(002,"Beata Bak",'F',LocalDate.of(1992,1,1),92));
        theUsersList.add(new ForumUser(003,"Czeslaw Czeszek",'M',LocalDate.of(1972,12,12),0));
        theUsersList.add(new ForumUser(004,"Wojciech Taczka",'M',LocalDate.of(2005,3,29),26));

    }
    public List<ForumUser> getList(){
        return new ArrayList<>(theUsersList);
    }
}
