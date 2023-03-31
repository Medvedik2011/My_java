package Homework_19;
public  class Task_1 { /*Создать класс Computer c конструктором принимающим параметры
   Марка тип String, цена тип int, оперативная память тип int,
   и видеокарта тип int.
   Конструктор также выводит на консоль сообщение типа:
   "Создан PC.
    Имя = марка.
    Цена = цена.
    Видеокарта = объем видеокарты
    ОЗУ = Объем оперативной памяти."
    Все поля класса Computer должны быть приватными.
   Также создайте публичные методы для получения информации о полях класса Computer.
   А также методы для изменения его полей.
   Создайте один метод для получения всей информации о объекте класса Computer.
   В отдельном классе создайте объект класса компьютер, и выведите на экран его поля при использовании
   одного созданного выше метода класса.*/
    public static class Computer {
        private String name;
        private int price;
        private int ram;
        private int video;

        public Computer(String name, int price, int ram, int video) {
            this.name = name;
            this.price = price;
            this.ram = ram;
            this.video = video;
            System.out.println("Создан PC.\nКомп марка = "+this.name+
                    "\nЦена = "+this.price + " грн"+
                    "\nВидеокарта = "+this.video+" Gb"+
                    "\nОЗУ = "+this.ram+" Gb");
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getRam() {
            return ram;
        }

        public void setRam(int ram) {
            this.ram = ram;
        }

        public int getVideo() {
            return video;
        }

        public void setVideo(int video) {
            this.video = video;
        }

        public void printInfo() {
            System.out.println("Вся инфо о объекте класса Computer"+"\nКомп марка: " + name +
                    "\nЦена: " + price + " грн" +
                    "\nОЗУ : " + ram + " Gb" +
                    "\nРазмер видеокарты: " + video + " Gb");
        }
    }

    public static void main(String[] args) {
        Computer pc = new Computer("HP", 18500, 8, 2);
        System.out.println();
        pc.printInfo();
    }
}
