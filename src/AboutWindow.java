
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
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
public class AboutWindow extends javax.swing.JDialog {

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private JLabel labelPCS;
	private JPanel panelInfos;
	private JLabel labelUniversidade;
	private JLabel jLabel5;
	private JLabel labelNome;
	private JButton buttonOK;
	private JLabel jLabel6;
	private JLabel jLabel4;
	private JLabel jLabel3;
	private JLabel labelAmaury;
	private JLabel labelEquipe;
	private JLabel jLabel2;
	private JLabel jLabel1;

	/**
	* Auto-generated main method to display this JDialog
	*/
	public static void main(String[] args) {

	}
	
	public AboutWindow() {
		initGUI();
		this.setIconImage(new ImageIcon(getClass().getClassLoader().getResource("img/PCS.png")).getImage());
	}
	
	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			{
				labelPCS = new JLabel();
				labelPCS.setIcon(new ImageIcon(getClass().getClassLoader().getResource("img/PCS.png")));
			}
			{
				panelInfos = new JPanel();
				GroupLayout panelInfosLayout = new GroupLayout((JComponent)panelInfos);
				panelInfos.setLayout(panelInfosLayout);
				panelInfos.setOpaque(false);
				{
					labelUniversidade = new JLabel();
					labelUniversidade.setText("Universidade Federal de Campina Grande");
					labelUniversidade.setFont(new java.awt.Font("Tahoma",0,14));
				}
				{
					jLabel1 = new JLabel();
					jLabel1.setText("Sistemas de Recuperação da Informação");
					jLabel1.setFont(new java.awt.Font("Tahoma",0,12));
				}
				{
					jLabel2 = new JLabel();
					jLabel2.setText("Acompanhamento: Professor Leandro Balby Marinho");
					jLabel2.setFont(new java.awt.Font("Tahoma",0,12));
				}
				{
					jLabel6 = new JLabel();
					jLabel6.setText("Paulo Victor");
				}
				{
					buttonOK = new JButton();
					buttonOK.setText("OK");
					buttonOK.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent evt) {
							buttonOKMouseClicked(evt);
						}
					});
				}
				{
					jLabel3 = new JLabel();
					jLabel3.setText("Danilo Freitas");
				}
				{
					jLabel4 = new JLabel();
					jLabel4.setText("Felipe Vieira");
				}
				{
					jLabel5 = new JLabel();
					jLabel5.setText("Jonathan Brilhante");
				}
				{
					labelEquipe = new JLabel();
					labelEquipe.setText("Equipe");
					labelEquipe.setFont(new java.awt.Font("Tahoma",0,14));
				}
				{
					labelAmaury = new JLabel();
					labelAmaury.setText("Amaury Medeiros");
				}
				panelInfosLayout.setHorizontalGroup(panelInfosLayout.createSequentialGroup()
					.addContainerGap(26, 26)
					.addGroup(panelInfosLayout.createParallelGroup()
					    .addGroup(GroupLayout.Alignment.LEADING, panelInfosLayout.createSequentialGroup()
					        .addComponent(jLabel2, 0, 308, Short.MAX_VALUE)
					        .addGap(19))
					    .addGroup(panelInfosLayout.createSequentialGroup()
					        .addPreferredGap(jLabel2, labelUniversidade, LayoutStyle.ComponentPlacement.INDENT)
					        .addGroup(panelInfosLayout.createParallelGroup()
					            .addGroup(GroupLayout.Alignment.LEADING, panelInfosLayout.createSequentialGroup()
					                .addComponent(labelUniversidade, 0, 257, Short.MAX_VALUE)
					                .addGap(60))
					            .addGroup(GroupLayout.Alignment.LEADING, panelInfosLayout.createSequentialGroup()
					                .addPreferredGap(labelUniversidade, jLabel1, LayoutStyle.ComponentPlacement.INDENT)
					                .addGroup(panelInfosLayout.createParallelGroup()
					                    .addComponent(jLabel1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
					                    .addGroup(panelInfosLayout.createSequentialGroup()
					                        .addGap(70)
					                        .addGroup(panelInfosLayout.createParallelGroup()
					                            .addComponent(jLabel5, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					                            .addComponent(labelAmaury, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
					                            .addGroup(panelInfosLayout.createSequentialGroup()
					                                .addPreferredGap(jLabel5, jLabel6, LayoutStyle.ComponentPlacement.INDENT)
					                                .addGroup(panelInfosLayout.createParallelGroup()
					                                    .addGroup(GroupLayout.Alignment.LEADING, panelInfosLayout.createSequentialGroup()
					                                        .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					                                        .addGap(10))
					                                    .addGroup(GroupLayout.Alignment.LEADING, panelInfosLayout.createSequentialGroup()
					                                        .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
					                                        .addGap(13))
					                                    .addComponent(jLabel3, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
					                                    .addGroup(GroupLayout.Alignment.LEADING, panelInfosLayout.createSequentialGroup()
					                                        .addPreferredGap(jLabel6, labelEquipe, LayoutStyle.ComponentPlacement.INDENT)
					                                        .addComponent(labelEquipe, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
					                                        .addGap(18)))
					                                .addGap(9)))
					                        .addGap(65)))
					                .addGap(0, 8, Short.MAX_VALUE)
					                .addComponent(buttonOK, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))))));
				panelInfosLayout.setVerticalGroup(panelInfosLayout.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(labelUniversidade, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 0, GroupLayout.PREFERRED_SIZE)
					.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, 1, GroupLayout.PREFERRED_SIZE)
					.addComponent(labelEquipe, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(labelAmaury, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addComponent(buttonOK, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap());
			}
			{
				labelNome = new JLabel();
				labelNome.setText("PCS Desktop Search");
				labelNome.setFont(new java.awt.Font("Tahoma",0,20));
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addGap(6)
				.addComponent(labelPCS, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(labelNome, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(panelInfos, 0, 245, Short.MAX_VALUE));
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addContainerGap(31, 31)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(thisLayout.createSequentialGroup()
				        .addComponent(panelInfos, GroupLayout.PREFERRED_SIZE, 344, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 0, Short.MAX_VALUE))
				    .addGroup(thisLayout.createSequentialGroup()
				        .addGap(76)
				        .addGroup(thisLayout.createParallelGroup()
				            .addGroup(thisLayout.createSequentialGroup()
				                .addComponent(labelNome, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 0, Short.MAX_VALUE))
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addGap(36)
				                .addComponent(labelPCS, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 46, Short.MAX_VALUE)))
				        .addGap(73)))
				.addContainerGap(17, 17));
			this.setSize(400, 392);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void buttonOKMouseClicked(MouseEvent evt) {
		this.setVisible(false);
	}

}
