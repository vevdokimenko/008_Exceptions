package practice.task2;

/*
* Создайте свой класс исключения для проверки выгула животного.
* Программа должна содержать несколько методов, проверяющий экипировку животного (например: ошейник, поводок и тд.)
* и результирующий метод «выгул». Если одно из требований хотя бы не выполнено,
* то выбросить свое исключение или же отработать нормально
* */

public class CheckDogEquipment extends Exception {

    boolean collar; // ошейник
    boolean leash; // поводок
    boolean muzzle; // намордник

    public CheckDogEquipment() throws Exception {
        throw new Exception("Ничего не надето");
    }

    public CheckDogEquipment(boolean collar) throws Exception {
        this.collar = collar;
        throw new Exception("Нет поводка и намордника");
    }

    public CheckDogEquipment(boolean collar, boolean leash) throws Exception {
        this.collar = collar;
        this.leash = leash;
        throw new Exception("Нет намордника");
    }

    public CheckDogEquipment(boolean collar, boolean leash, boolean muzzle) {
        this.collar = collar;
        this.leash = leash;
        this.muzzle = muzzle;
        walk();
    }

    public void walk() {
        System.out.println("Walking...");
    }

    public static void main(String[] args) {
        try {
//            new CheckDogEquipment();
//            new CheckDogEquipment(true);
//            new CheckDogEquipment(true, true);
            new CheckDogEquipment(true, true, true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}