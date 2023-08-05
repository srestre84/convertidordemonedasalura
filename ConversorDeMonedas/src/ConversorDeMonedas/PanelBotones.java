package ConversorDeMonedas;


import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Importo todas las librerias que necesito, en la descripción de cada una dire por que//
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.JTextField;

public class PanelBotones extends JFrame{
	
	// Creo el JFRAME con los diferentes botones a traves de un JTEXFIELD capturo el valor en pesos, y ahora procedo a crear cada uno de los botones y JJLABEL para indicar que debes ingresar el monto en pesos//

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new PanelBotones();
			}
		});
	}

	// Asigno el tamaño del panel para hacerlo conciso y legible//
	public PanelBotones() {
		super("CONVERTIDOR DE MONEDAS");
		setSize(550, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		placeComponents();
		setVisible(true);
	}
	
	private void placeComponents() {
		setLayout(null);

		JLabel userLabel = new JLabel("MONTO EN PESOS COL "
				+ "A CONVERTIR");
		userLabel.setBounds(30, 30, 150, 30);
		add(userLabel);
		userLabel.setFont(new Font("ITALIC", Font.BOLD, 8));
		
		JTextField userText = new JTextField(20);
		userText.setBounds(250, 30, 200, 30);
		add(userText);
		

		JButton DolarButton = new JButton("DOLAR");
		DolarButton.setBounds(10, 80, 80, 25);
		add(DolarButton);

		JButton EuroButton = new JButton("EURO");
		EuroButton.setBounds(90, 80, 80, 25);
		add(EuroButton);

		JButton LibraButton = new JButton("LIBRA");
		LibraButton.setBounds(170, 80, 80, 25);
		add(LibraButton);
		
		JButton YenButton = new JButton("YEN");
		YenButton.setBounds(250, 80, 80, 25);
		add(YenButton);
		
		JButton WonButton = new JButton("WON");
		WonButton.setBounds(330, 80, 80, 25);
		add(WonButton);
		
		
		
		
		//Ahora gracias a la herramienta de actionlistener puedo generar que a traves de el click saque el mensaje con el resultado//
		
	DolarButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
		// Defino la variable showMessage para con ella poder hacer ifs para que no se abra dos veces//
				
				boolean showMessage = true;
	       	
				
				
// Utilizo esta herramienta de la clase string para transformarla en este valor y asegurarme de que se multiplique por otro string//
				 String n1 = userText.getText();
				 
				//Uso las excepciones para no permitir valores diferentes de 0 en el monto ingresado o letras, o caracter 
				 
				 try {
	                    double numero1 = Double.parseDouble(n1);

	                    if (numero1 <= 0) {
	                        if (showMessage) { // A traves de este if me aseguro que el mensaje no vuelva a salir//
	                            JOptionPane.showMessageDialog(null, "Ingresa un número mayor que cero.");
	                            showMessage = false;
	                        }
	                    } else {
	                    	 ConversorDeMonedas conversorUsuario1 = ConversorDeMonedas.DOLAR;
		                        String n2 = conversorUsuario1.getValorDivisa();
		                        double numero2 = Double.parseDouble(n2);
		                        double resultado = numero1 / numero2;
		                        if (showMessage) { // uso los enums para multiplicar con la variable del monto ingresado por el usuario y tambien luego convertirlos en un entero usando atributos del string
		                     	   JOptionPane.showMessageDialog(null, "El resultado en dolares US$: " + resultado);
		                            showMessage = false; 
		                        } 
	                    }
	                } catch (NumberFormatException ex) {
	                    if (showMessage) {
	                        JOptionPane.showMessageDialog(null, "'" + n1 + "' no es un número válido. Ingresa un número mayor que cero.");
	                        showMessage = false; //Uso la excepcion NumberFormatException para sacar un mensaje si la persona ingresa una letra o un caracter no númerico 
	                    }
	                }
	            }
	        });
				 
				
	      // Luego empiezo a llamar botón por boton 
	
		
		EuroButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				boolean showMessage = true;
	        	
				
				

				 String n1 = userText.getText();
				 
				 try {
	                    double numero1 = Double.parseDouble(n1);

	                    if (numero1 <= 0) {
	                        if (showMessage) { 
	                            JOptionPane.showMessageDialog(null, "Ingresa un número mayor que cero.");
	                            showMessage = false; 
	                        }
	                    } else {
	                    	 ConversorDeMonedas conversorUsuario2 = ConversorDeMonedas.EURO;
		                        String n2 = conversorUsuario2.getValorDivisa();
		                        double numero2 = Double.parseDouble(n2);
		                        double resultado = numero1 / numero2;
		                        if (showMessage) { 
		                     	   JOptionPane.showMessageDialog(null, "El resultado en Euros es €: " + resultado);
		                            showMessage = false; 
		                        } 
	                    }
	                } catch (NumberFormatException ex) {
	                    if (showMessage) {
	                        JOptionPane.showMessageDialog(null, "'" + n1 + "' no es un número válido. Ingresa un número mayor que cero.");
	                        showMessage = false;
	                    }
	                }
	            }
	        });
				 
	        

