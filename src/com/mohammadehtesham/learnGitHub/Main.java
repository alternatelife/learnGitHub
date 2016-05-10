package com.mohammadehtesham.learnGitHub;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Initially create the create and getUserInput functions with direct field access.. Later evolved code to use
        //private fields and set and get FieldNames for safe programming
        StudentsGrades[] pISES = new StudentsGrades[4];
        pISES[0] = create("Mohammad Ehtesham", 94, 91, 92);
        pISES[1] = create("Farah Sethi", 93, 94, 90);
        pISES[2] = create("Ahmed Ehtesham", 93, 92, 95);
        pISES[3] = getUserInput();
        String nameOfHighestScorer = null;
        int highestTotal = 0;

        for (StudentsGrades foo : pISES) {
            foo.findTotal();
            System.out.print("total for ");
            System.out.print(foo.getName());
            System.out.print(": ");
            System.out.print(foo.total);
            System.out.println("");
            if (highestTotal <= foo.total) {
                nameOfHighestScorer = foo.getName();
                highestTotal = foo.total;
            }
        }
        System.out.print("Name of highest scorer in the current batch: ");
        System.out.println(nameOfHighestScorer);
        System.out.print("Total score: ");
        System.out.println(highestTotal);
    }

    //Using a method to get information entered manually in to the code
    private static StudentsGrades create(String name, int mathMarks, int englishMarks, int compSciMarks) {
        StudentsGrades newRecord = new StudentsGrades();
        newRecord.setName(name);
        newRecord.setMathMarks(mathMarks);
        newRecord.setEnglishMarks(englishMarks);
        newRecord.setCompSciMarks(compSciMarks);
        return newRecord;

    }
    //Learning how to get user information from System.in
    private static StudentsGrades getUserInput() {
        StudentsGrades userInput = new StudentsGrades();
        // Using a very crude method, i.e. Scanner to automatically parse data and enter marks
        System.out.print("Please enter the name of the student, Mathematics, English and Comp Sci marks: ");
        Scanner studentInfo = new Scanner(System.in);
        userInput.setName(studentInfo.next());
        //Error handling using try catch finally
        try {
            userInput.setMathMarks(studentInfo.nextInt());
        }
        catch (java.util.InputMismatchException String){
            userInput.setName(userInput.getName().concat(" "));
            userInput.setName(userInput.getName().concat(studentInfo.next()));
            userInput.setMathMarks(studentInfo.nextInt());
        }
        finally {
            userInput.setEnglishMarks(studentInfo.nextInt());
            userInput.setCompSciMarks(studentInfo.nextInt());
        }
        //Improve this error handling to confirm the format
        //OR only take String for userInput.name followed by numbers for marks

        return userInput;
    }

}
