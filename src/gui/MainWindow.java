package gui;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingUtilities;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class MainWindow extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("com.jgoodies.looks.plastic.Plastic3DLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}


	private JMenuItem helpMenuItem;
	private JMenu jMenu5;
	private JLabel labelTitulo;
	private JCheckBox checkPDF;
	private JCheckBox checkOdt;
	private JCheckBox checkTxt;
	private JLabel Tipos;
	private JButton botaoPesquisar;
	private JTextField areaPesquisa;
	private JLabel jLabel2;
	private JButton botaoReindexar;
	private JTextField areaResultados;
	private JMenuBar jMenuBar1;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MainWindow inst = new MainWindow();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public MainWindow() {
		super();
		initGUI();
		this.setResizable(false);
	}
	
	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			this.setFont(new java.awt.Font("Catull",0,18));
			this.setIconImage(new ImageIcon(getClass().getClassLoader().getResource("gui/imagens/PCS.png")).getImage());
			this.setTitle("PCS Desktop Searcher");
			{
				areaResultados = new JTextField();
				areaResultados.setEditable(false);
				areaResultados.setOpaque(false);
			}
			{
				labelTitulo = new JLabel();
				labelTitulo.setIcon(new ImageIcon(getClass().getClassLoader().getResource("gui/imagens/header.png")));
			}
			{
				jLabel2 = new JLabel();
				jLabel2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("gui/imagens/PCS.png")));
			}
			{
				botaoReindexar = new JButton();
				botaoReindexar.setText("Reindexar Coleção");
			}
			{
				Tipos = new JLabel();
				Tipos.setText("Filtrar por Tipo");
				Tipos.setFont(new java.awt.Font("Tahoma",0,14));
			}
			{
				checkTxt = new JCheckBox();
				checkTxt.setText(".txt");
			}
			{
				checkOdt = new JCheckBox();
				checkOdt.setText(".odt");
			}
			{
				checkPDF = new JCheckBox();
				checkPDF.setText(".pdf");
			}
			{
				areaPesquisa = new JTextField();
			}
			{
				botaoPesquisar = new JButton();
				botaoPesquisar.setText("Pesquisar");
				botaoPesquisar.setSize(87, 25);
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addContainerGap()
				.addComponent(labelTitulo, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
				.addGap(24)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(areaPesquisa, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
				    .addComponent(botaoPesquisar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(Tipos, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(checkTxt, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(checkOdt, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(checkPDF, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(areaResultados, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(thisLayout.createSequentialGroup()
				        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 0, Short.MAX_VALUE))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addGap(26)
				        .addComponent(botaoReindexar, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 11, Short.MAX_VALUE)))
				.addContainerGap());
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addGap(7)
				.addGroup(thisLayout.createParallelGroup()
				    .addComponent(areaResultados, GroupLayout.Alignment.LEADING, 0, 694, Short.MAX_VALUE)
				    .addGroup(thisLayout.createSequentialGroup()
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				        .addGroup(thisLayout.createParallelGroup()
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(botaoReindexar, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 560, Short.MAX_VALUE))
				            .addGroup(thisLayout.createSequentialGroup()
				                .addGap(7)
				                .addGroup(thisLayout.createParallelGroup()
				                    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                        .addComponent(Tipos, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				                        .addGroup(thisLayout.createParallelGroup()
				                            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                                .addComponent(checkTxt, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
				                                .addComponent(checkOdt, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
				                                .addComponent(checkPDF, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
				                                .addGap(297)
				                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
				                                .addGap(0, 0, Short.MAX_VALUE))
				                            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                                .addPreferredGap(checkTxt, labelTitulo, LayoutStyle.ComponentPlacement.INDENT)
				                                .addComponent(labelTitulo, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				                                .addGap(0, 58, Short.MAX_VALUE)))
				                        .addGap(11))
				                    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                        .addComponent(areaPesquisa, GroupLayout.PREFERRED_SIZE, 588, GroupLayout.PREFERRED_SIZE)
				                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				                        .addComponent(botaoPesquisar, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
				                        .addGap(0, 0, Short.MAX_VALUE)))))))
				.addContainerGap());
			this.setSize(719, 486);
			{
				jMenuBar1 = new JMenuBar();
				setJMenuBar(jMenuBar1);
				{
					jMenu5 = new JMenu();
					jMenuBar1.add(jMenu5);
					jMenu5.setText("Help");
					{
						helpMenuItem = new JMenuItem();
						jMenu5.add(helpMenuItem);
						helpMenuItem.setText("Help");
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
