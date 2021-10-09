import org.junit.jupiter.api.*;

public class SnakeTest {

    private ThreadsController controller;
    private SquarePanel panel;
    private DataOfSquare dataOfSquare;
    private Window window;
    private Main main;
    private KeyboardListener listener;


    @BeforeAll
    public static void setupAll() {
        System.out.println("I should be printed before the tests Start!");
    }

    @BeforeEach
    public void setup() {
        System.out.println("I am Instantiating the Test Scripts!");
    }

    @Test
    @DisplayName("Test0")
    public void KeyBoardListener(){
        Assertions.assertThrows(RuntimeException.class,
                () ->  { listener = new KeyboardListener();
                });
    }

    @Test
    @DisplayName("Test3")
    public void CreateWindow(){
        Assertions.assertThrows(RuntimeException.class,
                () ->  { window = new Window();
                });
    }

    @Test
    @DisplayName("Test1")
    public void throwExceptionIfColZero(){
        Assertions.assertThrows(RuntimeException.class,
                () ->  {dataOfSquare = new DataOfSquare(-2);
        });
    }

    @Test
    @DisplayName("Test2")
    public void throwExceptionIfColMoreThanTwo(){
        Assertions.assertThrows(RuntimeException.class, ()->{ dataOfSquare = new DataOfSquare(4);
        });
    }

    @Test
    @DisplayName("Test4")
    public void TestMainProgram(){
        Assertions.assertThrows(RuntimeException.class,
                ()-> main = new Main());

    }

    @AfterEach
    public void afterEveryTest(){
        System.out.println("   *---Just completed the test!----*");
    }

    @AfterAll
    public static void weAreDoneWithTests(){
        System.out.println("This is the last statement to be printed!");
    }
}