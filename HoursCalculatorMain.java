import javax.swing.JFrame;

public class HoursCalculatorMain
{
	public static void main(String[] args)
	{

	HoursCalculatorDisplay startDisplay = new HoursCalculatorDisplay();

	startDisplay.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	startDisplay.setSize(450,700);
	startDisplay.setLocationRelativeTo(null);
	startDisplay.setVisible(true);
	}
}
