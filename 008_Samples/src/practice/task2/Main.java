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

    public void wearCollar(boolean collar) {
        this.collar = collar;
    }

    public void wearLeash(boolean leash) {
        this.leash = leash;
    }

    public void wearMuzzle(boolean muzzle) {
        this.muzzle = muzzle;
    }

    public void walk() throws DogException {
        if (!collar || !leash || !muzzle) {
            throw new DogException();
        } else {
            System.out.println("Walking...");
        }
    }


    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.wearCollar(true);
        dog.wearLeash(true);
        dog.wearMuzzle(false);
        try {
            dog.walk();
        } catch (DogException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
