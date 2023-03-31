package Homework_19;
/*Необходимо создать класс конвертер, который будет иметь методы конвертации примитивных типов данных:
   метод convertToInt; (конвертирует byte, short, int, long, char, float, double, String). При вводе boolean выводит сообщение, что введен тип boolean.
   convertToDouble;    (конвертирует byte, short, int, long, char, float, double, String). При вводе boolean выводит сообщение, что введен тип boolean.
   converToString;     (конвертирует byte, short, int, long, char, boolean, float, double, String).
   У данного класса должен быть только один конструктор, в параметрах которого можно указать его имя.
   А также только один метод геттер для получения информации о названии данного конвертра.


   Все что пришло в голову(( */


public class Task_3 {
    public class Converter {
        private String name;
        public Converter(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
        public int convertToInt(byte b) {
            return (int) b;
        }
        public int convertToInt(short s) {
            return (int) s;
        }
        public int convertToInt(int i) {
            return i;
        }
        public int convertToInt(long l) {
            return (int) l;
        }
        public int convertToInt(char c) {
            return (int) c;
        }
        public int convertToInt(float f) {
            return (int) f;
        }
        public int convertToInt(double d) {
            return (int) d;
        }

    }
}
