package com.mohammadehtesham.learnGitHub;

/**
 * Created by mohammadehtesham on 2016-05-08.
 */
public class StudentsGrades {
    String name;
    int mathMarks;
    int englishMarks;
    int compSciMarks;
    int total;

    public void findTotal() {
        total = mathMarks + englishMarks + compSciMarks;
    }

}
