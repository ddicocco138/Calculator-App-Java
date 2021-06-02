/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicoccosimplecalclab;

import java.net.URL;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author damia
 */
public class CalcController implements Initializable {
    
    float data = 0;
    float awnser = 0;
    int operation = -1;

   @FXML
    private Button btnOne;

    @FXML
    private Button btnTwo;

    @FXML
    private Button btnFive;

    @FXML
    private Button btnFour;

    @FXML
    private Button btnThree;

    @FXML
    private Button btnPlus;

    @FXML
    private Button btnSix;

    @FXML
    private Button btnMinus;

    @FXML
    private Button btnSeven;

    @FXML
    private Button btnEight;

    @FXML
    private Button btnNine;

    @FXML
    private Button btnMult;

    @FXML
    private Button btnZero;

    @FXML
    private Button btnEqual;

    @FXML
    private Button btnClear;

    @FXML
    private Button btnDivide;
    
    @FXML
    private TextField display;

    @FXML
    void handleButtonAction(ActionEvent event) {
if(event.getSource() == btnOne)
{
    display.setText(display.getText() + "1");
} 
else if(event.getSource() == btnTwo)
{
    display.setText(display.getText() + "2");
}
else if(event.getSource() == btnThree)
{
    display.setText(display.getText() + "3");
}
else if(event.getSource() == btnFour)
{
    display.setText(display.getText() + "4");
}
else if(event.getSource() == btnFive)
{
    display.setText(display.getText() + "5");
}
else if(event.getSource() == btnSix)
{
    display.setText(display.getText() + "6");
}
else if(event.getSource() == btnSeven)
{
    display.setText(display.getText() + "7");
}
else if(event.getSource() == btnEight)
{
    display.setText(display.getText() + "8");
}
else if(event.getSource() == btnNine)
{
    display.setText(display.getText() + "9");
}
else if(event.getSource() == btnZero)
{
    display.setText(display.getText() + "0");
}
else if(event.getSource() == btnClear)
{
    display.setText("");
}
else if(event.getSource() == btnPlus)
{
    data = Float.parseFloat(display.getText());
    operation = 1;
    display.setText("");
}
else if(event.getSource() == btnMinus)
{
    data = Float.parseFloat(display.getText());
    operation = 2;
    display.setText("");
}
else if(event.getSource() == btnMult)
{
    data = Float.parseFloat(display.getText());
    operation = 3;
    display.setText("");
}
else if(event.getSource() == btnDivide)
{
    data = Float.parseFloat(display.getText());
    operation = 4;
    display.setText("");
}
else if(event.getSource() == btnEqual)
{
    float secondOperand = Float.parseFloat(display.getText());
    switch(operation)
    {
        case 1:
            awnser = data + secondOperand;
            display.setText(String.valueOf(awnser)); break;
        case 2:
            awnser = data - secondOperand;
            display.setText(String.valueOf(awnser)); break;
        case 3:
            awnser = data * secondOperand;
            display.setText(String.valueOf(awnser)); break;
        case 4:
            try {
            awnser = data / secondOperand;
            } catch(Exception e){display.setText("Error");
            display.setText(String.valueOf(awnser)); break;   
    }
}
}
    }
    



    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   

    
}

