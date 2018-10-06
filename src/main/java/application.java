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
        aux.resta(4,5);
        aux.resta(7,2);
        aux.multiplicacion(4,5);
        aux.multiplicacion(4,0);

    }
}
