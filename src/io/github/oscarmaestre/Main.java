package io.github.oscarmaestre;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
	BorderPane 			root;
	VBox 				contenedorProfesores;
	Controlador 		controlador;
	FlowPane			contenedorModulos;
	@Override
	public void start(Stage primaryStage) {
		try {
			root = (BorderPane)FXMLLoader.load(getClass().getResource("GUI.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			buildUI();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	protected void buildUI(){
		contenedorProfesores=	(VBox) 		root.lookup("#vboxCuadroProfesores");
		contenedorModulos 	= 	(FlowPane) 	root.lookup("#contenedorModulos");
		
		controlador		=	new Controlador(contenedorProfesores, contenedorModulos);
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
