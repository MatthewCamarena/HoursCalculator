//RADIAL BUTTON FOR SUBTRACTING 30 MINUTES LUNCH TIME
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.lang.Math;

public class HCDisplay extends JFrame
{
	String hoursIn[] = new String[7];
	String hoursOut[] = new String[7];

	double overTime, regTime, doubleTime;

	// LABELS 
	JLabel JLWelcome, JLDash1, JLDash2, JLDash3, JLDash4;
	JLabel JLIn1, JLIn2, JLIn3, JLIn4, JLIn5, JLIn6, JLIn7;
	JLabel JLOut1, JLOut2, JLOut3, JLOut4, JLOut5, JLOut6, JLOut7;
	JLabel JLMonday, JLTuesday, JLWednesday, JLThursday, JLFriday, JLSaturday, JLSunday;
	JLabel JLRegular, JLOvertime, JLDoubletime;

	// ALL Text Boxes for CLOCKED IN & CLOCKED OUT
	JTextField JTIn1, JTIn2, JTIn3, JTIn4, JTIn5, JTIn6, JTIn7; 
	JTextField JTOut1, JTOut2, JTOut3, JTOut4, JTOut5, JTOut6, JTOut7;
	JTextField JTHours, JTOvertime, JTDoubletime;

	//layout
	JPanel layout, nPanel,sPanel, wPanel, ePanel,cPanel;
	
	//Buttons
	JButton JBReset, JBCalculate, JBExit;

	//JRadioButton
	JRadioButton JRBbreaks[];

