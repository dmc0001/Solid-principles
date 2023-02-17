public class TodoControllerTest {
    private TodoService todoService;
    private TodoController todoController;

    @BeforeEach
    public void setUp() {
        todoService = new SimpleTodoService();
        todoController = new TodoController(todoService);
    }

    @Test
    public void testAddTodoItem() {
        todoController.addTodoItem("Buy milk");
        todoController.addTodoItem("Walk the dog");
        assertEquals(Arrays.asList("Buy milk", "Walk the dog"), todoController.getAllTodoItems());
    }

    @Test
    public void testRemoveTodoItem() {
        todoController.addTodoItem("Buy milk");
        todoController.addTodoItem("Walk the dog");
        todoController.removeTodoItem("Buy milk");
        assertEquals(Collections.singletonList("Walk the dog"), todoController.getAllTodoItems());
    }
}
