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
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

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
	private JLabel labelApresentacoes;
	private JCheckBox checkTudo;
	private JCheckBox checkC;
	private JCheckBox checkJava;
	private JCheckBox checkPy;
	private JCheckBox checkXlsx;
	private JLabel labelDocumentos;
	private JMenu jMenu5;
	private JLabel labelCodigos;
	private JCheckBox checkXls;
	private JCheckBox checkOds;
	private JCheckBox checkPptx;
	private JCheckBox checkPpt;
	private JCheckBox checkDocx;
	private JCheckBox checkOdt;
	private JCheckBox checkPDF;
	private JCheckBox checkRtf;
	private JCheckBox checkTxt;
	private JCheckBox labelDoc;
	private JLabel labelPlanilhas;
	private JLabel labelTitulo;
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
		MainWindow m = new MainWindow();
		m.setVisible(true);
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
				checkTudo = new JCheckBox();
				checkTudo.setText("Selecionar Tudo");
				checkTudo.setOpaque(false);
				checkTudo.addChangeListener(new ChangeListener() {
					public void stateChanged(ChangeEvent evt) {
						checkTudoStateChanged(evt);
					}
				});
			}
			{
				checkC = new JCheckBox();
				checkC.setText(".c");
				checkC.setOpaque(false);
			}
			{
				checkJava = new JCheckBox();
				checkJava.setText(".java");
				checkJava.setOpaque(false);
			}
			{
				checkPy = new JCheckBox();
				checkPy.setText(".py");
				checkPy.setOpaque(false);
			}
			{
				checkXlsx = new JCheckBox();
				checkXlsx.setText(".xlsx");
				checkXlsx.setOpaque(false);
			}
			{
				checkPpt = new JCheckBox();
				checkPpt.setText(".ppt");
				checkPpt.setOpaque(false);
			}
			{
				checkPptx = new JCheckBox();
				checkPptx.setText(".pptx");
				checkPptx.setOpaque(false);
			}
			{
				checkOds = new JCheckBox();
				checkOds.setText(".ods");
				checkOds.setOpaque(false);
			}
			{
				checkXls = new JCheckBox();
				checkXls.setText(".xls");
				checkXls.setOpaque(false);
			}
			{
				checkDocx = new JCheckBox();
				checkDocx.setText(".docx");
				checkDocx.setSize(50, 15);
				checkDocx.setOpaque(false);
			}
			{
				checkOdt = new JCheckBox();
				checkOdt.setText(".odt");
				checkOdt.setSize(50, 15);
				checkOdt.setOpaque(false);
			}
			{
				labelDocumentos = new JLabel();
				labelDocumentos.setText("Documentos");
				labelDocumentos.setFont(new java.awt.Font("Tahoma",1,11));
				labelDocumentos.setSize(83, 15);
			}
			{
				labelApresentacoes = new JLabel();
				labelApresentacoes.setText("Apresentações");
				labelApresentacoes.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				labelPlanilhas = new JLabel();
				labelPlanilhas.setText("Planilhas");
				labelPlanilhas.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				labelCodigos = new JLabel();
				labelCodigos.setText("Códigos Fonte");
				labelCodigos.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				labelDoc = new JCheckBox();
				labelDoc.setText(".doc");
				labelDoc.setSize(50, 15);
				labelDoc.setOpaque(false);
			}
			{
				checkTxt = new JCheckBox();
				checkTxt.setText(".txt");
				checkTxt.setSize(50, 15);
				checkTxt.setOpaque(false);
			}
			{
				checkRtf = new JCheckBox();
				checkRtf.setText(".rtf");
				checkRtf.setSize(50, 15);
				checkRtf.setOpaque(false);
			}
			{
				checkPDF = new JCheckBox();
				checkPDF.setText(".pdf");
				checkPDF.setSize(50, 15);
				checkPDF.setOpaque(false);
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
				.addComponent(Tipos, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(checkOdt, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
				    .addComponent(labelDoc, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
				    .addComponent(labelDocumentos, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(checkTxt, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
				    .addComponent(checkRtf, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
				    .addComponent(checkPDF, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
				    .addComponent(checkDocx, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(checkPpt, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(labelApresentacoes, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(checkPptx, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(checkXlsx, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(checkOds, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(labelPlanilhas, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(checkXls, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(checkJava, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(checkPy, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(labelCodigos, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(checkC, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(checkTudo, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(areaResultados, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(thisLayout.createSequentialGroup()
				        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 0, Short.MAX_VALUE))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addGap(24)
				        .addComponent(botaoReindexar, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 13, Short.MAX_VALUE)))
				.addContainerGap(20, 20));
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addGap(7)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(thisLayout.createSequentialGroup()
				        .addGroup(thisLayout.createParallelGroup()
				            .addComponent(areaPesquisa, GroupLayout.Alignment.LEADING, 0, 893, Short.MAX_VALUE)
				            .addGroup(thisLayout.createSequentialGroup()
				                .addGroup(thisLayout.createParallelGroup()
				                    .addGroup(thisLayout.createSequentialGroup()
				                        .addGap(48)
				                        .addGroup(thisLayout.createParallelGroup()
				                            .addGroup(thisLayout.createSequentialGroup()
				                                .addGroup(thisLayout.createParallelGroup()
				                                    .addComponent(labelCodigos, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
				                                    .addComponent(labelApresentacoes, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				                                    .addComponent(labelDocumentos, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE))
				                                .addGroup(thisLayout.createParallelGroup()
				                                    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                                        .addComponent(checkPy, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
				                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				                                        .addComponent(checkJava, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				                                        .addComponent(checkC, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
				                                        .addGap(19))
				                                    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                                        .addGroup(thisLayout.createParallelGroup()
				                                            .addComponent(checkDocx, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
				                                            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                                                .addGap(8)
				                                                .addComponent(checkPpt, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)))
				                                        .addGroup(thisLayout.createParallelGroup()
				                                            .addComponent(checkPptx, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
				                                            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                                                .addComponent(checkPDF, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
				                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
				                                        .addComponent(checkRtf, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))))
				                            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                                .addGroup(thisLayout.createParallelGroup()
				                                    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                                        .addComponent(labelPlanilhas, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
				                                        .addComponent(checkOds, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
				                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				                                        .addComponent(checkXls, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
				                                    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                                        .addComponent(checkTudo, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
				                                        .addGap(31)))
				                                .addComponent(checkXlsx, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
				                                .addGap(37))))
				                    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                        .addComponent(botaoReindexar, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
				                        .addGap(148))
				                    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                        .addComponent(Tipos, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				                        .addGap(188)))
				                .addGroup(thisLayout.createParallelGroup()
				                    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                        .addComponent(checkOdt, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
				                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				                        .addComponent(labelDoc, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
				                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				                        .addComponent(checkTxt, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
				                        .addGap(0, 377, Short.MAX_VALUE))
				                    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                        .addGap(20)
				                        .addComponent(labelTitulo, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				                        .addGap(0, 0, Short.MAX_VALUE)))
				                .addGap(101)))
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				        .addGroup(thisLayout.createParallelGroup()
				            .addComponent(jLabel2, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
				            .addComponent(botaoPesquisar, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))
				        .addGap(7))
				    .addComponent(areaResultados, GroupLayout.Alignment.LEADING, 0, 1007, Short.MAX_VALUE))
				.addContainerGap());
			this.setSize(1032, 690);
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
	
	private void checkTudoStateChanged(ChangeEvent evt) {
		//Codigo bonito eh oq ha
		checkC.setSelected(checkTudo.isSelected());
		checkDocx.setSelected(checkTudo.isSelected());
		checkJava.setSelected(checkTudo.isSelected());
		checkOds.setSelected(checkTudo.isSelected());
		checkOdt.setSelected(checkTudo.isSelected());
		checkPDF.setSelected(checkTudo.isSelected());
		checkPpt.setSelected(checkTudo.isSelected());
		checkPptx.setSelected(checkTudo.isSelected());
		checkPy.setSelected(checkTudo.isSelected());
		checkRtf.setSelected(checkTudo.isSelected());
		checkTxt.setSelected(checkTudo.isSelected());
		checkXls.setSelected(checkTudo.isSelected());	
		labelDoc.setSelected(checkTudo.isSelected());
		checkXlsx.setSelected(checkTudo.isSelected());
	}

}