LibraButton.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		boolean showMessage = true;
		
          String n1 = userText.getText();
		 
     	 try {
             double numero1 = Double.parseDouble(n1);

             if (numero1 <= 0) {
                 if (showMessage) { 
                     JOptionPane.showMessageDialog(null, "Ingresa un número mayor que cero.");
                     showMessage = false; 
                 }
             } else {
             	 ConversorDeMonedas conversorUsuario3 = ConversorDeMonedas.LIBRA;
                     String n2 = conversorUsuario3.getValorDivisa();
                     double numero2 = Double.parseDouble(n2);
                     double resultado = numero1 / numero2;
                     if (showMessage) { 
                  	   JOptionPane.showMessageDialog(null, "El resultado es en libres es  £: " + resultado);
                         showMessage = false; 
                     }
             }
         } catch (NumberFormatException ex) {
             if (showMessage) {
                 JOptionPane.showMessageDialog(null, "'" + n1 + "' no es un número válido. Ingresa un número mayor que cero.");
                 showMessage = false;
             }
         }
     }
 });
		 


YenButton.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		
		boolean showMessage = true;
	
        String n1 = userText.getText();
		 
   	 try {
           double numero1 = Double.parseDouble(n1);

           if (numero1 <= 0) {
               if (showMessage) { 
                   JOptionPane.showMessageDialog(null, "Ingresa un número mayor que cero.");
                   showMessage = false; 
               }
           } else {
           	 ConversorDeMonedas conversorUsuario4 = ConversorDeMonedas.YEN;
                   String n2 = conversorUsuario4.getValorDivisa();
                   double numero2 = Double.parseDouble(n2);
                   double resultado = numero1 / numero2;
                   if (showMessage) { 
                	   JOptionPane.showMessageDialog(null, "El resultado en YENES es ¥: " + resultado);
                       showMessage = false; 
                   }
           }
       } catch (NumberFormatException ex) {
           if (showMessage) {
               JOptionPane.showMessageDialog(null, "'" + n1 + "' no es un número válido. Ingresa un número mayor que cero.");
               showMessage = false;
           }
       }
   }
});
		


WonButton.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		boolean showMessage = true;
		
        String n1 = userText.getText();
		 
   	 try {
           double numero1 = Double.parseDouble(n1);

           if (numero1 <= 0) {
               if (showMessage) {
                   JOptionPane.showMessageDialog(null, "Ingresa un número mayor que cero.");
                   showMessage = false; 
               }
           } else {
           	 ConversorDeMonedas conversorUsuario5 = ConversorDeMonedas.WONSUL;
                   String n2 = conversorUsuario5.getValorDivisa();
                   double numero2 = Double.parseDouble(n2);
                   double resultado = numero1 / numero2;
                   if (showMessage) { 
                	   JOptionPane.showMessageDialog(null, "El resultado es en WONSULES es ₩: " + resultado);
                       showMessage = false; 
                   }
                 
           }
       } catch (NumberFormatException ex) {
           if (showMessage) {
               JOptionPane.showMessageDialog(null, "'" + n1 + "' no es un número válido. Ingresa un número mayor que cero.");
               showMessage = false;
           }
       }
   }
});
}
}

