package HW_18;

/*Создать класс Конспект. Класс должен содержать следующие поля:
    название предмета;
    ФИО студента;
    количество страниц;
    год выпуска;
    цвет обложки.
    Название заведения, где учится студент;

Создайте публичные методы для получения доступа к полям класса,
а также методы для присваивания значений полям класса.*/
    public class Task_5 {
        public static class Conspect {
            private String subjName;
            private String stName;
            private int numOfPages;
            private int year;
            private String color;
            private String vuzName;

            public Conspect(String subjName, String stName, int numOfPages, int year,
                            String color, String vuzName) {
                this.subjName = subjName;
                this.stName = stName;
                this.numOfPages = numOfPages;
                this.year = year;
                this.color = color;
                this.vuzName = vuzName;
            }

            public void setSubjName(String subjName) {
                this.subjName = subjName;
            }

            public void setStName(String stName) {
                this.stName = stName;
            }

            public void setNumOfPages(int numOfPages) {
                this.numOfPages = numOfPages;
            }

            public void setYear(int year) {
                this.year = year;
            }

            public void setColor(String color) {
                this.color = color;
            }

            public void setVuzName(String vuzName) {
                this.vuzName = vuzName;
            }

            public String getSubjName() {
                return subjName;
            }

            public String getStName() {
                return stName;
            }

            public int getNumOfPages() {
                return numOfPages;
            }

            public int getYear() {
                return year;
            }

            public String getColor() {
                return color;
            }

            public String getVuzName() {
                return vuzName;
            }
        }

        public static void main(String[] args) {
            Conspect myConspect = new Conspect("Java не заходит. Совсем. Не быть мне КуА",
                    "Михаил Шматков", 1000, 2023, "Зеленый", "Политех 2003");
            System.out.println("Название предмета " + myConspect.getSubjName());
            System.out.println("ФИО " + myConspect.getStName());
            System.out.println("ВУЗ " + myConspect.getVuzName());
            System.out.println("Количество страниц " + myConspect.getNumOfPages());
            System.out.println("Год выпуска " + myConspect.getYear());
            System.out.println("Цвет обложки " + myConspect.getColor());
        }
    }

    
