/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicoccosimplecalclab;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DiCoccoSimpleCalcLab extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);  
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        
      Parent pnt = FXMLLoader.load(getClass().getResource("Calc.fxml"));
      primaryStage.setTitle("Damiano's Calculator");
Scene sn = new Scene(pnt);
primaryStage.setScene(sn);
primaryStage.show();
    }
    
    
    
}
