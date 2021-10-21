package practice.task2;

/*
 * Создайте свой класс исключения для проверки выгула животного.
 * Программа должна содержать несколько методов, проверяющий экипировку животного (например: ошейник, поводок и тд.)
 * и результирующий метод «выгул». Если одно из требований хотя бы не выполнено,
 * то выбросить свое исключение или же отработать нормально
 * */

class DogException extends Exception {
    public DogException() {
        super("Собака не готова к прогулке!");
    }
}

class Dog {
    private boolean collar; // ошейник
    private boolean leash; // поводок
    private boolean muzzle; // намордник

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
            throw new DogException();
        } else {
            System.out.println("Walking...");
        }
    }


    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.wearCollar();
        dog.wearLeash();
//        dog.wearMuzzle();
        try {
            dog.walk();
        } catch (DogException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
