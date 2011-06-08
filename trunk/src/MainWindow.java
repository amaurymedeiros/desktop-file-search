import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import net.sf.nachocalendar.CalendarFactory;
import net.sf.nachocalendar.components.DateField;

import org.apache.lucene.index.CorruptIndexException;

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
	private JLabel labelDiretorio;
	private JPanel panelDiretorio;
	private DateField dataFinal;
	private DateField dataInicial;
	private JCheckBox checkFiltraData;
	private JLabel jLabel7;
	private JSpinner spinnerMinutoFinal;
	private JLabel jLabel6;
	private JSpinner spinnerHoraFinal;
	private JLabel jLabel5;
	private JLabel jLabel4;
	private JLabel jLabel3;
	private JLabel Hora;
	private JSpinner spinnerMinutosInicial;
	private JLabel doispontos;
	private JSpinner spinnerHoraInicial;
	private JLabel Inicio;
	private JLabel jLabel1;
	private JPanel panelData;
	private JCheckBox checkC;
	private JCheckBox checkJava;
	private JCheckBox checkPy;
	private JCheckBox checkXlsx;
	private JMenu jMenu5;
	private JCheckBox checkXls;
	private JCheckBox checkPptx;
	private JCheckBox checkboxDOC;
	private JCheckBox checkboxSelecionarTudo;
	private JTextField outrosTipos;
	private JLabel jLabel10;
	private JCheckBox checkboxXLSX;
	private JCheckBox checkboxXLS;
	private JCheckBox checkboxODS;
	private JLabel jLabel9;
	private JCheckBox checkboxJAVA;
	private JCheckBox checkboxPY;
	private JCheckBox checkboxC;
	private JLabel jLabel8;
	private JCheckBox checkboxPDF;
	private JCheckBox checkboxRTF;
	private JCheckBox checkboxDOCX;
	private JCheckBox checkboxTXT;
	private JCheckBox checkboxODT;
	private JLabel labelDocs;
	private JPanel panelTipos;
	private JSpinner numeroResultados;
	private JLabel labelResultadoPagina;
	private JPanel panel;
	private JComboBox numeroResultadoPorPagina;
	private JButton botaoConfigurarDiretorio;
	private JLabel labelNomeDiretorio;
	private JCheckBox checkPpt;
	private JCheckBox checkDocx;
	private JCheckBox checkOdt;
	private JCheckBox checkPDF;
	private JCheckBox checkRtf;
	private JCheckBox checkTxt;
	private JCheckBox labelDoc;
	private JLabel labelTitulo;
	private JLabel Tipos;
	private JButton botaoPesquisar;
	private JTextField areaPesquisa;
	private JLabel jLabel2;
	private JButton botaoReindexar;
	private JList areaResultados;
	private JMenuBar jMenuBar1;
	private ArrayList<JCheckBox> listaCheckBoxes = new ArrayList<JCheckBox>();
	private JFileChooser chooser;

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
			this.setIconImage(new ImageIcon(getClass().getClassLoader().getResource("imagens/PCS.png")).getImage());
			this.setTitle("PCS Desktop Searcher");
			{
				areaResultados = new JList();
			}
			{
				panel = new JPanel();
				GroupLayout panelLayout = new GroupLayout((JComponent)panel);
				panel.setLayout(panelLayout);
				panel.setOpaque(false);
				{
					labelResultadoPagina = new JLabel();
					labelResultadoPagina.setText("Número de Resultados");
				}
				{
					numeroResultados = new JSpinner(new SpinnerNumberModel(10, 1, 10, 1));

				}
						panelLayout.setHorizontalGroup(panelLayout.createSequentialGroup()
					.addComponent(labelResultadoPagina, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(numeroResultados, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(0, 8, Short.MAX_VALUE));
						panelLayout.setVerticalGroup(panelLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(numeroResultados, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					    .addComponent(labelResultadoPagina, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(38, 38));
			}

			{
				panelDiretorio = new JPanel();
				GroupLayout panelDiretorioLayout = new GroupLayout((JComponent)panelDiretorio);
				panelDiretorio.setLayout(panelDiretorioLayout);
				panelDiretorio.setOpaque(false);
				{
					labelDiretorio = new JLabel();
					labelDiretorio.setText("Diretório a Indexar:");
					labelDiretorio.setFont(new java.awt.Font("Tahoma",1,14));
				}
				{
					labelNomeDiretorio = new JLabel();
					labelNomeDiretorio.setText(System.getProperty("user.dir")+"\\colecao");
					labelNomeDiretorio.setFont(new java.awt.Font("Tahoma",0,14));
				}
				{
					botaoConfigurarDiretorio = new JButton();
					botaoConfigurarDiretorio.setText("Configurar");
					botaoConfigurarDiretorio.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent evt) {
							botaoConfigurarDiretorioMouseClicked(evt);
						}
					});
				}
				panelDiretorioLayout.setHorizontalGroup(panelDiretorioLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(labelDiretorio, 0, 154, Short.MAX_VALUE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(labelNomeDiretorio, GroupLayout.PREFERRED_SIZE, 716, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(botaoConfigurarDiretorio, 0, 100, Short.MAX_VALUE));
				panelDiretorioLayout.setVerticalGroup(panelDiretorioLayout.createParallelGroup()
					.addGroup(GroupLayout.Alignment.LEADING, panelDiretorioLayout.createSequentialGroup()
					    .addComponent(botaoConfigurarDiretorio, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					    .addContainerGap(28, Short.MAX_VALUE))
					.addGroup(panelDiretorioLayout.createSequentialGroup()
					    .addGap(13)
					    .addGroup(panelDiretorioLayout.createParallelGroup()
					        .addGroup(panelDiretorioLayout.createSequentialGroup()
					            .addComponent(labelDiretorio, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
					        .addGroup(panelDiretorioLayout.createSequentialGroup()
					            .addComponent(labelNomeDiretorio, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)))
					    .addContainerGap(19, Short.MAX_VALUE)));
			}
			{
				panelData = new JPanel();
				GroupLayout panelDataLayout = new GroupLayout((JComponent)panelData);
				panelData.setLayout(panelDataLayout);
				panelData.setOpaque(false);
				{
					jLabel1 = new JLabel();
					jLabel1.setText("Filtrar por Data");
					jLabel1.setFont(new java.awt.Font("Tahoma",0,14));					
				}
				{
					dataInicial = new CalendarFactory().createDateField();
					dataInicial.setEnabled(false);

				}
				{
					dataFinal = new CalendarFactory().createDateField();
					dataFinal.setEnabled(false);
				}
				{
					checkFiltraData = new JCheckBox();
					checkFiltraData.setOpaque(false);
					checkFiltraData.addChangeListener(new ChangeListener() {
						public void stateChanged(ChangeEvent evt) {
							checkFiltraDataStateChanged(evt);
						}
					});
				}
				{
					Inicio = new JLabel();
					Inicio.setText("Início");
					Inicio.setEnabled(false);
				}
				{
					spinnerHoraInicial = new JSpinner( new SpinnerNumberModel(12, 0, 23, 1));
					spinnerHoraInicial.setEnabled(false);
				}
				{
					doispontos = new JLabel();
					doispontos.setText(":");
				}
				{
					spinnerMinutosInicial = new JSpinner( new SpinnerNumberModel(30, 0, 59, 1));
					spinnerMinutosInicial.setEnabled(false);
				}
				{
					Hora = new JLabel();
					Hora.setText("Hora:");
					Hora.setEnabled(false);
				}
				{
					jLabel3 = new JLabel();
					jLabel3.setText("Data:");
					jLabel3.setEnabled(false);
				}
				{
					jLabel4 = new JLabel();
					jLabel4.setText("Fim");
					jLabel4.setEnabled(false);
				}
				{
					jLabel5 = new JLabel();
					jLabel5.setText("Hora:");
					jLabel5.setEnabled(false);
				}
				{
					spinnerHoraFinal = new JSpinner( new SpinnerNumberModel(12, 0, 23, 1));
					spinnerHoraFinal.setEnabled(false);
				}
				{
					jLabel6 = new JLabel();
					jLabel6.setText(":");
				}
				{
					spinnerMinutoFinal = new JSpinner( new SpinnerNumberModel(30, 0, 59, 1));
					spinnerMinutoFinal.getEditor().setEnabled(false);
					spinnerMinutoFinal.setEnabled(false);
				}
				{
					jLabel7 = new JLabel();
					jLabel7.setText("Data:");
					jLabel7.setEnabled(false);
				}
				panelDataLayout.setHorizontalGroup(panelDataLayout.createSequentialGroup()
					.addGap(6)
					.addGroup(panelDataLayout.createParallelGroup()
					    .addGroup(GroupLayout.Alignment.LEADING, panelDataLayout.createSequentialGroup()
					        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					        .addGap(12))
					    .addGroup(panelDataLayout.createSequentialGroup()
					        .addGroup(panelDataLayout.createParallelGroup()
					            .addGroup(panelDataLayout.createSequentialGroup()
					                .addGap(18)
					                .addGroup(panelDataLayout.createParallelGroup()
					                    .addComponent(Hora, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					                    .addComponent(jLabel5, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)))
					            .addGroup(GroupLayout.Alignment.LEADING, panelDataLayout.createSequentialGroup()
					                .addComponent(Inicio, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					                .addGap(27))
					            .addGroup(GroupLayout.Alignment.LEADING, panelDataLayout.createSequentialGroup()
					                .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					                .addGap(27)))
					        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					        .addGroup(panelDataLayout.createParallelGroup()
					            .addComponent(spinnerHoraInicial, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					            .addComponent(spinnerHoraFinal, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGroup(panelDataLayout.createParallelGroup()
					    .addGroup(GroupLayout.Alignment.LEADING, panelDataLayout.createSequentialGroup()
					        .addComponent(checkFiltraData, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
					        .addGap(28))
					    .addGroup(panelDataLayout.createSequentialGroup()
					        .addGroup(panelDataLayout.createParallelGroup()
					            .addComponent(doispontos, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 6, GroupLayout.PREFERRED_SIZE)
					            .addComponent(jLabel6, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 6, GroupLayout.PREFERRED_SIZE))
					        .addGroup(panelDataLayout.createParallelGroup()
					            .addComponent(spinnerMinutosInicial, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					            .addComponent(spinnerMinutoFinal, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(panelDataLayout.createParallelGroup()
					    .addComponent(jLabel3, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jLabel7, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(panelDataLayout.createParallelGroup()
					    .addGroup(panelDataLayout.createSequentialGroup()
					        .addComponent(dataInicial, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
					    .addGroup(panelDataLayout.createSequentialGroup()
					        .addComponent(dataFinal, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(132, Short.MAX_VALUE));
				panelDataLayout.setVerticalGroup(panelDataLayout.createSequentialGroup()
					.addGroup(panelDataLayout.createParallelGroup()
					    .addComponent(checkFiltraData, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jLabel1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(25)
					.addComponent(Inicio, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(panelDataLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(spinnerMinutosInicial, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jLabel3, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					    .addComponent(doispontos, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					    .addComponent(spinnerHoraInicial, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					    .addComponent(Hora, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					    .addComponent(dataInicial, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(20)
					.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(panelDataLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(spinnerMinutoFinal, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jLabel7, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jLabel6, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					    .addComponent(spinnerHoraFinal, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jLabel5, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					    .addComponent(dataFinal, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED));
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
				labelTitulo.setIcon(new ImageIcon(getClass().getClassLoader().getResource("imagens/header.png")));
			}
			{
				jLabel2 = new JLabel();
				jLabel2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("imagens/PCS.png")));
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
				botaoPesquisar.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						try {
							botaoPesquisarMouseClicked(evt);
						} catch (CorruptIndexException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (org.apache.lucene.queryParser.ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				});
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addContainerGap()
				.addComponent(labelTitulo, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
				.addGap(24)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(areaPesquisa, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
				    .addComponent(botaoPesquisar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(panelDiretorio, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(panel, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
				        .addGap(98))
				    .addGroup(thisLayout.createSequentialGroup()
				        .addGap(12)
				        .addGroup(thisLayout.createParallelGroup()
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(panelData, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
				                .addGap(11))
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(Tipos, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				                .addComponent(getPanelTipos(), GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)))))
				.addGap(33)
				.addComponent(areaResultados, 0, 180, Short.MAX_VALUE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup()
				    .addComponent(jLabel2, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addGap(24)
				        .addComponent(botaoReindexar, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
				        .addGap(13)))
				.addContainerGap());
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addGap(7)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(thisLayout.createSequentialGroup()
				        .addGroup(thisLayout.createParallelGroup()
				            .addComponent(areaPesquisa, GroupLayout.Alignment.LEADING, 0, 893, Short.MAX_VALUE)
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(botaoReindexar, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 172, Short.MAX_VALUE)
				                .addComponent(labelTitulo, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				                .addGap(97)))
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				        .addGroup(thisLayout.createParallelGroup()
				            .addComponent(jLabel2, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
				            .addComponent(botaoPesquisar, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))
				        .addGap(7))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(panelDiretorio, GroupLayout.PREFERRED_SIZE, 1000, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 7, Short.MAX_VALUE))
				    .addComponent(areaResultados, GroupLayout.Alignment.LEADING, 0, 1007, Short.MAX_VALUE)
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addGap(7)
				        .addGroup(thisLayout.createParallelGroup()
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(Tipos, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				                .addGap(310))
				            .addComponent(getPanelTipos(), GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 398, GroupLayout.PREFERRED_SIZE))
				        .addGap(53)
				        .addComponent(panel, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
				        .addGap(36)
				        .addComponent(panelData, GroupLayout.PREFERRED_SIZE, 346, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 0, Short.MAX_VALUE)))
				.addContainerGap());
			this.setSize(1034, 737);
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
			
			listaCheckBoxes.add(checkboxC);
			listaCheckBoxes.add(checkboxDOC);
			listaCheckBoxes.add(checkboxDOCX);
			listaCheckBoxes.add(checkboxJAVA);
			listaCheckBoxes.add(checkboxODS);
			listaCheckBoxes.add(checkboxODT);
			listaCheckBoxes.add(checkboxPDF);
			listaCheckBoxes.add(checkboxPY);
			listaCheckBoxes.add(checkboxRTF);
			listaCheckBoxes.add(checkboxTXT);
			listaCheckBoxes.add(checkboxXLS);
			listaCheckBoxes.add(checkboxXLSX);			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void checkFiltraDataStateChanged(ChangeEvent evt) {
		spinnerHoraFinal.setEnabled(checkFiltraData.isSelected());
		spinnerHoraInicial.setEnabled(checkFiltraData.isSelected());
		spinnerMinutoFinal.setEnabled(checkFiltraData.isSelected());
		spinnerMinutosInicial.setEnabled(checkFiltraData.isSelected());
		Inicio.setEnabled(checkFiltraData.isSelected());
		jLabel5.setEnabled(checkFiltraData.isSelected());
		jLabel4.setEnabled(checkFiltraData.isSelected());
		jLabel3.setEnabled(checkFiltraData.isSelected());
		jLabel7.setEnabled(checkFiltraData.isSelected());
		Hora.setEnabled(checkFiltraData.isSelected());
		dataInicial.setEnabled(checkFiltraData.isSelected());
		dataFinal.setEnabled(checkFiltraData.isSelected());
		
	}
	
	private void botaoPesquisarMouseClicked(MouseEvent evt) throws CorruptIndexException, IOException, ParseException, org.apache.lucene.queryParser.ParseException {
		if(semFiltros()) {
			return;
		}
		
		String busca = areaPesquisa.getText();
		String[] tipos = montaTipos();
		Date valorDataInicial = null;
		Date valorDataFinal = null;
		
		if(checkFiltraData.isSelected()) {
			valorDataInicial = getDateInicial();
			valorDataFinal = getDateFinal();
		}
		
		int hitsPerPage = (Integer) numeroResultados.getValue();
		
		Facade f = new Facade();
		List<ResultadoDeBusca> resultados = f.search(tipos, hitsPerPage, valorDataInicial, valorDataFinal, busca);		
		
		
		String[] data = new String[resultados.size()];
		for(int i = 0; i < resultados.size(); i++) {			
			data[i] = resultados.get(i).getPath();
		}
		
		areaResultados.setListData(data);
	}

	private boolean semFiltros() {
		for(JCheckBox j : listaCheckBoxes) {
			if(j.isSelected()) {
				System.out.println("check selecionada");
				return false;
			}
		}
		
		if(outrosTipos.getText().split(";").length > 0 && outrosTipos.getText().split(";")[0].trim().length() > 0) {
			System.out.println("tem outro tipo");
			return false;
		}
		
		return true;
	}

	private String[] montaTipos() {
		ArrayList<String> tipos = new ArrayList<String>();
		for(JCheckBox j : listaCheckBoxes) {
			if(j.isSelected()) {
				tipos.add(j.getText().replace(".", ""));
			}
		}
		
		for(String s: outrosTipos.getText().split(";")) {
			if(s.trim().length() > 0) {
				tipos.add(s);
			}
		}
		
		System.out.println("Tipos: "+tipos);
		
		String[] array = new String[tipos.size()];
		
		int contador = 0;
		for(String s: tipos) {
			array[contador] = s;
			contador++;
		}
		
		return array;
	}
	

	private Date getDateInicial() {
		Date valorDataInicial = (Date)dataInicial.getValue();
		valorDataInicial.setHours((Integer) spinnerHoraInicial.getValue());
		valorDataInicial.setMinutes((Integer) spinnerMinutosInicial.getValue());
		
		return valorDataInicial;
	}
	
	private Date getDateFinal() {
		Date valorDataFinal = (Date)dataFinal.getValue();
		valorDataFinal.setHours((Integer) spinnerHoraFinal.getValue());
		valorDataFinal.setMinutes((Integer) spinnerHoraFinal.getValue());
		
		return valorDataFinal;
	}
	
	private JPanel getPanelTipos() {
		if(panelTipos == null) {
			panelTipos = new JPanel();
			GroupLayout panelTiposLayout = new GroupLayout((JComponent)panelTipos);
			panelTipos.setLayout(panelTiposLayout);
			panelTipos.setOpaque(false);
			panelTiposLayout.setHorizontalGroup(panelTiposLayout.createSequentialGroup()
				.addContainerGap()
				.addGroup(panelTiposLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, panelTiposLayout.createSequentialGroup()
				        .addGroup(panelTiposLayout.createParallelGroup()
				            .addGroup(GroupLayout.Alignment.LEADING, panelTiposLayout.createSequentialGroup()
				                .addComponent(getLabelDocs(), GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				                .addGap(7)
				                .addComponent(getCheckboxODT(), GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
				                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				                .addComponent(getCheckboxTXT(), GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
				            .addGroup(panelTiposLayout.createSequentialGroup()
				                .addGroup(panelTiposLayout.createParallelGroup()
				                    .addComponent(getCheckboxSelecionarTudo(), GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
				                    .addGroup(GroupLayout.Alignment.LEADING, panelTiposLayout.createSequentialGroup()
				                        .addComponent(getJLabel8(), GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
				                        .addComponent(getCheckboxC(), GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
				                    .addGroup(GroupLayout.Alignment.LEADING, panelTiposLayout.createSequentialGroup()
				                        .addComponent(getJLabel9(), GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
				                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				                        .addComponent(getCheckboxODS(), GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)))
				                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				                .addGroup(panelTiposLayout.createParallelGroup()
				                    .addComponent(getCheckboxPY(), GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
				                    .addComponent(getCheckboxXLS(), GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
				                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
				        .addComponent(getCheckboxJAVA(), GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
				        .addComponent(getCheckboxDOCX(), GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
				        .addComponent(getCheckboxRTF(), GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
				        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				        .addComponent(getCheckboxPDF(), GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 0, Short.MAX_VALUE))
				    .addGroup(GroupLayout.Alignment.LEADING, panelTiposLayout.createSequentialGroup()
				        .addComponent(getJLabel10(), GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
				        .addGroup(panelTiposLayout.createParallelGroup()
				            .addGroup(GroupLayout.Alignment.LEADING, panelTiposLayout.createSequentialGroup()
				                .addComponent(getCheckboxDOC(), GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 152, Short.MAX_VALUE))
				            .addGroup(GroupLayout.Alignment.LEADING, panelTiposLayout.createSequentialGroup()
				                .addComponent(getCheckboxXLSX(), GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 144, Short.MAX_VALUE))
				            .addGroup(GroupLayout.Alignment.LEADING, panelTiposLayout.createSequentialGroup()
				                .addPreferredGap(getCheckboxDOC(), getOutrosTipos(), LayoutStyle.ComponentPlacement.INDENT)
				                .addComponent(getOutrosTipos(), GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 0, Short.MAX_VALUE)))
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
				.addContainerGap(22, 22));
			panelTiposLayout.setVerticalGroup(panelTiposLayout.createSequentialGroup()
				.addGroup(panelTiposLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(getCheckboxODT(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(getLabelDocs(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(getCheckboxTXT(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(getCheckboxDOCX(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(getCheckboxRTF(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(getCheckboxPDF(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(getCheckboxDOC(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(panelTiposLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(getCheckboxPY(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
				    .addComponent(getJLabel8(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
				    .addComponent(getCheckboxC(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
				    .addComponent(getCheckboxJAVA(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(panelTiposLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(getCheckboxXLS(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(getJLabel9(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
				    .addComponent(getCheckboxODS(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(getCheckboxXLSX(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(panelTiposLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(getOutrosTipos(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(getJLabel10(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, 1, Short.MAX_VALUE)
				.addComponent(getCheckboxSelecionarTudo(), GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE));
		}
		return panelTipos;
	}
	
	private JLabel getLabelDocs() {
		if(labelDocs == null) {
			labelDocs = new JLabel();
			labelDocs.setText("Documentos");
		}
		return labelDocs;
	}
	
	private JCheckBox getCheckboxODT() {
		if(checkboxODT == null) {
			checkboxODT = new JCheckBox();
			checkboxODT.setText(".odt");
			checkboxODT.setOpaque(false);
		}
		return checkboxODT;
	}
	
	private JCheckBox getCheckboxTXT() {
		if(checkboxTXT == null) {
			checkboxTXT = new JCheckBox();
			checkboxTXT.setText(".txt");
			checkboxTXT.setOpaque(false);
		}
		return checkboxTXT;
	}
	
	private JCheckBox getCheckboxDOC() {
		if(checkboxDOC == null) {
			checkboxDOC = new JCheckBox();
			checkboxDOC.setText(".doc");
			checkboxDOC.setOpaque(false);
		}
		return checkboxDOC;
	}
	
	private JCheckBox getCheckboxDOCX() {
		if(checkboxDOCX == null) {
			checkboxDOCX = new JCheckBox();
			checkboxDOCX.setText(".docx");
			checkboxDOCX.setOpaque(false);
		}
		return checkboxDOCX;
	}
	
	private JCheckBox getCheckboxRTF() {
		if(checkboxRTF == null) {
			checkboxRTF = new JCheckBox();
			checkboxRTF.setText(".rtf");
			checkboxRTF.setOpaque(false);
		}
		return checkboxRTF;
	}
	
	private JCheckBox getCheckboxPDF() {
		if(checkboxPDF == null) {
			checkboxPDF = new JCheckBox();
			checkboxPDF.setText(".pdf");
			checkboxPDF.setOpaque(false);
		}
		return checkboxPDF;
	}
	
	private JLabel getJLabel8() {
		if(jLabel8 == null) {
			jLabel8 = new JLabel();
			jLabel8.setText("Códigos Fonte");
		}
		return jLabel8;
	}
	
	private JCheckBox getCheckboxC() {
		if(checkboxC == null) {
			checkboxC = new JCheckBox();
			checkboxC.setText(".c");
			checkboxC.setOpaque(false);
		}
		return checkboxC;
	}
	
	private JCheckBox getCheckboxPY() {
		if(checkboxPY == null) {
			checkboxPY = new JCheckBox();
			checkboxPY.setText(".py");
			checkboxPY.setOpaque(false);
		}
		return checkboxPY;
	}
	
	private JCheckBox getCheckboxJAVA() {
		if(checkboxJAVA == null) {
			checkboxJAVA = new JCheckBox();
			checkboxJAVA.setText(".java");
			checkboxJAVA.setOpaque(false);
		}
		return checkboxJAVA;
	}
	
	private JLabel getJLabel9() {
		if(jLabel9 == null) {
			jLabel9 = new JLabel();
			jLabel9.setText("Planilhas");
		}
		return jLabel9;
	}
	
	private JCheckBox getCheckboxODS() {
		if(checkboxODS == null) {
			checkboxODS = new JCheckBox();
			checkboxODS.setText(".ods");
			checkboxODS.setOpaque(false);
		}
		return checkboxODS;
	}
	
	private JCheckBox getCheckboxXLS() {
		if(checkboxXLS == null) {
			checkboxXLS = new JCheckBox();
			checkboxXLS.setText(".xls");
			checkboxXLS.setOpaque(false);
		}
		return checkboxXLS;
	}
	
	private JCheckBox getCheckboxXLSX() {
		if(checkboxXLSX == null) {
			checkboxXLSX = new JCheckBox();
			checkboxXLSX.setText(".xlsx");
			checkboxXLSX.setOpaque(false);
		}
		return checkboxXLSX;
	}
	
	private JLabel getJLabel10() {
		if(jLabel10 == null) {
			jLabel10 = new JLabel();
			jLabel10.setText("Outros (adicione separado por \";\")");
		}
		return jLabel10;
	}
	
	private JTextField getOutrosTipos() {
		if(outrosTipos == null) {
			outrosTipos = new JTextField();
		}
		return outrosTipos;
	}
	
	private JCheckBox getCheckboxSelecionarTudo() {
		if(checkboxSelecionarTudo == null) {
			checkboxSelecionarTudo = new JCheckBox();
			checkboxSelecionarTudo.setText("Selecionar Tudo");
			checkboxSelecionarTudo.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent evt) {
					checkboxSelecionarTudoStateChanged(evt);
				}
			});
		}
		return checkboxSelecionarTudo;
	}
	
	private void checkboxSelecionarTudoStateChanged(ChangeEvent evt) {
		checkboxC.setSelected(checkboxSelecionarTudo.isSelected());
		checkboxDOC.setSelected(checkboxSelecionarTudo.isSelected());
		checkboxDOCX.setSelected(checkboxSelecionarTudo.isSelected());
		checkboxJAVA.setSelected(checkboxSelecionarTudo.isSelected());
		checkboxODS.setSelected(checkboxSelecionarTudo.isSelected());
		checkboxODT.setSelected(checkboxSelecionarTudo.isSelected());
		checkboxPDF.setSelected(checkboxSelecionarTudo.isSelected());
		checkboxPY.setSelected(checkboxSelecionarTudo.isSelected());
		checkboxRTF.setSelected(checkboxSelecionarTudo.isSelected());
		checkboxTXT.setSelected(checkboxSelecionarTudo.isSelected());
		checkboxXLS.setSelected(checkboxSelecionarTudo.isSelected());
		checkboxXLSX.setSelected(checkboxSelecionarTudo.isSelected());
	}
	
	private void botaoConfigurarDiretorioMouseClicked(MouseEvent evt) {
		chooser = new JFileChooser(); 
	    chooser.setCurrentDirectory(new java.io.File("."));
	    chooser.setDialogTitle("Selecione o diretório da indexação");
	    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

	    chooser.setAcceptAllFileFilterUsed(false);

	    if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) { 
	    	labelNomeDiretorio.setText(chooser.getSelectedFile().toString());
	      }
	}

}
