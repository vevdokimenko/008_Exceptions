package homework.task2;

import java.time.Year;
import java.time.format.DateTimeParseException;

public class Worker {
    private String name;
    private String position;
    private Year year;

    public Worker(String[] args) throws DateTimeParseException {
        this.name = args[0].trim();
        this.position = args[1].trim();
        this.year = Year.parse(args[2].trim());
    }

    public Year getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " " + position + " " + year;
    }
}
