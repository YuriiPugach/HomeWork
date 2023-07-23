package homeWork.homeWork8;

public class UseConverter {
    public static void main(String[] args) {
        Converter converter = new Converter("Konvertor");
        double doubleValue = 1111.2;
        int intFromDouble = converter.convertToInt(doubleValue);
        System.out.println("Converted to integer = " + intFromDouble);

        String byteValue = "100";
        int intFromString = converter.convertToInt(byteValue);
        System.out.println("Converted to integer = " + intFromString);

        double doubleValue2 = 1111.2;
        double doubleFromDouble = converter.convertToDouble(doubleValue);
        System.out.println("Converted to double = " + doubleFromDouble);

        String stringValue = "100";
        double doubleFromString = converter.convertToDouble(stringValue);
        System.out.println("Converted to double = " + doubleFromString);

        double doubleValue3 = 1111.2;
        String stringFromDouble = converter.convertToString(doubleValue3);
        System.out.println("Converted to string = " + stringFromDouble);

        String stringValue2 = "100";
        String stringFromString = converter.convertToString(stringValue2);
        System.out.println("Converted to string = " + stringFromString);

        System.out.println("Имя конвертера: " + converter.getName());
    }
}
