public class NamePrintClass implements Runnable {

    private String name;
    private int count = 1;

    public NamePrintClass(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i<10; i++){
            System.out.print("Значение переменной : "+name);
            System.out.println(", Вывод № "+count);
            count++;
        }
    }
}
