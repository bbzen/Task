package TasksSolution;

public class Task {

    TaskPriority priority; // добавьте переменную priority с приоритетом задачи
    private String description;
    // добавьте конструктор класса


    public Task(TaskPriority taskPriority, String description) {
        this.priority = taskPriority;
        this.description = description;
    } // добавьте метод get для приоритета

    public TaskPriority getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }
}