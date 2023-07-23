package homeWork.homeWork8;

import java.util.Objects;

public class Computer {
//    Создать класс Computer c конструктором принимающим параметры
//    Марка тип String, цена тип int, оперативная память тип int,
//    и видеокарта тип int.
//    Переопределить метод toString для вывода объекта класса в след. виде:
//
//            "Создан PC.
//    Имя = марка.
//            Цена = цена.
//            Видеокарта = объем видеокарты.
//    ОЗУ = Объем оперативной памяти."
//
//    Все поля класса Computer должны быть приватными.
//    Также создайте публичные методы для получения информации о полях класса Computer.
//
//    А также методы для изменения его полей.
//    Переопределите метод equals и метод hashCode для вашего класса.
//    Сделайте так, чтобы компьютеры считались одинаковыми в случае если у них
//    равны значения полей марка, оперативная память и видеокарта.
//    равны значения полей марка, оперативная память и видеокарта.
//    В отдельном классе создайте объект класса компьютер, и выведите в консоль
//    информацию о вашем объекте
    private String mark;
    private int price;
    private int memoryRAM;
    private int videoMemory;

    public Computer(String mark, int price, int memoryRAM, int videoMemory) {
        this.mark = mark;
        this.price = price;
        this.memoryRAM = memoryRAM;
        this.videoMemory = videoMemory;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMemoryRAM() {
        return memoryRAM;
    }

    public void setMemoryRAM(int memoryRAM) {
        this.memoryRAM = memoryRAM;
    }

    public int getVideoMemory() {
        return videoMemory;
    }

    public void setVideoMemory(int videoMemory) {
        this.videoMemory = videoMemory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return memoryRAM == computer.memoryRAM && videoMemory == computer.videoMemory && Objects.equals(mark, computer.mark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mark, price, memoryRAM, videoMemory);
    }
}
