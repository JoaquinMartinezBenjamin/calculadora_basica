
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Calculadora  extends JFrame implements ActionListener{
     JPanel panel,panelNumeros,panelEncabezado;
    String operacion,operando;
    double resultado;
    double operando1;
    double operando2;
    int identificador;
    boolean punto;
    JButton celdas[];
    JLabel pantalla;
    
      public Calculadora() {
          
        setDefaultCloseOperation(EXIT_ON_CLOSE );
        setBounds(300, 200, 300, 300);
        setVisible(true);
        setTitle("Calculadora");
        setLayout(null);
        
        operacion=""; //lo que se ve en la pantalla
        operando="";  // el numero concatenado que servira de operando 1 o 2
        resultado=0;
        identificador=0;/* identifica que operacion se realizara con el operando 2*/
        punto=false; /* es mi bandera para el punto decimal ya que un numero 
                     no puede tener dos puntos decimales*/
        
        
        panel =new JPanel(); /*mi panel propio donde ira el panel pantalla y panel numeros*/
        panel.setLayout(new BorderLayout());
        
        celdas = new JButton [16];  // un arreglo de botones
        
        panelEncabezado = new JPanel();   //donde ira la pantalla
        panelEncabezado.setLayout(new GridLayout(1,1));
        
        pantalla = new JLabel("Digite un operando");
        panelEncabezado.add(pantalla);
        panelEncabezado.setBackground(Color.WHITE);
        panel.add("North", panelEncabezado);
            
       getContentPane().setLayout(new BorderLayout());
        panelNumeros = new JPanel();
        panelNumeros.setLayout(new GridLayout(4,4));
        panelNumeros.setBorder(new EmptyBorder(8, 8, 8, 8));
      

               celdas[12]=new JButton("0");
               celdas[8]=new  JButton("1");
               celdas[9]=new  JButton("2");
               celdas[10]=new JButton("3");
               celdas[4]=new  JButton("4");
               celdas[5]=new  JButton("5");
               celdas[6]=new  JButton("6");
               celdas[0]=new  JButton("7");
               celdas[1]=new  JButton("8");
               celdas[2]=new  JButton("9");
               
               celdas[3]=new  JButton("/");
               celdas[15]=new JButton("+");
               celdas[7]=new  JButton("*");
               celdas[11]=new JButton("-");
            
               celdas[13]=new JButton(".");
               celdas[14]=new JButton("=");
    
                for(int i=0; i<16; i++){
                panelNumeros.add(celdas[i]);
                celdas[i].addActionListener(this);
                                  }
        
        panel.add("Center", panelNumeros);
        
        
        getContentPane().add(panel);
        getContentPane().setVisible(false);
        getContentPane().setVisible(true);
        
      }
     
      public void actionPerformed(ActionEvent mn){
      
          
          if(mn.getSource()== celdas[12]){
          pantalla.setText("");
          operacion+="0";
          operando+="0";
          pantalla.setText(operacion);}
          
          if(mn.getSource()== celdas[8]){
          pantalla.setText("");
          operacion+="1";
          operando+="1";
          pantalla.setText(operacion);}
          
          if(mn.getSource()== celdas[9]){
          pantalla.setText("");
          operacion+="2";
          operando+="2";
          pantalla.setText(operacion);}
          
          if(mn.getSource()== celdas[10]){
          pantalla.setText("");
          operacion+="3";
          operando+="3";
          pantalla.setText(operacion);}
          
          if(mn.getSource()== celdas[4]){
          pantalla.setText("");
          operacion+="4";
          operando+="4";
          pantalla.setText(operacion);}
          
          if(mn.getSource()== celdas[5]){
          pantalla.setText("");
          operacion+="5";
          operando+="5";
          pantalla.setText(operacion);}
          
          
          if(mn.getSource()== celdas[6]){
          pantalla.setText("");
          operacion+="6";
          operando+="6";
          pantalla.setText(operacion);}
          
        if(mn.getSource()== celdas[0]){
        pantalla.setText("");
        operacion+="7";
        operando+="7";
        pantalla.setText(operacion);
                                       }
        
        if(mn.getSource()== celdas[1]){
        pantalla.setText("");
        operacion+="8";
        operando+="8";
        pantalla.setText(operacion);}
        
        if(mn.getSource()== celdas[2]){
        pantalla.setText("");
        operacion+="9";
        operando+="9";
        pantalla.setText(operacion);}
        ////////////DIVISION//////////////
        if(mn.getSource()== celdas[3]){
         
              if(operando==""||identificador!=0){  JOptionPane.showMessageDialog(null, "Introduzca primero un operando");}
            else{
              identificador=2;
              pantalla.setText("");
              operacion+="/";
              pantalla.setText(operacion);
             operando1= Double.parseDouble(operando);
             operando="";
              punto=false;  //para poner punto al nuevo operando si es el caso
            }
        }
            
       //////////////SUMA/////////////
        if(mn.getSource()== celdas[15]){
         
               if(operando==""||identificador!=0){JOptionPane.showMessageDialog(null, "Introduzca primero un operando");}
            else{
            identificador=1;
             pantalla.setText("");
             operacion+="+";
             pantalla.setText(operacion);
             operando1= Double.parseDouble(operando);
             operando="";
              punto=false;
                                        }
        }
        //////////////////MULTIPLICACION/////////////
        
        if(mn.getSource()== celdas[7]){
    
         if(operando==""||identificador!=0){JOptionPane.showMessageDialog(null, "Introduzca primero un operando");}  
      else{
              identificador=3;
              pantalla.setText("");
              operacion+="*";
              pantalla.setText(operacion);
             operando1= Double.parseDouble(operando);
             operando="";
              punto=false;
            } 
        
        }
        
        ////////RESTA////////////
        if(mn.getSource()== (celdas[11])){
     
           if(operando==""||identificador!=0){JOptionPane.showMessageDialog(null, "Introduzca primero un operando");}    
        else{
              identificador=4;
              pantalla.setText("");
              operacion+="-";
              pantalla.setText(operacion);
             operando1= Double.parseDouble(operando);
             operando="";
             punto=false;
            }
        }
       /////////punto decimal///////////
        if(mn.getSource()== celdas[13]){
            if(!punto){ // si no tiene punto se puede poner punto al operando
         pantalla.setText("");
         operacion+=".";
         operando+=".";
         punto=true;
         pantalla.setText(operacion);
            }
            }
        
         ////////////RESULTADO//////////
        if(mn.getSource()== celdas[14]){

switch (identificador){
    case 0: 
      JOptionPane.showMessageDialog(null, "Para obtener un resultado primero haga una operacion");
       break;
    case 1: if(operando!=""){
        operando2=Double.parseDouble(operando);
        resultado= suma(operando1,operando2);
        pantalla.setText(operacion+" = "+resultado);
        
        //reinicio todo para una nueva operacion
operacion="";
operando="";
identificador=0;
resultado=0;
punto=false;
operando1=0;
operando2=0;
             }else{ JOptionPane.showMessageDialog(null, "Primero digite el segundo operando");}
       break;
    case 2: if(operando!=""){
        operando2=Double.parseDouble(operando);
        resultado= division(operando1,operando2);
        pantalla.setText(operacion+" = "+resultado);
        
        //reinicio todo para una nueva operacion
operacion="";
operando="";
identificador=0;
resultado=0;
punto=false;
operando1=0;
operando2=0;
            }else{ JOptionPane.showMessageDialog(null, "Primero digite el segundo operando");}
        break;
    case 3: if(operando!=""){
        operando2=Double.parseDouble(operando);
        resultado= multiplicacion(operando1,operando2);
        pantalla.setText(operacion+" = "+resultado);
        
        //reinicio todo para una nueva operacion
operacion="";
operando="";
identificador=0;
resultado=0;
punto=false;
operando1=0;
operando2=0;
            }else{ JOptionPane.showMessageDialog(null, "Primero digite el segundo operando");}
        break;
        
    case 4: if(operando!=""){
        operando2=Double.parseDouble(operando);
        resultado= resta(operando1,operando2);
        pantalla.setText(operacion+" = "+resultado);
        
        //reinicio todo para una nueva operacion
operacion="";
operando="";
identificador=0;
resultado=0;
punto=false;
operando1=0;
operando2=0;
            }else{ JOptionPane.showMessageDialog(null, "Primero digite el segundo operando");}
        break;

}


        }
      }
      
      //logica interna de la calculadora
      public double suma (double op1, double op2){
        return op1+op2;}

       public double division(double op1, double op2){
        return op1/op2;}
       
       public double multiplicacion(double op1, double op2){
        return op1*op2;}
       
       public double resta(double op1, double op2){
        return op1-op2;}
        
        
        
    public static void main(String [] args){
        Calculadora c = new Calculadora();
  
    }
}
