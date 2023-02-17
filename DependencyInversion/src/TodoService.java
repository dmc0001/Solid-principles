public interface TodoService {
    void addTodoItem(String item);
    void removeTodoItem(String item);
    List<String> getAllTodoItems();
}
