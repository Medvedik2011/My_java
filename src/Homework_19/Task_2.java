package Homework_19;

/*Создать класс Tree с перегруженными конструкторами.
   В классе есть Tree есть поля:
   String type; int height, int countOfSticks, String colour;
   Конструктор1 принимающий в параметры String type; int height
   и присваивающий значение полям countOfSticks значение 13,
   colour "Зеленый".
   Конструктор2 принимающий в параметры int height, int countOfSticks,
   String colour и присваивающий значение полю type "пихта".
   Констуктор по умолчанию 3, который присваивает height = 350, countOfSticks = 29,
   colour = "Желтый".
   Конструктор4 который принимает в параметры String type,
   и вызывает внутри себя конструктор 3.
   Создать в отдельном классе main 4 объекта класса Tree используя 4 созданных конструктора.*/

public class Task_2 {

    public static class Tree {
        String type;
        int height;
        int countOfSticks;
        String colour;

        public Tree(String type, int height) {
            this.type=type;
            this.height=height;
            this.countOfSticks=13;
            this.colour="Зеленый";
        }

        public Tree(int height, int countOfSticks, String colour) {
            this.type="Пихта";
            this.height=height;
            this.countOfSticks=countOfSticks;
            this.colour=colour;
        }

        public Tree() {
            this.height=350;
            this.countOfSticks=29;
            this.colour="Желтый";
        }

        public Tree(String type) {
            this();
            this.type=type;
        }
    }

    public static void main(String[] args) {
        Tree tree1=new Tree("Дуб", 200);
        Tree tree2=new Tree(1350, 120, "Голубой");
        Tree tree3=new Tree();
        Tree tree4=new Tree("Тополь");

        System.out.println("Tree 1: type="+tree1.type+", height ="+tree1.height+", countOfSticks ="+tree1.countOfSticks+", colour ="+tree1.colour);
        System.out.println("Tree 2: type="+tree2.type+", height ="+tree2.height+", countOfSticks ="+tree2.countOfSticks+", colour ="+tree2.colour);
        System.out.println("Tree 3: type="+tree3.type+", height ="+tree3.height+", countOfSticks ="+tree3.countOfSticks+", colour ="+tree3.colour);
        System.out.println("Tree 4: type="+tree4.type+", height ="+tree4.height+", countOfSticks ="+tree4.countOfSticks+", colour ="+tree4.colour);
    }
}
