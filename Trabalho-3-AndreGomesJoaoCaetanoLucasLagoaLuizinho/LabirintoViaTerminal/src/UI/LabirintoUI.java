package UI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;
import org.json.simple.parser.ParseException;
import code.*;

public class LabirintoUI extends javax.swing.JFrame{
    public LabirintoUI(Player jogador,Ambiente ambiente) {
        this.ambiente = ambiente;
        this.jogador = jogador;
    	initComponents();
        setValue(ambiente.getSalas()[jogador.getLocalizacao()]);
    }
    private void initComponents() {
        jPanel1 = new JPanel();
        goldView = new javax.swing.JButton();
        diamondView = new javax.swing.JButton();
        troll0view = new javax.swing.JButton();
        potionView = new javax.swing.JButton();
        keyView = new javax.swing.JButton();
        playerView = new javax.swing.JLabel();
        doorAView = new javax.swing.JButton();
        doorBView = new javax.swing.JButton();
        doorCView = new javax.swing.JButton();
        doorDView = new javax.swing.JButton();
        troll1View = new javax.swing.JButton();
        troll2View = new javax.swing.JButton();
        AxeView = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        sizeLabelRoom = new javax.swing.JLabel();
        goldLabelRoom = new javax.swing.JLabel();
        diamondLabelRoom = new javax.swing.JLabel();
        goldAxeLabelRoom = new javax.swing.JLabel();
        potionLabelRoom = new javax.swing.JLabel();
        keyLabelRoom = new javax.swing.JLabel();
        trollLabelRoom = new javax.swing.JLabel();
        sizeValueRoom = new javax.swing.JLabel();
        goldValueRoom = new javax.swing.JLabel();
        diamondValueRoom = new javax.swing.JLabel();
        goldAxeValueRoom = new javax.swing.JLabel();
        potionValueRoom = new javax.swing.JLabel();
        keyValueRoom = new javax.swing.JLabel();
        trollValueRoom = new javax.swing.JLabel();
        bronzeAxeLabelRoom = new javax.swing.JLabel();
        ironAxeLabelRoom = new javax.swing.JLabel();
        bronzeAxeValueRoom = new javax.swing.JLabel();
        ironAxeValueRoom = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        goldDrop = new javax.swing.JButton();
        diamondDrop = new javax.swing.JButton();
        axeDrop = new javax.swing.JButton();
        keyDrop = new javax.swing.JButton();
        ironAxeDrop = new javax.swing.JButton();
        potionDrop = new javax.swing.JButton();
        bronzeAxeDrop = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        diamondLabelInventory = new javax.swing.JLabel();
        potionLabelInventory = new javax.swing.JLabel();
        keyLabelInventory = new javax.swing.JLabel();
        goldLabelInventory = new javax.swing.JLabel();
        goldAxeLabelInventory = new javax.swing.JLabel();
        goldValueInventory = new javax.swing.JLabel();
        diamondValueInventory = new javax.swing.JLabel();
        goldAxeValueInventory = new javax.swing.JLabel();
        potionValueInventory = new javax.swing.JLabel();
        keyValueInventory = new javax.swing.JLabel();
        bronzeAxeLabelInventory = new javax.swing.JLabel();
        ironAxeLabelInventory = new javax.swing.JLabel();
        bronzeAxeValueInventory = new javax.swing.JLabel();
        ironAxeValueInventory = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "View", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        jPanel1.setLayout(null);

        goldView.setText("Gold");
        jPanel1.add(goldView);
        goldView.setBounds(130, 20, 94, 25);

        diamondView.setText("Diamond");
        jPanel1.add(diamondView);
        diamondView.setBounds(230, 20, 110, 25);

        troll0view.setText("Troll");
        jPanel1.add(troll0view);
        troll0view.setBounds(70, 60, 100, 25);

        potionView.setText("Potion");
        jPanel1.add(potionView);
        potionView.setBounds(10, 170, 110, 25);

        keyView.setText("Key");
        jPanel1.add(keyView);
        keyView.setBounds(10, 200, 110, 25);

        playerView.setText("Player");
        jPanel1.add(playerView);
        playerView.setBounds(200, 370, 51, 15);

        doorAView.setText("DoorA");
        jPanel1.add(doorAView);
        doorAView.setBounds(317, 140, 100, 25);

        doorBView.setText("DoorB");
        jPanel1.add(doorBView);
        doorBView.setBounds(317, 180, 100, 25);

        doorCView.setText("DoorC");
        jPanel1.add(doorCView);
        doorCView.setBounds(317, 220, 100, 25);
        
        doorDView.setText("DoorD");
        jPanel1.add(doorDView);
        doorDView.setBounds(317, 260, 100, 25);

        troll1View.setText("Troll");
        jPanel1.add(troll1View);
        troll1View.setBounds(170, 60, 100, 25);

        troll2View.setText("Troll");
        jPanel1.add(troll2View);
        troll2View.setBounds(270, 60, 100, 25);

        AxeView.setText("Axe");
        jPanel1.add(AxeView);
        AxeView.setBounds(10, 140, 110, 25);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Room", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        sizeLabelRoom.setText("Tamanho:");

        goldLabelRoom.setText("Ouro:");

        diamondLabelRoom.setText("Diamante:");

        goldAxeLabelRoom.setText("GMachado:");

        potionLabelRoom.setText("Poção:");

        keyLabelRoom.setText("Chave:");

        trollLabelRoom.setText("Troll:");

        bronzeAxeLabelRoom.setText("BMachado:");

        ironAxeLabelRoom.setText("IMachado:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ironAxeLabelRoom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ironAxeValueRoom))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(bronzeAxeLabelRoom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bronzeAxeValueRoom))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(potionLabelRoom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(potionValueRoom))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(goldAxeLabelRoom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(goldAxeValueRoom))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(diamondLabelRoom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(diamondValueRoom))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(goldLabelRoom, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(sizeLabelRoom)
                                .addGap(14, 14, 14)))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sizeValueRoom)
                            .addComponent(goldValueRoom)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(keyLabelRoom)
                            .addComponent(trollLabelRoom))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(trollValueRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(keyValueRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sizeLabelRoom)
                    .addComponent(sizeValueRoom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goldLabelRoom)
                    .addComponent(goldValueRoom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diamondLabelRoom)
                    .addComponent(diamondValueRoom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goldAxeLabelRoom)
                    .addComponent(goldAxeValueRoom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bronzeAxeLabelRoom)
                    .addComponent(bronzeAxeValueRoom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ironAxeLabelRoom)
                    .addComponent(ironAxeValueRoom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(potionLabelRoom)
                    .addComponent(potionValueRoom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keyLabelRoom)
                    .addComponent(keyValueRoom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trollLabelRoom)
                    .addComponent(trollValueRoom))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Drop", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        goldDrop.setText("Gold");

        diamondDrop.setText("Diamond");

        axeDrop.setText("Axe");

        keyDrop.setText("Key");

        ironAxeDrop.setText("IronAxe");

        potionDrop.setText("Potion");

        bronzeAxeDrop.setText("BronzeAxe");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(axeDrop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(goldDrop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bronzeAxeDrop, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(potionDrop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(diamondDrop, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(ironAxeDrop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(keyDrop, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diamondDrop)
                    .addComponent(goldDrop))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(axeDrop)
                    .addComponent(potionDrop))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bronzeAxeDrop)
                    .addComponent(ironAxeDrop))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(keyDrop))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Inventory"));

        diamondLabelInventory.setText("Diamante:");

        potionLabelInventory.setText("Poção:");

        keyLabelInventory.setText("Chave:");

        goldLabelInventory.setText("Ouro:");

        goldAxeLabelInventory.setText("GMachado:");

        bronzeAxeLabelInventory.setText("BMachado:");

        ironAxeLabelInventory.setText("IMachado:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(ironAxeLabelInventory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ironAxeValueInventory))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(keyLabelInventory)
                                .addGap(53, 53, 53)
                                .addComponent(keyValueInventory))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(potionLabelInventory)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(potionValueInventory))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(goldAxeLabelInventory)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(goldAxeValueInventory))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(diamondLabelInventory)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(diamondValueInventory))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(goldLabelInventory)
                                    .addGap(61, 61, 61)
                                    .addComponent(goldValueInventory))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(bronzeAxeLabelInventory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bronzeAxeValueInventory)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bronzeAxeDrop.setVisible(false);
        ironAxeDrop.setVisible(false);
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goldLabelInventory)
                    .addComponent(goldValueInventory))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diamondLabelInventory)
                    .addComponent(diamondValueInventory))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goldAxeLabelInventory)
                    .addComponent(goldAxeValueInventory))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bronzeAxeLabelInventory)
                    .addComponent(bronzeAxeValueInventory))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ironAxeLabelInventory)
                    .addComponent(ironAxeValueInventory))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(potionLabelInventory)
                    .addComponent(potionValueInventory))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keyLabelInventory)
                    .addComponent(keyValueInventory))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Log", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        jLabel1.setText(" ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 214, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        keyView.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jogador.setObjetoProx("Chave");
            	jogador.pegarItens(ambiente.getSalas()[jogador.getLocalizacao()], "key");
            	jogador.setObjetoProx(" ");
            	setValue(ambiente.getSalas()[jogador.getLocalizacao()]);
			}
		});
        potionView.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				jogador.setObjetoProx("Pocao");
            	jogador.pegarItens(ambiente.getSalas()[jogador.getLocalizacao()], "potion");
            	jogador.setObjetoProx(" ");
            	setValue(ambiente.getSalas()[jogador.getLocalizacao()]);
			}
		});
        goldView.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				jogador.setObjetoProx("Gold");
            	jogador.pegarItens(ambiente.getSalas()[jogador.getLocalizacao()], "gold");
            	jogador.setObjetoProx(" ");
            	setValue(ambiente.getSalas()[jogador.getLocalizacao()]);
			}
		});
        diamondView.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				jogador.setObjetoProx("Diamante");
            	jogador.pegarItens(ambiente.getSalas()[jogador.getLocalizacao()], "diamond");
            	jogador.setObjetoProx(" ");
            	setValue(ambiente.getSalas()[jogador.getLocalizacao()]);
			}
		});
        AxeView.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				jogador.setObjetoProx("Machado");
            	jogador.pegarItens(ambiente.getSalas()[jogador.getLocalizacao()], "axe");
            	jogador.setObjetoProx(" ");
            	setValue(ambiente.getSalas()[jogador.getLocalizacao()]);
			}
		});
        diamondDrop.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jogador.setObjetoProx("Diamante");
				jogador.soltarItens(ambiente.getSalas()[jogador.getLocalizacao()], "diamond");
            	jogador.setObjetoProx(" ");
            	setValue(ambiente.getSalas()[jogador.getLocalizacao()]);
			}
		});
        goldDrop.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jogador.setObjetoProx("Gold");
				jogador.soltarItens(ambiente.getSalas()[jogador.getLocalizacao()], "gold");
            	jogador.setObjetoProx(" ");
				setValue(ambiente.getSalas()[jogador.getLocalizacao()]);
			}
		});
        ironAxeDrop.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jogador.setObjetoProx("Pocao");
				jogador.soltarItens(ambiente.getSalas()[jogador.getLocalizacao()], "potion");
            	jogador.setObjetoProx(" ");
				setValue(ambiente.getSalas()[jogador.getLocalizacao()]);
			}
		});
        keyDrop.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jogador.setObjetoProx("Chave");
				jogador.soltarItens(ambiente.getSalas()[jogador.getLocalizacao()], "key");
            	jogador.setObjetoProx(" ");
				setValue(ambiente.getSalas()[jogador.getLocalizacao()]);
			}
		});
        axeDrop.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jogador.getMachadoPlayer().size() != 0){
					jogador.setObjetoProx("Machado");
					jogador.soltarItens(ambiente.getSalas()[jogador.getLocalizacao()], "axe");
	            	jogador.setObjetoProx(" ");
					setValue(ambiente.getSalas()[jogador.getLocalizacao()]);
				}
			}
		});
        troll0view.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jogador.mandarMachado(ambiente.getSalas()[jogador.getLocalizacao()], troll0view.getText());
                setValue(ambiente.getSalas()[jogador.getLocalizacao()]);
            }
        });
        troll1View.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jogador.mandarMachado(ambiente.getSalas()[jogador.getLocalizacao()], troll1View.getText());
                setValue(ambiente.getSalas()[jogador.getLocalizacao()]);

            }
        });
        troll2View.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jogador.mandarMachado(ambiente.getSalas()[jogador.getLocalizacao()],troll2View.getText());
                setValue(ambiente.getSalas()[jogador.getLocalizacao()]);
            }
        });
        doorAView.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(ambiente.getSalas()[jogador.getLocalizacao()].getPortas().get(0).isStatus() == true){
					jogador.setObjetoProx(doorAView.getText());
					jogador.sairSala(ambiente.getSalas()[jogador.getLocalizacao()]);
					LabirintoUI.writeLog("SALA ATUAL:"+Integer.toString(jogador.getLocalizacao()));
					ambiente.getSalas()[jogador.getLocalizacao()].setPersonagem(true);
					ambiente.moverTroll();
					if (ambiente.getSalas()[jogador.getLocalizacao()].isAction() != 0) {
						jogador.sobAtaque(ambiente.getSalas()[jogador.getLocalizacao()]);
						ambiente.getSalas()[jogador.getLocalizacao()].setAction(0);
					}
				}else{
					jogador.setObjetoProx(doorAView.getText());
					if(jogador.getChavePlayer().getChave()>0){
						jogador.unlockDoor(ambiente.getSalas()[jogador.getLocalizacao()]);
						writeLog("Destrancou a porta clicada"+". SALA ATUAL:"+Integer.toString(jogador.getLocalizacao()));
					}
					jogador.setObjetoProx(" ");
				} if(ambiente.getSalas()[jogador.getLocalizacao()].equals(ambiente.getSalas().length-1)) { 
			        JOptionPane.showMessageDialog(null,"Parabéns, FIM DE JOGO\n"+"Ouro Arrecadado:" + jogador.getDinheiroAtual().getGold()+"\nDiamante Arrecadado: " + jogador.getDiamanteAtual().getDiamante());
					writeLog("Parabéns Fim de Jogo");
		            return;
				}
				setValue(ambiente.getSalas()[jogador.getLocalizacao()]);
				jogador.setObjetoProx(" ");
			}
		});
        doorBView.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(ambiente.getSalas()[jogador.getLocalizacao()].getPortas().get(1).isStatus() == true){
					jogador.setObjetoProx(doorBView.getText());
					jogador.sairSala(ambiente.getSalas()[jogador.getLocalizacao()]);
					LabirintoUI.writeLog("SALA ATUAL:"+Integer.toString(jogador.getLocalizacao()));
					ambiente.getSalas()[jogador.getLocalizacao()].setPersonagem(true);
					ambiente.moverTroll();
					if (ambiente.getSalas()[jogador.getLocalizacao()].isAction() != 0) {
						jogador.sobAtaque(ambiente.getSalas()[jogador.getLocalizacao()]);
						ambiente.getSalas()[jogador.getLocalizacao()].setAction(0);
					}
				}else{
					jogador.setObjetoProx(doorBView.getText());
					if(jogador.getChavePlayer().getChave()>0){
						jogador.unlockDoor(ambiente.getSalas()[jogador.getLocalizacao()]);
						writeLog("Destrancou a porta clicada"+". SALA ATUAL:"+Integer.toString(jogador.getLocalizacao()));
					}
					jogador.setObjetoProx(" ");
				} if(ambiente.getSalas()[jogador.getLocalizacao()].equals(ambiente.getSalas()[ambiente.getSalas().length-1])) { 
			        JOptionPane.showMessageDialog(null,"Parabéns, FIM DE JOGO\n"+"Ouro Arrecadado:" + jogador.getDinheiroAtual().getGold()+"\nDiamante Arrecadado: " + jogador.getDiamanteAtual().getDiamante());
					writeLog("Parabéns Fim de Jogo");
		            return;
				}
				setValue(ambiente.getSalas()[jogador.getLocalizacao()]);
				jogador.setObjetoProx(" ");
			}
		});
		doorCView.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				if(ambiente.getSalas()[jogador.getLocalizacao()].getPortas().get(2).isStatus() == true){
					jogador.setObjetoProx(doorCView.getText());
				
					jogador.sairSala(ambiente.getSalas()[jogador.getLocalizacao()]);
					LabirintoUI.writeLog("SALA ATUAL:"+Integer.toString(jogador.getLocalizacao()));
					ambiente.getSalas()[jogador.getLocalizacao()].setPersonagem(true);
					ambiente.moverTroll();
					if (ambiente.getSalas()[jogador.getLocalizacao()].isAction() != 0) {
						jogador.sobAtaque(ambiente.getSalas()[jogador.getLocalizacao()]);
						ambiente.getSalas()[jogador.getLocalizacao()].setAction(0);
					}
				}
				else{
					jogador.setObjetoProx(doorCView.getText());
					if(jogador.getChavePlayer().getChave()>0){
						jogador.unlockDoor(ambiente.getSalas()[jogador.getLocalizacao()]);
						writeLog("Destrancou a porta clicada"+". SALA ATUAL:"+Integer.toString(jogador.getLocalizacao()));
					}
					jogador.setObjetoProx(" ");
				} if(ambiente.getSalas()[jogador.getLocalizacao()].equals(ambiente.getSalas()[ambiente.getSalas().length-1])) { 
			        JOptionPane.showMessageDialog(null,"Parabéns, FIM DE JOGO\n"+"Ouro Arrecadado:" + jogador.getDinheiroAtual().getGold()+"\nDiamante Arrecadado: " + jogador.getDiamanteAtual().getDiamante());
					writeLog("Parabéns Fim de Jogo");
		            return;
				}
				setValue(ambiente.getSalas()[jogador.getLocalizacao()]);
				jogador.setObjetoProx(" ");
			}
		});
		doorDView.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(ambiente.getSalas()[jogador.getLocalizacao()].getPortas().get(3).isStatus() == true){
					jogador.setObjetoProx(doorDView.getText());
				
					jogador.sairSala(ambiente.getSalas()[jogador.getLocalizacao()]);
					LabirintoUI.writeLog("SALA ATUAL:"+Integer.toString(jogador.getLocalizacao()));
					ambiente.getSalas()[jogador.getLocalizacao()].setPersonagem(true);
					ambiente.moverTroll();
					if (ambiente.getSalas()[jogador.getLocalizacao()].isAction() != 0) {
						jogador.sobAtaque(ambiente.getSalas()[jogador.getLocalizacao()]);
						ambiente.getSalas()[jogador.getLocalizacao()].setAction(0);
					}
				}
				else{
					jogador.setObjetoProx(doorDView.getText());
					if(jogador.getChavePlayer().getChave()>0){
						jogador.unlockDoor(ambiente.getSalas()[jogador.getLocalizacao()]);
						writeLog("Destrancou a porta clicada"+". SALA ATUAL:"+Integer.toString(jogador.getLocalizacao()));
					}
					jogador.setObjetoProx(" ");
				} if(ambiente.getSalas()[jogador.getLocalizacao()].equals(ambiente.getSalas()[ambiente.getSalas().length-1])) { 
			        JOptionPane.showMessageDialog(null,"Parabéns, FIM DE JOGO\n"+"Ouro Arrecadado:" + jogador.getDinheiroAtual().getGold()+"\nDiamante Arrecadado: " + jogador.getDiamanteAtual().getDiamante());
					writeLog("Parabéns, fim do jogo");
		            return;
				}
				setValue(ambiente.getSalas()[jogador.getLocalizacao()]);
				jogador.setObjetoProx(" ");
			}
		});
        pack();
    }
    public static void writeLog(String mensagem) {
    	jLabel1.setText(mensagem);
    }
    public void setValue(Sala sala) {
		int contGold=0,contBronze=0,contIron=0;
		goldValueRoom.setText(Integer.toString(sala.getGoldSala().get(0).getGold()));
        diamondValueRoom.setText(Integer.toString(sala.getDiamanteSala().get(0).getDiamante()));
        for (int i = 0; i< sala.getMachados().size(); i++){
			if (sala.getMachados().get(i).getMachadoTipo()=="Ouro"){
				contGold = contGold+1;
			}else if(sala.getMachados().get(i).getMachadoTipo()=="Bronze"){
				contBronze = contBronze +1;
			}else if(sala.getMachados().get(i).getMachadoTipo()=="Ferro"){
				contIron = contIron +1;
			}
		}
        goldAxeValueRoom.setText(Integer.toString(contGold));
        bronzeAxeValueRoom.setText(Integer.toString(contBronze));
        ironAxeValueRoom.setText(Integer.toString(contIron));
        contGold=0;
        contBronze=0;
        contIron=0;
        potionValueRoom.setText(Integer.toString(sala.getPocaoSala().get(0).getPocaoMagica()));
        keyValueRoom.setText(Integer.toString(sala.getChaveSala().get(0).getChave()));
        trollValueRoom.setText(Integer.toString(sala.getTrolls().size()));
        sizeValueRoom.setText(Integer.toString(sala.getArea()));
        goldValueInventory.setText(Integer.toString(jogador.getDinheiroAtual().getGold()));
        diamondValueInventory.setText(Integer.toString(jogador.getDiamanteAtual().getDiamante()));
        for (int i = 0; i< jogador.getMachadoPlayer().size(); i++){
			if (jogador.getMachadoPlayer().get(i).getMachadoTipo()=="Ouro"){
				contGold = contGold+1;
			}else if(jogador.getMachadoPlayer().get(i).getMachadoTipo()=="Bronze"){
				contBronze = contBronze +1;
			}else if(jogador.getMachadoPlayer().get(i).getMachadoTipo()=="Ferro"){
				contIron = contIron +1;
			}
		}
        goldAxeValueInventory.setText(Integer.toString(contGold));
        bronzeAxeValueInventory.setText(Integer.toString(contBronze));
        ironAxeValueInventory.setText(Integer.toString(contIron));
        potionValueInventory.setText(Integer.toString(jogador.getPocaoPlayer().getPocaoMagica()));
        keyValueInventory.setText(Integer.toString(jogador.getChavePlayer().getChave()));
        contGold=0;
        contBronze=0;
        contIron=0;
        int quantidadePortas = ambiente.getSalas()[jogador.getLocalizacao()].getPortas().size();
        if(quantidadePortas == 3){
        	doorAView.setVisible(true);
        	if (ambiente.getSalas()[jogador.getLocalizacao()].getPortas().get(0).getSala1()==jogador.getLocalizacao()){
        		doorAView.setText(""+ambiente.getSalas()[jogador.getLocalizacao()].getPortas().get(0).getNome1());
        	}else{
        		doorAView.setText(""+ambiente.getSalas()[jogador.getLocalizacao()].getPortas().get(0).getNome2());
        	}
        	doorBView.setVisible(true);
        	if (ambiente.getSalas()[jogador.getLocalizacao()].getPortas().get(1).getSala1()==jogador.getLocalizacao()){
        		doorBView.setText(""+ambiente.getSalas()[jogador.getLocalizacao()].getPortas().get(1).getNome1());
        	}else{
        		doorBView.setText(""+ambiente.getSalas()[jogador.getLocalizacao()].getPortas().get(1).getNome2());
        	}
        	doorCView.setVisible(true);
        	if (ambiente.getSalas()[jogador.getLocalizacao()].getPortas().get(2).getSala1()==jogador.getLocalizacao()){
        		doorCView.setText(""+ambiente.getSalas()[jogador.getLocalizacao()].getPortas().get(2).getNome1());
        	}else{
        		doorCView.setText(""+ambiente.getSalas()[jogador.getLocalizacao()].getPortas().get(2).getNome2());
        	}
        	doorDView.setVisible(false);
        }else if (quantidadePortas == 2){
        	doorAView.setVisible(true);
        	if (ambiente.getSalas()[jogador.getLocalizacao()].getPortas().get(0).getSala1()==jogador.getLocalizacao()){
        		doorAView.setText(""+ambiente.getSalas()[jogador.getLocalizacao()].getPortas().get(0).getNome1());
        	}else{
        		doorAView.setText(""+ambiente.getSalas()[jogador.getLocalizacao()].getPortas().get(0).getNome2());
        	}
        	doorBView.setVisible(true);
        	if (ambiente.getSalas()[jogador.getLocalizacao()].getPortas().get(1).getSala1()==jogador.getLocalizacao()){
        		doorBView.setText(""+ambiente.getSalas()[jogador.getLocalizacao()].getPortas().get(1).getNome1());
        	}else{
        		doorBView.setText(""+ambiente.getSalas()[jogador.getLocalizacao()].getPortas().get(1).getNome2());
        	}
        	doorCView.setVisible(false);
        	doorDView.setVisible(false);
        }else if (quantidadePortas == 1){
        	doorAView.setVisible(true);
        	if (ambiente.getSalas()[jogador.getLocalizacao()].getPortas().get(0).getSala1()==jogador.getLocalizacao()){
        		doorAView.setText(""+ambiente.getSalas()[jogador.getLocalizacao()].getPortas().get(0).getNome1());
        	}else{
        		doorAView.setText(""+ambiente.getSalas()[jogador.getLocalizacao()].getPortas().get(0).getNome2());
        	}
        	doorBView.setVisible(false);
        	doorCView.setVisible(false);
        	doorDView.setVisible(false);
        }
        else if (quantidadePortas == 4){
        	doorAView.setVisible(true);
        	if (ambiente.getSalas()[jogador.getLocalizacao()].getPortas().get(0).getSala1()==jogador.getLocalizacao()){
        		doorAView.setText(""+ambiente.getSalas()[jogador.getLocalizacao()].getPortas().get(0).getNome1());
        	}else{
        		doorAView.setText(""+ambiente.getSalas()[jogador.getLocalizacao()].getPortas().get(0).getNome2());
        	}
        	doorBView.setVisible(true);
        	if (ambiente.getSalas()[jogador.getLocalizacao()].getPortas().get(1).getSala1()==jogador.getLocalizacao()){
        		doorBView.setText(""+ambiente.getSalas()[jogador.getLocalizacao()].getPortas().get(1).getNome1());
        	}else{
        		doorBView.setText(""+ambiente.getSalas()[jogador.getLocalizacao()].getPortas().get(1).getNome2());
        	}
        	doorCView.setVisible(true);
        	if (ambiente.getSalas()[jogador.getLocalizacao()].getPortas().get(2).getSala1()==jogador.getLocalizacao()){
        		doorCView.setText(""+ambiente.getSalas()[jogador.getLocalizacao()].getPortas().get(2).getNome1());
        	}else{
        		doorCView.setText(""+ambiente.getSalas()[jogador.getLocalizacao()].getPortas().get(2).getNome2());
        	}
        	doorDView.setVisible(true);
        	if (ambiente.getSalas()[jogador.getLocalizacao()].getPortas().get(3).getSala1()==jogador.getLocalizacao()){
        		doorDView.setText(""+ambiente.getSalas()[jogador.getLocalizacao()].getPortas().get(3).getNome1());
        	}else{
        		doorDView.setText(""+ambiente.getSalas()[jogador.getLocalizacao()].getPortas().get(3).getNome2());
        	}
        	
        }else if (quantidadePortas == 0){
        	doorAView.setVisible(false);
        	doorBView.setVisible(false);
        	doorCView.setVisible(false);
        	doorDView.setVisible(false);
        }
        int quantidadeTroll = ambiente.getSalas()[jogador.getLocalizacao()].getTrolls().size();
        if(quantidadeTroll ==3){
        	troll0view.setVisible(true);
        	troll0view.setText(ambiente.getSalas()[jogador.getLocalizacao()].getTrolls().get(0).getTipoTroll()+" "+Integer.toString(ambiente.getSalas()[jogador.getLocalizacao()].getTrolls().get(0).getIdentificacao()));
        	troll1View.setVisible(true);
        	troll1View.setText(ambiente.getSalas()[jogador.getLocalizacao()].getTrolls().get(1).getTipoTroll()+" "+Integer.toString(ambiente.getSalas()[jogador.getLocalizacao()].getTrolls().get(1).getIdentificacao()));
        	troll2View.setVisible(true);
        	troll2View.setText(ambiente.getSalas()[jogador.getLocalizacao()].getTrolls().get(2).getTipoTroll()+" "+Integer.toString(ambiente.getSalas()[jogador.getLocalizacao()].getTrolls().get(2).getIdentificacao()));
        }else if (quantidadeTroll == 2){
        	troll0view.setVisible(true);
        	troll0view.setText(ambiente.getSalas()[jogador.getLocalizacao()].getTrolls().get(0).getTipoTroll()+" "+Integer.toString(ambiente.getSalas()[jogador.getLocalizacao()].getTrolls().get(0).getIdentificacao()));
        	troll1View.setVisible(true);
        	troll1View.setText(ambiente.getSalas()[jogador.getLocalizacao()].getTrolls().get(1).getTipoTroll()+" "+Integer.toString(ambiente.getSalas()[jogador.getLocalizacao()].getTrolls().get(1).getIdentificacao()));
        	troll2View.setVisible(false);
        }else if (quantidadeTroll == 1){
        	troll0view.setVisible(true);
        	troll0view.setText(ambiente.getSalas()[jogador.getLocalizacao()].getTrolls().get(0).getTipoTroll()+" "+Integer.toString(ambiente.getSalas()[jogador.getLocalizacao()].getTrolls().get(0).getIdentificacao()));
        	troll1View.setVisible(false);
        	troll2View.setVisible(false);
        }else if (quantidadeTroll == 0){
        	troll0view.setVisible(false);
        	troll1View.setVisible(false);
        	troll2View.setVisible(false);
        }
        sala.verificaTiposTroll();
        sala.verificaTiposMachado();        
	} 
    public static void main(String args[]) throws IOException, ParseException  {
        Player jogador = new Player();
        Ambiente ambiente = new Ambiente();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LabirintoUI(jogador,ambiente).setVisible(true);
            }
        });
    }
    private javax.swing.JButton AxeView;
    private javax.swing.JButton bronzeAxeDrop;
    private javax.swing.JLabel bronzeAxeLabelInventory;
    private javax.swing.JLabel bronzeAxeLabelRoom;
    private javax.swing.JLabel bronzeAxeValueInventory;
    private javax.swing.JLabel bronzeAxeValueRoom;
    private javax.swing.JButton diamondDrop;
    private javax.swing.JLabel diamondLabelInventory;
    private javax.swing.JLabel diamondLabelRoom;
    private javax.swing.JLabel diamondValueInventory;
    private javax.swing.JLabel diamondValueRoom;
    private javax.swing.JButton diamondView;
    private javax.swing.JButton doorAView;
    private javax.swing.JButton doorBView;	
    private javax.swing.JButton doorCView;
    private javax.swing.JButton doorDView;
    private javax.swing.JButton axeDrop;
    private javax.swing.JLabel goldAxeLabelInventory;
    private javax.swing.JLabel goldAxeLabelRoom;
    private javax.swing.JLabel goldAxeValueInventory;
    private javax.swing.JLabel goldAxeValueRoom;
    private javax.swing.JButton goldDrop;
    private javax.swing.JLabel goldLabelInventory;
    private javax.swing.JLabel goldLabelRoom;
    private javax.swing.JLabel goldValueInventory;
    private javax.swing.JLabel goldValueRoom;
    private javax.swing.JButton goldView;
    private javax.swing.JButton potionDrop;
    private javax.swing.JLabel ironAxeLabelInventory;
    private javax.swing.JLabel ironAxeLabelRoom;
    private javax.swing.JLabel ironAxeValueInventory;
    private javax.swing.JLabel ironAxeValueRoom;
    private static javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton keyDrop;
    private javax.swing.JLabel keyLabelInventory;
    private javax.swing.JLabel keyLabelRoom;
    private javax.swing.JLabel keyValueInventory;
    private javax.swing.JLabel keyValueRoom;
    private javax.swing.JButton keyView;
    private javax.swing.JLabel playerView;
    private javax.swing.JButton ironAxeDrop;
    private javax.swing.JLabel potionLabelInventory;
    private javax.swing.JLabel potionLabelRoom;
    private javax.swing.JLabel potionValueInventory;
    private javax.swing.JLabel potionValueRoom;
    private javax.swing.JButton potionView;
    private javax.swing.JLabel sizeLabelRoom;
    private javax.swing.JLabel sizeValueRoom;
    private javax.swing.JButton troll0view;
    private javax.swing.JButton troll1View;
    private javax.swing.JButton troll2View;
    private javax.swing.JLabel trollLabelRoom;
    private javax.swing.JLabel trollValueRoom;
    Ambiente ambiente;
    Player jogador;
}
