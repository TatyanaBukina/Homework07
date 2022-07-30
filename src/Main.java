import javax.swing.*;

public class Main {

    public static void main(String[] args) {
    task1();
    task2();
    }

    private static void task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.print("ФИО сотрудника — " + fullName);
        System.out.println();
        String fullName1= fullName.toUpperCase();
        System.out.print("Данные ФИО сотрудника для заполнения отчета —  " + fullName1);
        }

    private static void task2(){
        System.out.println();
            String fullName2 = "Иванов Семён Семёнович ";
            String fullName3 = fullName2.replace('ё' , 'e');
        System.out.print("Данные ФИО сотрудника —" + fullName3);

    }

}
