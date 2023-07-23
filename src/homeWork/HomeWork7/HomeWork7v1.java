package homeWork.HomeWork7;

public class HomeWork7v1 {
    public static void main(String[] args) {
//        Задание 1
//        Написать метод, принимающий в качестве параметра массив целых чисел. И выводит на экран все четные числа списком, a также нечетные числа списком.
        TaskOneMethod newMethod = new TaskOneMethod();
        newMethod.someMeth(new int[]{2, 4, 6, 8, 1, 3, 5, 7, 9, 11});
        System.out.println("================================================");
        newMethod.taskTwoMethod();
        newMethod.taskTwoMethod("это сообщение");
        newMethod.taskTwoMethod(new String[]{"массив стро1", "массив строк 2"});
        newMethod.taskTwoMethod(new int[]{1,2,3,4,5,6,7,8,9});
        newMethod.taskTwoMethod("Мое сообщение", 10);
        System.out.println("================================================");
        Conspect student = new Conspect();
        student.fio = "Андрей Андреич";
        student.specialization = "Сверхсварщик 9000";
        student.yearOfGraduation = 2010;
        student.colourOfWrapper = "Блестящее красный";
        student.nameOfSchool = "Школа сверх нового поколения дистанционного обучения";
        student.numberOfPages = 777;
        student.getStudentData();
    }
}
