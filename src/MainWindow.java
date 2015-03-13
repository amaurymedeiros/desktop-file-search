import java.awt.Container;
import java.awt.Desktop;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SpinnerNumberModel;
import javax.swing.WindowConstants;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import net.sf.nachocalendar.CalendarFactory;
import net.sf.nachocalendar.components.DateField;

import org.apache.lucene.index.CorruptIndexException;
import org.apache.lucene.index.IndexNotFoundException;
import org.apache.lucene.store.LockObtainFailedException;
import org.apache.lucene.store.NoSuchDirectoryException;

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
	private JScrollPane scrollResultados;
	private JCheckBox checkBoxFiltraTipo;
	private JLabel labelResultados;
	private JCheckBox checkboxSelecionarTudo;
	private JCheckBox checkboxXLSX;
	private JCheckBox checkboxXLS;
	private JCheckBox checkboxODS;
	private JLabel jLabel9;
	private JCheckBox checkboxJAVA;
	private JCheckBox checkboxPY;
	private JCheckBox checkboxC;
	private JLabel jLabel8;
	private JCheckBox checkboxPDF;
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
	private List<ResultadoDeBusca> resultados;

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
		this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		
		this.addWindowListener(new WindowAdapter()  
	      {  
	         public void windowClosing (WindowEvent e)  
	         {  
	            int resposta = JOptionPane.showConfirmDialog(null,"Deseja finalizar o PCS Desktop Searcher?","Finalizar",JOptionPane.YES_NO_OPTION);  
	            if (resposta == 0)  
	             {  
	               System.exit(0);  
	            }  
	         }  
	      }); 
		
	}
	
	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			this.setFont(new java.awt.Font("Catull",0,18));
            this.setIconImage(new ImageIcon("img/PCS.png").getImage());
            this.setTitle("PCS Desktop Searcher");
            {
                panel = new JPanel();
				GroupLayout panelLayout = new GroupLayout(panel);
				panel.setLayout(panelLayout);
				panel.setOpaque(false);
				{
					labelResultadoPagina = new JLabel();
					labelResultadoPagina.setText("Numero M�ximo de Resultados");
				}
				{
					numeroResultados = new JSpinner(new SpinnerNumberModel(10, 1, 100, 1));

				}
						panelLayout.setHorizontalGroup(panelLayout.createSequentialGroup()
					.addComponent(labelResultadoPagina, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addComponent(numeroResultados, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(0, 8, GroupLayout.PREFERRED_SIZE));
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
					labelDiretorio.setText("Diretorio a Indexar:");
					labelDiretorio.setFont(new java.awt.Font("Tahoma",1,14));
				}
				{
					labelNomeDiretorio = new JLabel();
					if(System.getProperty("user.dir").contains("/"))
						labelNomeDiretorio.setText(System.getProperty("user.dir")+"/colecao");
					else
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
					Inicio.setText("Inicio");
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
				labelTitulo.setIcon(new ImageIcon("img/header.png"));
			}
			{
				jLabel2 = new JLabel();
				jLabel2.setIcon(new ImageIcon("img/PCS.png"));
			}
			{
				botaoReindexar = new JButton();
				botaoReindexar.setText("Reindexar Colecao");
				botaoReindexar.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						try {
							botaoReindexarMouseClicked(evt);
						} catch (CorruptIndexException e) {
							e.printStackTrace();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				});
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
							e.printStackTrace();
						} catch (IOException e) {
							e.printStackTrace();
						} catch (ParseException e) {
							e.printStackTrace();
						} catch (org.apache.lucene.queryParser.ParseException e) {
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
				                .addGroup(thisLayout.createParallelGroup()
				                    .addComponent(getCheckBoxFiltraTipo(), GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
				                    .addComponent(Tipos, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				                .addComponent(getPanelTipos(), GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)))))
				.addGap(22)
				.addComponent(getLabelResultados(), GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(getScrollResultados(), 0, 214, Short.MAX_VALUE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup()
				    .addComponent(jLabel2, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addGap(34)
				        .addComponent(botaoReindexar, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
				.addContainerGap());
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addGap(7)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(thisLayout.createSequentialGroup()
				        .addGroup(thisLayout.createParallelGroup()
				            .addComponent(areaPesquisa, GroupLayout.Alignment.LEADING, 0, 911, Short.MAX_VALUE)
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(botaoReindexar, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 783, Short.MAX_VALUE)))
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				        .addGroup(thisLayout.createParallelGroup()
				            .addComponent(jLabel2, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
				            .addComponent(botaoPesquisar, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(panelDiretorio, GroupLayout.PREFERRED_SIZE, 1000, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 18, Short.MAX_VALUE))
				    .addComponent(getScrollResultados(), GroupLayout.Alignment.LEADING, 0, 1018, Short.MAX_VALUE)
				    .addGroup(thisLayout.createSequentialGroup()
				        .addGap(7)
				        .addGroup(thisLayout.createParallelGroup()
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addGroup(thisLayout.createParallelGroup()
				                    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                        .addComponent(Tipos, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				                        .addGap(7)
				                        .addComponent(getCheckBoxFiltraTipo(), GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
				                    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                        .addGap(18)
				                        .addComponent(getLabelResultados(), GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
				                        .addGap(14)))
				                .addGap(0, 187, Short.MAX_VALUE)
				                .addComponent(labelTitulo, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				                .addGap(190))
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(getPanelTipos(), GroupLayout.PREFERRED_SIZE, 351, GroupLayout.PREFERRED_SIZE)
				                .addGap(33)
				                .addComponent(panel, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
				                .addGap(50)
				                .addComponent(panelData, GroupLayout.PREFERRED_SIZE, 346, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 0, Short.MAX_VALUE)))
				        .addGap(12)))
				.addGap(7));
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
						helpMenuItem.setText("About");
						helpMenuItem.addActionListener(new ActionListener() {
				            public void actionPerformed(ActionEvent event) {
				                AboutWindow w = new AboutWindow();
				                centerAndShow(w);
				            }

				        });
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
	
	
	private void botaoReindexarMouseClicked(MouseEvent evt) throws CorruptIndexException, IOException {
		final Facade f = new Facade();
		final String[] tiposSuportados = { "txt", "pdf", "doc", "docx", "py", "c", "cpp",
				"java", "ppt", ".xls", ".xlsx", ".ods" };
		final Dialog pBar = new Dialog(this);
		pBar.setSize(300, 100);
		JProgressBar progress = new JProgressBar(0, 100);
	    progress.setIndeterminate(true);
	    Border border = BorderFactory.createTitledBorder("Indexando...");
	    progress.setBorder(border);
	    pBar.add(progress);
	    pBar.setModal(true);
	    
	    Thread t1 = new Thread() {  
	        public void run() {  
	        	try {
					f.index(labelNomeDiretorio.getText(), tiposSuportados);
				} catch (CorruptIndexException e) {
					e.printStackTrace();
				} catch (LockObtainFailedException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
	        	pBar.setVisible(false);
	        }  
	      };  
		t1.start();
		centerAndShow(pBar);  
	}
	
	private void botaoPesquisarMouseClicked(MouseEvent evt) throws CorruptIndexException, IOException, ParseException, org.apache.lucene.queryParser.ParseException {
		if(areaPesquisa.getText().length() < 1) {
			JOptionPane.showMessageDialog(new JFrame(), "Digite a expressao a ser pesquisada", 
					"Erro",
			        JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		System.out.println("Sem filtros: "+semFiltros());
		if(checkBoxFiltraTipo.isSelected() && semFiltros()) {
			JOptionPane.showMessageDialog(new JFrame(), "Selecione algum filtro e realize a pesquisa", 
					"Erro",
			        JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		
		String busca = areaPesquisa.getText();
		String[] tipos = checkBoxFiltraTipo.isSelected() ? montaTipos() : new String[0];
		System.out.println(tipos.length);
		Date valorDataInicial = null;
		Date valorDataFinal = null;
		
		if(checkFiltraData.isSelected()) {
			valorDataInicial = getDateInicial();
			valorDataFinal = getDateFinal();
		}
		
		int hitsPerPage = (Integer) numeroResultados.getValue();
		
		Facade f = new Facade();
		try{
			resultados = f.search(tipos, hitsPerPage, valorDataInicial, valorDataFinal, busca);
		} catch (IndexNotFoundException e) {
			JOptionPane.showMessageDialog(this,"Sua colecao ainda nao foi indexada.","Alerta",javax.swing.JOptionPane.WARNING_MESSAGE);
			return;
		} catch (NoSuchDirectoryException e) {
			JOptionPane.showMessageDialog(this,"Sua colecao ainda nao foi indexada.","Alerta",javax.swing.JOptionPane.WARNING_MESSAGE);
			return;
		}
				
		String[] data = new String[resultados.size()];
		for(int i = 0; i < resultados.size(); i++) {			
			data[i] = resultados.get(i).getPath();
		}
		String[] semResultados = {"Nenhum Resultado Encontrado"};
		
		areaResultados.setListData(data);
		
		if(resultados.size() < 1) {
			areaResultados.setListData(semResultados);
		}
		
		if(resultados.size() > 0 ) {
			areaResultados.setEnabled(true);
		}
		
		else {
			areaResultados.setEnabled(false);
		}
	}

	private boolean semFiltros() {
		for(JCheckBox j : listaCheckBoxes) {
			if(j.isSelected()) {				
				return false;
			}
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
			panelTiposLayout.setVerticalGroup(panelTiposLayout.createSequentialGroup()
				.addGroup(panelTiposLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(getCheckboxODT(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(getLabelDocs(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(getCheckboxTXT(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(getCheckboxDOCX(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
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
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 42, GroupLayout.PREFERRED_SIZE)
				.addComponent(getCheckboxSelecionarTudo(), GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE));
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
				        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				        .addComponent(getCheckboxPDF(), GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 0, Short.MAX_VALUE))
				    .addGroup(GroupLayout.Alignment.LEADING, panelTiposLayout.createSequentialGroup()
				        .addGap(168)
				        .addGroup(panelTiposLayout.createParallelGroup()
				            .addGroup(GroupLayout.Alignment.LEADING, panelTiposLayout.createSequentialGroup()
				                .addComponent(getCheckboxDOC(), GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 152, Short.MAX_VALUE))
				            .addGroup(GroupLayout.Alignment.LEADING, panelTiposLayout.createSequentialGroup()
				                .addComponent(getCheckboxXLSX(), GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 144, Short.MAX_VALUE)))
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
				.addContainerGap(22, 22));
		}
		return panelTipos;
	}
	
	private JLabel getLabelDocs() {
		if(labelDocs == null) {
			labelDocs = new JLabel();
			labelDocs.setText("Documentos");
			labelDocs.setEnabled(false);
			labelDoc.setEnabled(false);
		}
		return labelDocs;
	}
	
	private JCheckBox getCheckboxODT() {
		if(checkboxODT == null) {
			checkboxODT = new JCheckBox();
			checkboxODT.setText(".odt");
			checkboxODT.setOpaque(false);
			checkboxODT.setEnabled(false);
		}
		return checkboxODT;
	}
	
	private JCheckBox getCheckboxTXT() {
		if(checkboxTXT == null) {
			checkboxTXT = new JCheckBox();
			checkboxTXT.setText(".txt");
			checkboxTXT.setOpaque(false);
			checkboxTXT.setEnabled(false);
		}
		return checkboxTXT;
	}
	
	private JCheckBox getCheckboxDOC() {
		if(checkboxDOC == null) {
			checkboxDOC = new JCheckBox();
			checkboxDOC.setText(".doc");
			checkboxDOC.setOpaque(false);
			checkboxDOC.setEnabled(false);
		}
		return checkboxDOC;
	}
	
	private JCheckBox getCheckboxDOCX() {
		if(checkboxDOCX == null) {
			checkboxDOCX = new JCheckBox();
			checkboxDOCX.setText(".docx");
			checkboxDOCX.setOpaque(false);
			checkboxDOCX.setEnabled(false);
		}
		return checkboxDOCX;
	}
	
	private JCheckBox getCheckboxPDF() {
		if(checkboxPDF == null) {
			checkboxPDF = new JCheckBox();
			checkboxPDF.setText(".pdf");
			checkboxPDF.setOpaque(false);
			checkboxPDF.setEnabled(false);
		}
		return checkboxPDF;
	}
	
	private JLabel getJLabel8() {
		if(jLabel8 == null) {
			jLabel8 = new JLabel();
			jLabel8.setText("Codigos Fonte");
			jLabel8.setEnabled(false);
			jLabel8.setEnabled(false);
		}
		return jLabel8;
	}
	
	private JCheckBox getCheckboxC() {
		if(checkboxC == null) {
			checkboxC = new JCheckBox();
			checkboxC.setText(".c");
			checkboxC.setOpaque(false);
			checkboxC.setEnabled(false);
		}
		return checkboxC;
	}
	
	private JCheckBox getCheckboxPY() {
		if(checkboxPY == null) {
			checkboxPY = new JCheckBox();
			checkboxPY.setText(".py");
			checkboxPY.setOpaque(false);
			checkboxPY.setEnabled(false);
		}
		return checkboxPY;
	}
	
	private JCheckBox getCheckboxJAVA() {
		if(checkboxJAVA == null) {
			checkboxJAVA = new JCheckBox();
			checkboxJAVA.setText(".java");
			checkboxJAVA.setOpaque(false);
			checkboxJAVA.setEnabled(false);
		}
		return checkboxJAVA;
	}
	
	private JLabel getJLabel9() {
		if(jLabel9 == null) {
			jLabel9 = new JLabel();
			jLabel9.setText("Planilhas");
			jLabel9.setEnabled(false);
			jLabel9.setEnabled(false);
		}
		return jLabel9;
	}
	
	private JCheckBox getCheckboxODS() {
		if(checkboxODS == null) {
			checkboxODS = new JCheckBox();
			checkboxODS.setText(".ods");
			checkboxODS.setOpaque(false);
			checkboxODS.setEnabled(false);
		}
		return checkboxODS;
	}
	
	private JCheckBox getCheckboxXLS() {
		if(checkboxXLS == null) {
			checkboxXLS = new JCheckBox();
			checkboxXLS.setText(".xls");
			checkboxXLS.setOpaque(false);
			checkboxXLS.setEnabled(false);
		}
		return checkboxXLS;
	}
	
	private JCheckBox getCheckboxXLSX() {
		if(checkboxXLSX == null) {
			checkboxXLSX = new JCheckBox();
			checkboxXLSX.setText(".xlsx");
			checkboxXLSX.setOpaque(false);
			checkboxXLSX.setEnabled(false);
		}
		return checkboxXLSX;
	}

	private JCheckBox getCheckboxSelecionarTudo() {
		if(checkboxSelecionarTudo == null) {
			checkboxSelecionarTudo = new JCheckBox();
			checkboxSelecionarTudo.setText("Selecionar Tudo");
			checkboxSelecionarTudo.setOpaque(false);
			checkboxSelecionarTudo.setEnabled(false);
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
		checkboxTXT.setSelected(checkboxSelecionarTudo.isSelected());
		checkboxXLS.setSelected(checkboxSelecionarTudo.isSelected());
		checkboxXLSX.setSelected(checkboxSelecionarTudo.isSelected());
	}
	
	private void botaoConfigurarDiretorioMouseClicked(MouseEvent evt) {
		chooser = new JFileChooser(); 
	    chooser.setCurrentDirectory(new java.io.File("."));
	    chooser.setDialogTitle("Selecione o diret�rio da indexa��o");
	    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

	    chooser.setAcceptAllFileFilterUsed(false);

	    if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) { 
	    	labelNomeDiretorio.setText(chooser.getSelectedFile().toString());
	      }
	}
	
	private JLabel getLabelResultados() {
		if(labelResultados == null) {
			labelResultados = new JLabel();
			labelResultados.setText("Resultados");
			labelResultados.setFont(new java.awt.Font("Tahoma",1,14));
		}
		return labelResultados;
	}
	
	private void areaResultadosMouseClicked(MouseEvent evt) {
		if (areaResultados.getSelectedValue() != null){
			JFrame detalhes = new JFrame("Detalhes");
			detalhes.setIconImage(new ImageIcon(getClass().getClassLoader().getResource("img/PCS.png")).getImage());
			detalhes.setSize(600, 400);
			detalhes.setFont(new java.awt.Font("Tahoma",0,14));
			detalhes.setResizable(false);		
			
			Container contentPane = detalhes.getContentPane();
			BoxLayout vBox = new BoxLayout(contentPane, 1);
			contentPane.setLayout(vBox);
			
			Container inner = new Container();
			inner.setFont(new java.awt.Font("Tahoma",0,14));
			BoxLayout hBox = new BoxLayout(inner, 0);
			inner.setLayout(hBox);
			
			contentPane.add(inner);
			
			final String path = resultados.get(areaResultados.getSelectedIndex()).getPath();
			inner.add(new JLabel("Arquivo: " +  getFilename(path) + "        "));
			
			JButton abrirArquivo = new JButton("Abrir arquivo");
			
			abrirArquivo.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent evt) {
					try {
						abrirArquivoMouseClicked(evt, path);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			});
			inner.add(abrirArquivo);
			
			JTextArea sumario = new JTextArea(resultados.get(areaResultados.getSelectedIndex()).getSumario());
			JScrollPane scroll = new JScrollPane(sumario); 
			contentPane.add(scroll);
			
			centerAndShow(detalhes);
		}
	}
	
	private String getFilename(String path) {		
		  File file = new File(path);		  
		  return file.getName();
	}
	
	private void abrirArquivoMouseClicked(MouseEvent evt, String path) throws IOException {
		File file = new File(path);
		Desktop desktop = null;
		if (Desktop.isDesktopSupported()) {
	        desktop  = Desktop.getDesktop();
	        desktop.open(file);
		}
		System.out.println("abrir o arquivo que esta aqui: " + path);
	}
	
	private JCheckBox getCheckBoxFiltraTipo() {
		if(checkBoxFiltraTipo == null) {
			checkBoxFiltraTipo = new JCheckBox();
			checkBoxFiltraTipo.setOpaque(false);
			checkBoxFiltraTipo.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent evt) {
					checkBoxFiltraTipoStateChanged(evt);
				}
			});
		}
		return checkBoxFiltraTipo;
	}
	
	private void checkBoxFiltraTipoStateChanged(ChangeEvent evt) {
		checkboxC.setEnabled(checkBoxFiltraTipo.isSelected());
		checkboxC.setSelected(false);
		checkboxDOC.setEnabled(checkBoxFiltraTipo.isSelected());
		checkboxDOC.setSelected(false);
		checkboxDOCX.setEnabled(checkBoxFiltraTipo.isSelected());
		checkboxDOCX.setSelected(false);
		checkboxJAVA.setEnabled(checkBoxFiltraTipo.isSelected());
		checkboxJAVA.setSelected(false);
		checkboxODS.setEnabled(checkBoxFiltraTipo.isSelected());
		checkboxODS.setSelected(false);
		checkboxODT.setEnabled(checkBoxFiltraTipo.isSelected());
		checkboxODT.setSelected(false);
		checkboxPDF.setEnabled(checkBoxFiltraTipo.isSelected());
		checkboxPDF.setSelected(false);
		checkboxPY.setEnabled(checkBoxFiltraTipo.isSelected());
		checkboxPY.setSelected(false);
		checkboxTXT.setEnabled(checkBoxFiltraTipo.isSelected());
		checkboxSelecionarTudo.setSelected(false);
		checkboxTXT.setSelected(false);
		checkboxXLS.setEnabled(checkBoxFiltraTipo.isSelected());
		checkboxXLS.setSelected(false);
		checkboxXLSX.setEnabled(checkBoxFiltraTipo.isSelected());
		checkboxXLSX.setSelected(false);
		jLabel8.setEnabled(checkBoxFiltraTipo.isSelected());
		jLabel9.setEnabled(checkBoxFiltraTipo.isSelected());
		labelDocs.setEnabled(checkBoxFiltraTipo.isSelected());
		checkboxSelecionarTudo.setEnabled(checkBoxFiltraTipo.isSelected());
	}
	
	public static void centerAndShow(Window aWindow){
	    
	    aWindow.pack();

	    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
	    Dimension window = aWindow.getSize();

	    int xCoord = (screen.width/2 - window.width/2);
	    int yCoord = (screen.height/2 - window.height/2);
	    aWindow.setLocation( xCoord, yCoord );
	   
	    aWindow.show();
	  }
	
	private JScrollPane getScrollResultados() {
		if(scrollResultados == null) {
			scrollResultados = new JScrollPane(areaResultados);
			{
				areaResultados = new JList();
				scrollResultados.setViewportView(areaResultados);
				areaResultados.setFont(new java.awt.Font("Tahoma",0,14));
				areaResultados.setBackground(new java.awt.Color(255,255,255));
				areaResultados.setOpaque(false);
				areaResultados.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						areaResultadosMouseClicked(evt);
					}
				});
			}
		}
		return scrollResultados;
	}

}
