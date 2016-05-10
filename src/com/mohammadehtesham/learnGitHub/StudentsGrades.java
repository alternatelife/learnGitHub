package com.mohammadehtesham.learnGitHub;

/**
 * Created by mohammadehtesham on 2016-05-08.
 * Fixing this so it is not default file template
 */
class StudentsGrades {
    private String name;
    private int mathMarks;
    private int englishMarks;
    private int compSciMarks;
    int total;

    void findTotal() {
        total = mathMarks + englishMarks + compSciMarks;
    }

    String getName() {
        return this.name;
    }
    void setName(String name){
        this.name = name;
    }

    void setMathMarks(int mathMarks) {
        this.mathMarks = mathMarks;
    }

    void setEnglishMarks(int englishMarks) {
        this.englishMarks = englishMarks;
    }

    void setCompSciMarks(int compSciMarks) {
        this.compSciMarks = compSciMarks;
    }
}