	public HCDisplay()
	{


	// Header & setting layout
	super("Hours Calculator");
	try { 
    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
} catch (Exception e) {
    e.printStackTrace();
}
	layout = new JPanel(new BorderLayout());
	nPanel = new JPanel(new FlowLayout());
	cPanel = new JPanel(new FlowLayout());
	sPanel = new JPanel(new FlowLayout());
	layout.add(nPanel,BorderLayout.NORTH);
	layout.add(cPanel,BorderLayout.CENTER);
	layout.add(sPanel,BorderLayout.SOUTH);

	//Creation of JRadioButton
	JRBbreaks = new JRadioButton[7];
	for (int i = 0; i < 7; i++)
	{
		JRBbreaks[i] = new JRadioButton();
	}

	//Creation of textboxes
	JTIn1 = new JTextField(11);
	JTOut1 = new JTextField(11);

	JTIn2 = new JTextField(11);
	JTOut2 = new JTextField(11);

	JTIn3 = new JTextField(11);
	JTOut3 = new JTextField(11);

	JTIn4 = new JTextField(11);
	JTOut4 = new JTextField(11);

	JTIn5 = new JTextField(11);
	JTOut5 = new JTextField(11);

	JTIn6 = new JTextField(11);
	JTOut6 = new JTextField(11);

	JTIn7 = new JTextField(11);
	JTOut7 = new JTextField(11);

	JTHours = new JTextField(15);
	JTOvertime = new JTextField(15);
	JTDoubletime = new JTextField(15);

	JTHours.setEditable(false);
	JTOvertime.setEditable(false);
	JTDoubletime.setEditable(false);

	JTHours.setText("0");
	JTOvertime.setText("0");
	JTDoubletime.setText("0");

	//setting default to 0
	JTIn1.setText("0");
	JTOut1.setText("0");

	JTIn2.setText("0");
	JTOut2.setText("0");

	JTIn3.setText("0");
	JTOut3.setText("0");

	JTIn4.setText("0");
	JTOut4.setText("0");

	JTIn5.setText("0");
	JTOut5.setText("0");

	JTIn6.setText("0");
	JTOut6.setText("0");

	JTIn7.setText("0");
	JTOut7.setText("0");
	
	// Naming
	JLWelcome = new JLabel("Welcome");
	JLIn1 = new JLabel("In");
	JLOut1 = new JLabel("Out");

	JLIn2 = new JLabel("In");
	JLOut2 = new JLabel("Out");

	JLIn3 = new JLabel("In");
	JLOut3 = new JLabel("Out");

	JLIn4 = new JLabel("In");
	JLOut4 = new JLabel("Out");

	JLIn5 = new JLabel("In");
	JLOut5 = new JLabel("Out");

	JLIn6 = new JLabel("In");
	JLOut6 = new JLabel("Out");

	JLIn7 = new JLabel("In");
	JLOut7 = new JLabel("Out");

	JLRegular = new JLabel   ("Regular Hours:      ");
	JLOvertime = new JLabel  ("Overtime Hours:    ");
	JLDoubletime = new JLabel("Doubletime Hours: ");

	JLMonday = new JLabel("------------------------Monday-------------------------");
	JLTuesday = new JLabel("------------------------Tuesday-------------------------");
	JLWednesday = new JLabel("-----------------------Wednesday------------------------");
	JLThursday = new JLabel("-----------------------Thursday-------------------------");
	JLFriday = new JLabel("-------------------------Friday-------------------------");
	JLSaturday = new JLabel("------------------------Saturday-------------------------");
	JLSunday = new JLabel("-------------------------Sunday-------------------------");
	JLDash1 = new JLabel("--------------------------------------------------------");
	JLDash2 = new JLabel("--------------------------------------------------");
	JLDash3 = new JLabel("--------------------------------------------------");
	JLDash4 = new JLabel("--------------------------------------------------");

	//Buttons
	JBCalculate = new JButton("Calculate");
	JBReset = new JButton("Reset");
	JBExit = new JButton("Exit");

	//working with the layout & adding things

	// Placing objects onto the workspace
	nPanel.add(JLWelcome);
	//Monday
	cPanel.add(JLMonday);
	cPanel.add(JLIn1);
	cPanel.add(JTIn1);
	cPanel.add(JLOut1);
	cPanel.add(JTOut1);
	cPanel.add(JRBbreaks[0]);
	//Tuesday
	cPanel.add(JLTuesday);
	cPanel.add(JLIn2);
	cPanel.add(JTIn2);
	cPanel.add(JLOut2);
	cPanel.add(JTOut2);
	cPanel.add(JRBbreaks[1]);
	//Wednesday
	cPanel.add(JLWednesday);
	cPanel.add(JLIn3);
	cPanel.add(JTIn3);
	cPanel.add(JLOut3);
	cPanel.add(JTOut3);
	cPanel.add(JRBbreaks[2]);
	//Thursday
	cPanel.add(JLThursday);
	cPanel.add(JLIn4);
	cPanel.add(JTIn4);
	cPanel.add(JLOut4);
	cPanel.add(JTOut4);
	cPanel.add(JRBbreaks[3]);
	//Friday
	cPanel.add(JLFriday);
	cPanel.add(JLIn5);
	cPanel.add(JTIn5);
	cPanel.add(JLOut5);
	cPanel.add(JTOut5);
	cPanel.add(JRBbreaks[4]);
	//Saturday
	cPanel.add(JLSaturday);
	cPanel.add(JLIn6);
	cPanel.add(JTIn6);
	cPanel.add(JLOut6);
	cPanel.add(JTOut6);
	cPanel.add(JRBbreaks[5]);
	//Sunday
	cPanel.add(JLSunday);
	cPanel.add(JLIn7);
	cPanel.add(JTIn7);
	cPanel.add(JLOut7);
	cPanel.add(JTOut7);
	cPanel.add(JRBbreaks[6]);
	cPanel.add(JLDash1);

	// Calculated stuff
	cPanel.add(JLRegular);
	cPanel.add(JTHours);
	cPanel.add(JLDash2);
	cPanel.add(JLOvertime);
	cPanel.add(JTOvertime);
	cPanel.add(JLDash3);
	cPanel.add(JLDoubletime);
	cPanel.add(JTDoubletime);
	cPanel.add(JLDash4);

	sPanel.add(JBCalculate);
	sPanel.add(JBReset);
	sPanel.add(JBExit);
	add(layout);

	ALCalculate calculatePressed = new ALCalculate();
	JBCalculate.addActionListener(calculatePressed);
	ALReset resetPressed = new ALReset();
	JBReset.addActionListener(resetPressed);
	exitHandler exPressed = new exitHandler();
	JBExit.addActionListener(exPressed);

	}

