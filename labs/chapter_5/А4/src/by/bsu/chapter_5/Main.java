package by.bsu.chapter_5;

import by.bsu.chapter_5.gradeBook.GradeBook;

/**
 * Created by dom on 24.04.2015.
 */
public class Main {
    static public void main(String[] args){
        GradeBook gb = new GradeBook(101, 2, "Dubovik Nastya");

        String[] sessionStart = {"29.12.2014", "10.06.2015"};
        String[] sessionEnd = {"15.01.2015", "29.07.2015"};
        gb.setSessions(sessionStart.length, sessionStart, sessionEnd);


        String[][] dateZachet = {{"30.12.2015", "04.01.2015"},{"01.06.2015", "05.06.2015"}};
        String[][] nameTeacherZachet = {{"Pupkin", "Ivanov"},{"Ivanov", "Krasnov"}};
        boolean[][] zachet = {{true, false},{true, true}};

        for(int i=0; i<gb.getSessions().length; i++){
            gb.getSessions()[i].setZachets(zachet.length, nameTeacherZachet[i], zachet[i], dateZachet[i]);
        }


        String[][] dateExam = {{"29.12.2014"} ,{"16.06.2015", "19.06.2015", "20.06.2015"}};
        String[][] nameTeacherExam = {{"Hacker"},{"Krasnov", "Rybin", "Malah"}};
        int[][] markExam = {{10},{7, 10, 8}};
        for(int i=0; i<gb.getSessions().length; i++){
            gb.getSessions()[i].setExams(markExam[i].length, nameTeacherExam[i], markExam[i], dateExam[i]);
        }

        System.out.println("Начало\n"+gb);

        GradeBook.Session.Exam obj = new GradeBook().new Session().new Exam("06.06.2015", 9, "Blinov");
        gb.getSessions()[1].addExam(obj);
        System.out.println("\nПосле изменения\n"+gb);
    }
}
