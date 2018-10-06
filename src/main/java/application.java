import javafx.application.Application;
import javafx.stage.Stage;


public class application extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        System.out.println("Hola mundo");
        mat aux=new mat();
        aux.suma(5,7);
    }
}