	private class ALCalculate implements ActionListener 
	{
		public void actionPerformed(ActionEvent e)
		{	
			regTime = 0;
			overTime = 0;
			doubleTime = 0;
			hoursIn[0] = JTIn1.getText();
			hoursIn[1] = JTIn2.getText();
			hoursIn[2] = JTIn3.getText();
			hoursIn[3] = JTIn4.getText();
			hoursIn[4] = JTIn5.getText();
			hoursIn[5] = JTIn6.getText();
			hoursIn[6] = JTIn7.getText();

			hoursOut[0] = JTOut1.getText();
			hoursOut[1] = JTOut2.getText();
			hoursOut[2] = JTOut3.getText();
			hoursOut[3] = JTOut4.getText();
			hoursOut[4] = JTOut5.getText();
			hoursOut[5] = JTOut6.getText();
			hoursOut[6] = JTOut7.getText();

			for (int i = 0; i < 7 ; i++)
			{
				regTime += stringSubtraction(hoursIn[i], hoursOut[i], i);

			}

			regTime = roundHours(regTime);
			overTime = roundHours(overTime);
			doubleTime = roundHours(doubleTime);
			if(regTime > 40)
			{
				overTime += regTime - 40;
				regTime = 40;
			}
			

			JTHours.setText(Double.toString(regTime));
			JTOvertime.setText(Double.toString(overTime));
			JTDoubletime.setText(Double.toString(doubleTime));
		}
	}

	private class ALReset implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			JTIn1.setText("0");
			JTOut1.setText("0");

			JTIn2.setText("0");
			JTOut2.setText("0");

			JTIn3.setText("0");
			JTOut3.setText("0");

			JTIn4.setText("0");
			JTOut4.setText("0");

			JTIn5.setText("0");
			JTOut5.setText("0");

			JTIn6.setText("0");
			JTOut6.setText("0");

			JTIn7.setText("0");
			JTOut7.setText("0");

			JTHours.setText("0");
			JTOvertime.setText("0");
			JTDoubletime.setText("0");

			for (int i = 0; i < 7; i++)
			{
			JRBbreaks[i].setSelected(false);
			}
			
		}
	}

	public double stringSubtraction(String first, String second, int currNum)
	{
		double iFirst, iSecond, result;
		result = 0;
		iFirst = Double.parseDouble(first);
		iSecond = Double.parseDouble(second);
		result = iSecond - iFirst;
		if(JRBbreaks[currNum].isSelected())
		{
			result -= .5;
		}
		if(result > 12)
		{
			doubleTime += result - 12;
			overTime = 4;
			result = 8; 
		}
		else if(result > 8)
		{
			overTime += result - 8;	
			result = 8;

		}
		
		

		return result;
	}

	public double roundHours(double rHour)
	{
		double hourHolder, minuteHolder;
		double trueTotal;

		hourHolder = Math.floor(rHour);
		minuteHolder = rHour - hourHolder;

		if (minuteHolder  >= 0 && minuteHolder < .17)
		{
			minuteHolder = 0;
		}
		else if(minuteHolder >= .17 && minuteHolder < .43)
		{
			minuteHolder = .25;
		}
		else if(minuteHolder >= .43 && minuteHolder < .67)
		{
			minuteHolder = .5;
		}
		else if(minuteHolder >= .67 && minuteHolder < .93)
		{
			minuteHolder = .75;
		}
		else if(minuteHolder >= .93)
		{
			minuteHolder = 1.0;
		}
		trueTotal = hourHolder + minuteHolder;

		return trueTotal;
	}

	private class exitHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
		System.exit(0);
		}
	}
}
