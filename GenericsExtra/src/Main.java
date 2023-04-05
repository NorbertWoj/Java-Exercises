import model.LPAStudent;
import model.Student;
import util.QueryList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int studentCount = 10;
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            students.add(new Student());
        }
        students.add(new LPAStudent());
//        printList(students);
        printMoreLists(students);

        List<LPAStudent> lpaStudents = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            lpaStudents.add(new LPAStudent());
        }
        printMoreLists(lpaStudents);

        testList(new ArrayList<String>(List.of("Able", "Barry", "Charlie")));
        testList(new ArrayList<Integer>(List.of(1, 2, 3)));

        var queryList = new QueryList<>(lpaStudents);
        var matches = queryList.getMatches(
                "Course", "Python");
        printMoreLists(matches);

        var students2021 = QueryList.getMatches(students, "YearStarted",
                "2021");
//        var students2021 = util.QueryList.<model.Student>getMatches(new ArrayList<>(),
//                "YearStarted", "2021");
        printMoreLists(students2021);

//        util.QueryList<model.Employee> employeeList = new util.QueryList<>();

    }

//    public static void printList(List<model.Student> students) {
//    public static <T extends model.Student> void printList(List<T> students) {
//
//        for (var student : students) {
////            System.out.println(student);
//            System.out.println(student.getYearStarted() + ": " + student);
//        }
//        System.out.println();
//    }

    public static void printMoreLists(List<? extends Student> students) {

        for (var student : students) {
//            System.out.println(student);
            System.out.println(student.getYearStarted() + ": " + student);
        }
        System.out.println();
    }

    public static void testList(List<?> list) {

        for (var element : list) {
            if (element instanceof String s) {
                System.out.println("String: " + s.toUpperCase());
            } else if (element instanceof Integer i) {
                System.out.println("Integer: " + i.floatValue());
            }
        }
    }

//    public static void testList(List<String> list) {
//
//        for (var element : list) {
//            System.out.println("String: " + element.toUpperCase());
//        }
//    }
//    public static void testList(List<Integer> list) {
//
//        for (var element : list) {
//            System.out.println("Integer: " + element.floatValue());
//        }
//    }

}