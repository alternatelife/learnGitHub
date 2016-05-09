package com.mohammadehtesham.learnGitHub;

public class Main {

    public static void main(String[] args) {
	    StudentsGrades [] pISES = new StudentsGrades[3];
        pISES[0] = create("Mohammad Ehtesham", 94,91,92);
        pISES[1] = create("Farah Sethi", 93, 94, 90);
        pISES[2] = create("Ahmed Ehtesham", 93, 92, 95);
        String nameOfHighestScorer = "NA";
        int highestTotal = 0;

        for (StudentsGrades foo: pISES) {
            foo.findTotal();
            System.out.print("total for ");
            System.out.print(foo.name);
            System.out.print(": ");
            System.out.print(foo.total);
            System.out.println("");
            if (highestTotal >= foo.total){
                continue;
            }
            else {
                nameOfHighestScorer = foo.name;
                highestTotal = foo.total;
            }
        }
        System.out.println(nameOfHighestScorer);
        System.out.println(highestTotal);
    }

    public static StudentsGrades create(String name, int mathMarks, int englishMarks, int compSciMarks) {
        StudentsGrades newRecord = new StudentsGrades();
        newRecord.name = name;
        newRecord.mathMarks = mathMarks;
        newRecord.englishMarks = englishMarks;
        newRecord.compSciMarks = compSciMarks;
        return newRecord;

    }

}
