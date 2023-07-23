package homeWork.HomeWork7;

public class Conspect {
    //    Создать класс Конспект. Класс должен содержать следующие поля:
//
//    ФИО студента;
//    Название предмета;
//    Количество страниц;
//    Год выпуска;
//    Цвет обложки.
//    Название заведения, где учится студент;
    public String fio;
    public String specialization;
    public int numberOfPages;
    public int yearOfGraduation;
    public String colourOfWrapper;
    public String nameOfSchool;
    public void getStudentData(){
        System.out.println("ФИО - " + fio);
        System.out.println("Специальность - " + specialization);
        System.out.println("Количество страниц - " + numberOfPages);
        System.out.println("Год выпуска - " + yearOfGraduation);
        System.out.println("Цвет обложки - " + colourOfWrapper);
        System.out.println("Название учебного заведения - " + nameOfSchool);
    }

}
