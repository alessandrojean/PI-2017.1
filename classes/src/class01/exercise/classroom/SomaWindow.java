package class01.exercise.classroom;

import java.awt.GridLayout;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class SomaWindow extends JFrame
{

	private JTextField textNumA, textNumB, textNumC, textNumAEquals, textNumBEquals, textNumDEquals;

	public static void main(String[] args)
	{
		try
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

			SomaWindow lSomaWindow = new SomaWindow();
			lSomaWindow.setVisible(true);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public SomaWindow()
	{
		setTitle("Soma");
		setSize(450, 180);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

		// Input panel
		JPanel panelInputNumbers = new JPanel();
		panelInputNumbers.setBorder(BorderFactory.createTitledBorder("Entrada"));
		panelInputNumbers.setLayout(new GridLayout(2, 3, 3, 0));
		add(panelInputNumbers);
		
		textNumA = new JTextField();
		textNumB = new JTextField();
		textNumC = new JTextField();

		JLabel labelNumA = new JLabel("numA");
		labelNumA.setLabelFor(textNumA);
		labelNumA.setDisplayedMnemonic(KeyEvent.VK_A);
		
		JLabel labelNumB = new JLabel("numB");
		labelNumB.setLabelFor(textNumB);
		labelNumB.setDisplayedMnemonic(KeyEvent.VK_B);
		
		JLabel labelNumC = new JLabel("numC");
		labelNumC.setLabelFor(textNumC);
		labelNumC.setDisplayedMnemonic(KeyEvent.VK_C);

		panelInputNumbers.add(labelNumA);
		panelInputNumbers.add(labelNumB);
		panelInputNumbers.add(labelNumC);
		panelInputNumbers.add(textNumA);
		panelInputNumbers.add(textNumB);
		panelInputNumbers.add(textNumC);

		JPanel panelOperations = new JPanel();
		panelOperations.setBorder(BorderFactory.createTitledBorder("Operações"));
		panelOperations.setLayout(new GridLayout(2, 3, 3, 0));
		add(panelOperations);

		JLabel labelNumAEquals = new JLabel("numA = numB + numC");
		JLabel labelNumBEquals = new JLabel("numB = numC");
		JLabel labelNumDEquals = new JLabel("numD = numC - numA");

		panelOperations.add(labelNumAEquals);
		panelOperations.add(labelNumBEquals);
		panelOperations.add(labelNumDEquals);

		textNumAEquals = new JTextField();
		textNumAEquals.setEditable(false);

		textNumBEquals = new JTextField();
		textNumBEquals.setEditable(false);

		textNumDEquals = new JTextField();
		textNumDEquals.setEditable(false);

		panelOperations.add(textNumAEquals);
		panelOperations.add(textNumBEquals);
		panelOperations.add(textNumDEquals);

		Box boxButtons = Box.createHorizontalBox();
		add(boxButtons);

		JButton buttonCalculate = new JButton("Calcular");
		buttonCalculate.addActionListener(e -> calculate());
		buttonCalculate.setMnemonic(KeyEvent.VK_R);
		
		JButton buttonClean = new JButton("Limpar");
		buttonClean.addActionListener(e -> clean());
		buttonClean.setMnemonic(KeyEvent.VK_L);

		boxButtons.add(buttonCalculate);
		boxButtons.add(buttonClean);
	}

	private void calculate()
	{
		int numA = 0, numB = 0, numC = 0, numD = 0;
		numA = Integer.parseInt(textNumA.getText());
		numB = Integer.parseInt(textNumB.getText());
		numC = Integer.parseInt(textNumC.getText());

		textNumAEquals.setText(String.valueOf(numA = numB + numC));
		textNumBEquals.setText(String.valueOf(numB = numC));
		textNumDEquals.setText(String.valueOf(numD = numC - numA));
	}

	private void clean()
	{
		textNumA.setText("");
		textNumB.setText("");
		textNumC.setText("");
		textNumAEquals.setText("");
		textNumBEquals.setText("");
		textNumDEquals.setText("");
		textNumA.requestFocus();
	}
}
