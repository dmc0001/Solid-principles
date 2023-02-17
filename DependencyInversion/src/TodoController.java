public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    public void addTodoItem(String item) {
        todoService.addTodoItem(item);
    }

    public void removeTodoItem(String item) {
        todoService.removeTodoItem(item);
    }

    public List<String> getAllTodoItems() {
        return todoService.getAllTodoItems();
    }
}
