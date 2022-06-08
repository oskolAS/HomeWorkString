public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static String full() {
        String firstName = "Ivan";
        String meddleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + meddleName;
        return fullName;
    }
    private static void task1() {
        String fullName = full();
        System.out.println("Ф.И.О. сотрудника - " + fullName);
    }

    private static void task2() {
        String fullName = full();
        fullName = fullName.toUpperCase();
        System.out.println("Ф.И.О. сотрудника - " + fullName);
    }

    private static void task3() {
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника - " + fullName);
    }

}