package homeWork.homeWork8;

public class Converter {
    private String name;

    public String ConvertToInt(boolean boolean1) {
        return "Введен тип булеан";
    }

    public int convertToInt(byte byte1) {
        return byte1;
    }

    public int convertToInt(short short1) {
        return short1;
    }

    public int convertToInt(int int1) {
        return int1;
    }

    public int convertToInt(long long1) {
        return (int) long1;
    }

    public int convertToInt(char char1) {
        return char1;
    }

    public int convertToInt(float float1) {
        return (int) float1;
    }

    public int convertToInt(double double1) {
        return (int) double1;
    }

    public int convertToInt(String string1) {
        return Integer.parseInt(string1);

    }

    public String convertToDouble(boolean boolean1) {
        return "Введен тип булеан";
    }

    public double convertToDouble(byte byte1) {
        return byte1;
    }

    public double convertToDouble(short short1) {
        return short1;
    }

    public double convertToDouble(int int1) {
        return int1;
    }

    public double convertToDouble(long long1) {
        return (double) long1;
    }

    public double convertToDouble(char char1) {
        return char1;
    }

    public double convertToDouble(float float1) {
        return  float1;
    }

    public double convertToDouble(double double1) {
        return double1;
    }

    public double convertToDouble(String string1) {
        return Integer.parseInt(string1);

    }
//
    public String convertToString(boolean boolean1) {
    return "Введен тип булеан";
}

    public String convertToString(byte byte1) {
        return String.valueOf(byte1);
    }

    public String convertToString(short short1) {
        return String.valueOf(short1);
    }

    public String convertToString(int int1) {
        return String.valueOf(int1);
    }

    public String convertToString(long long1) {
        return String.valueOf((double) long1);
    }

    public String convertToString(char char1) {
        return String.valueOf(char1);
    }

    public String convertToString(float float1) {
        return String.valueOf(float1);
    }

    public String convertToString(double double1) {
        return String.valueOf(double1);
    }

    public String convertToString(String string1) {
        return string1;

    }

    public Converter(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
