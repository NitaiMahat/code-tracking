import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {

  JFrame frame;
  JTextField textfield;
  JButton[] numberButtons = new JButton[10];
  JButton[] functionsButtons = new JButton[9];
  JButton addButton,subButton,mulButton,divButton;
  JButton decButton, equButton, delButton, clrButton, negButton;
  JPanel panel;

  Font myFont = new Font("Cosmic",Font.BOLD,30);

  double num1=0,num2=0, result = 0;
  char operator;


  Calculator(){

    frame = new JFrame("Calculator");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(420,550);
    frame.setLayout(null);
    
    textfield = new JTextField();
    textfield.setBounds(50,25,300,50);
    textfield.setFont(myFont);
    textfield.setEditable(false);

    addButton = new JButton("+");
    subButton = new JButton("-");
    mulButton = new JButton("*");
    divButton = new JButton("/");
    decButton = new JButton(".");
    equButton = new JButton("=");
    delButton = new JButton("Delete");
    clrButton = new JButton("Clear");
    negButton = new JButton("(-)");

    functionsButtons[0] = addButton;
    functionsButtons[1] = subButton;
    functionsButtons[2] = mulButton;
    functionsButtons[3] = divButton;
    functionsButtons[4] = decButton;
    functionsButtons[5] = equButton;
    functionsButtons[6] = delButton;
    functionsButtons[7] = clrButton;
    functionsButtons[8] = negButton;

    for (int i =0;i<9;i++){
      functionsButtons[i].addActionListener(this);
      functionsButtons[i].setFont(myFont);
      functionsButtons[i].setFocusable(false);
    }

    for (int i =0;i<10;i++){
      numberButtons[i] = new JButton(String.valueOf(i));
      numberButtons[i].addActionListener(this);
      numberButtons[i].setFont(myFont);
      numberButtons[i].setFocusable(false);
    }

    negButton.setBounds(20,450,100,50);
    delButton.setBounds(130,450,130,50);
    clrButton.setBounds(270,450,110,50);

    
    panel = new JPanel();
    panel.setBounds(50,100,300,300);
    panel.setLayout(new GridLayout(4,4,10,10));
    
    panel.add(numberButtons[1]);
    panel.add(numberButtons[2]);
    panel.add(numberButtons[3]);
    panel.add(addButton);
    panel.add(numberButtons[4]);
    panel.add(numberButtons[5]);
    panel.add(numberButtons[6]);
    panel.add(subButton);
    panel.add(numberButtons[7]);
    panel.add(numberButtons[8]);
    panel.add(numberButtons[9]);
    panel.add(mulButton);
    panel.add(decButton);
    panel.add(numberButtons[0]);
    panel.add(equButton);
    panel.add(divButton);

    frame.add(panel);
    frame.add(negButton);
    frame.add(delButton);
    frame.add(clrButton);
    frame.add(textfield);
    frame.setVisible(true);

  }
 
  public static void main(String[] args){
    Calculator calc = new Calculator();

  }

  @Override
  public void actionPerformed(ActionEvent e) {

    for (int i =0;i<10;i++){
      if(e.getSource() == numberButtons[i]){
        textfield.setText(textfield.getText().concat(String.valueOf(i)));
      }
    }
    if (e.getSource()==decButton) {
      textfield.setText(textfield.getText().concat("."));
    }

    if (e.getSource()==addButton) {
      num1 = Double.parseDouble(textfield.getText());
      operator = '+';
      textfield.setText("");
    }
    if (e.getSource()==subButton) {
      num1 = Double.parseDouble(textfield.getText());
      operator = '-';
      textfield.setText("");
   }
   
    if (e.getSource()==mulButton) {
      num1 = Double.parseDouble(textfield.getText());
      operator = '*';
      textfield.setText("");
    }
    if (e.getSource()==divButton) {
      num1 = Double.parseDouble(textfield.getText());
      operator = '/';
      textfield.setText("");
    }
    if (e.getSource()==equButton) {
      num2=Double.parseDouble(textfield.getText());

      switch(operator){
        case'+':

            result=num1+num2;
            break;
        case'-':
            result=num1-num2;
            break;
        case'*':
            result=num1*num2;
            break;
        case'/':
            result=num1/num2;
            break;
      }
      textfield.setText(String.valueOf(result));
      num1=result;
    }
    if(e.getSource()==clrButton) {
      textfield.setText("");
    }
    if(e.getSource()==delButton) {
      String string = textfield.getText();
      textfield.setText("");
      for(int i=0;i<string.length()-1;i++){
        textfield.setText(textfield.getText()+string.charAt(i));
      }
    }
    if(e.getSource()==negButton) {
      double temp = Double.parseDouble(textfield.getText());
      temp*=-1;
      textfield.setText(String.valueOf(temp));
    }
      
  }
}
