package practice.task2;

/*
* Создайте свой класс исключения для проверки выгула животного.
* Программа должна содержать несколько методов, проверяющий экипировку животного (например: ошейник, поводок и тд.)
* и результирующий метод «выгул». Если одно из требований хотя бы не выполнено,
* то выбросить свое исключение или же отработать нормально
* */

public class CheckDogEquipment extends Exception {

    private boolean collar; // ошейник
    private boolean leash; // поводок
    private boolean muzzle; // намордник

    public CheckDogEquipment() {
        super("Собака не готова к прогулке!");
    }

    public void wearCollar() {
        this.collar = true;
    }

    public void wearLeash() {
        this.leash = true;
    }

    public void wearMuzzle() {
        this.muzzle = true;
    }

    public void walk() throws Exception {
        if (!collar || !leash || !muzzle) {
            throw new CheckDogEquipment();
        } else {
            System.out.println("Walking...");
        }
    }

    public static void main(String[] args) {
        CheckDogEquipment dog = new CheckDogEquipment();
        dog.wearCollar();
        dog.wearLeash();
//        dog.wearMuzzle();
        try {
            dog.walk();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}