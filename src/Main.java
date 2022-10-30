public class Main {
    public static void main(String[] args) {

//        First level: 1. Создать класс, в котором должен быть метод выводящий
//        в цикле содержимое переменной name + счетчик (от 0 до 10). Создать несколько
//    экземпляров (3-4), с разными значениями name
//        Запустить все в разных нитях. Посмотреть что получилось
        String nameOne = "One";
        String nameTwo = "Two";
        String nameThree = "Three";
        String nameFour = "Four";


        Thread threadOne = new Thread(new NamePrintClass(nameOne));
        Thread threadTwo = new Thread(new NamePrintClass(nameTwo));
        Thread threadThree = new Thread(new NamePrintClass(nameThree));
        Thread threadFour = new Thread(new NamePrintClass(nameFour));

        threadOne.start();
        threadTwo.start();
        threadThree.start();
        threadFour.start();


    }
}