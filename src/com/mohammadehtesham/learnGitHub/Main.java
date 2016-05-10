package com.mohammadehtesham.learnGitHub;

import System.io.BufferedReader;
import System.io.InputSystem

public class Main {

    public static void main(String[] args) {
	    StudentsGrades [] pISES = new StudentsGrades[4];
        pISES[0] = create("Mohammad Ehtesham", 94,91,92);
        pISES[1] = create("Farah Sethi", 93, 94, 90);
        pISES[2] = create("Ahmed Ehtesham", 93, 92, 95);
        pISES[3].name = DataInput("Please enter name here: ");
        pISES[3].compSciMarks = DataInput("Please enter Computer Science marks here: ");
        pISES[3].englishMarks = DataInput("Please enter English Marks here: ");
        pISES[3].mathMarks = DataInput("Please enter Mathematics Marks here: ");
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
    public static StudentGrades getUserInput(){
        StudentsGrades userInput = new StudentsGrades();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter the name of the student: ");
        userInput.name = reader.readLine();
        Scanner reader = new Scanner(System.in);
        System.out.print("Please enter the Computer Science marks: ");
    }

}
