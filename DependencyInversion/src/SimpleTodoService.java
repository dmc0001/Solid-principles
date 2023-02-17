public class SimpleTodoService implements TodoService {
    private List<String> todoItems;

    public SimpleTodoService() {
        this.todoItems = new ArrayList<>();
    }

    @Override
    public void addTodoItem(String item) {
        todoItems.add(item);
    }

    @Override
    public void removeTodoItem(String item) {
        todoItems.remove(item);
    }

    @Override
    public List<String> getAllTodoItems() {
        return Collections.unmodifiableList(todoItems);
    }
}
