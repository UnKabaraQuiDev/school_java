
import java.util.HashMap;
import javax.swing.JOptionPane;



/**
 *
 * @author robert.fisch
 */
public class MainFrame extends javax.swing.JFrame {
    
	private Party party;
	
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
		
		this.party = initParty("dp");
		updateView();
	}
    
    
    private Party initParty(String name)
    {
        Party dp = new Party("DP");
        dp.add(new Candidate("Delles", "Lex"));
        dp.add(new Candidate("Baum", "Gilles"));
        dp.add(new Candidate("Hartmann", "Carole"));
        dp.add(new Candidate("Jeitz", "Edith"));
        dp.add(new Candidate("Schommer", "Claude"));
        dp.add(new Candidate("Semedo", "Monica"));
        dp.add(new Candidate("Sitz", "Jacques"));
        
        Party csv = new Party("CSV");
        csv.add(new Candidate("Hetto-Gasch", "Françoise"));
        csv.add(new Candidate("Dublin", "Christian"));
        csv.add(new Candidate("Gloden", "Léon"));
        csv.add(new Candidate("Hengel", "Max"));
        csv.add(new Candidate("Modert", "Octavie"));
        csv.add(new Candidate("Wengler", "Yves"));
        csv.add(new Candidate("Weydert", "Stéphanie"));
        
        Party lsap = new Party("LSAP");
        lsap.add(new Candidate("Schmit", "Nicolas"));
        lsap.add(new Candidate("Bechtold", "Lucien"));
        lsap.add(new Candidate("Burton", "Tess"));
        lsap.add(new Candidate("Frisch", "Colette"));
        lsap.add(new Candidate("Rösseler", "Aurore"));
        lsap.add(new Candidate("Scheuer", "Ben"));
        lsap.add(new Candidate("Wirtz", "Jean-François"));
        
        Party greng = new Party("Déi Gréng");
        greng.add(new Candidate("Dieschburg", "Carole"));
        greng.add(new Candidate("Kox", "Henri"));
        greng.add(new Candidate("Gary", "Chantal"));
        greng.add(new Candidate("Klares-Goergen", "Fernande"));
        greng.add(new Candidate("Kmiotek", "Christian"));
        greng.add(new Candidate("Schleck", "Steve"));
        greng.add(new Candidate("Sehovic", "Meris"));
        
        Party piraten = new Party("Piraten");
        piraten.add(new Candidate("Freres", "Daniel"));
        piraten.add(new Candidate("Clement", "Jil"));
        piraten.add(new Candidate("Houdremont", "Claire"));
        piraten.add(new Candidate("Boerger", "Nancy"));
        piraten.add(new Candidate("Moreira", "Emilie"));
        piraten.add(new Candidate("Martins", "Catarina"));
        piraten.add(new Candidate("Contreras", "Gerald"));
        
        Party adr = new Party("ADR");
        adr.add(new Candidate("Mehlen", "Roby"));
        adr.add(new Candidate("Schoos", "Jean"));
        adr.add(new Candidate("Agnes", "Tom"));
        adr.add(new Candidate("Breyer", "Nathalie"));
        adr.add(new Candidate("Brisbois", "Tessy"));
        adr.add(new Candidate("Kirchen", "Ernest"));
        adr.add(new Candidate("Solny", "Colette"));
        
        Party lenk = new Party("Déi Lénk");
        lenk.add(new Candidate("Arendt", "Anne"));
        lenk.add(new Candidate("Biermann", "Gaby"));
        lenk.add(new Candidate("Bollig", "France"));
        lenk.add(new Candidate("Fuentes", "Adela"));
        lenk.add(new Candidate("Krier", "Jean"));
        lenk.add(new Candidate("Schroeder", "Sylvie"));
        lenk.add(new Candidate("Zebrowsky", "Dan"));
        
        Party kpl = new Party("KPL");
        kpl.add(new Candidate("Antony", "Joëlle"));
        kpl.add(new Candidate("Arendt", "Huguette"));
        kpl.add(new Candidate("Di Bernardo", "Sylvia"));
        kpl.add(new Candidate("Haas", "Wilhelm"));
        kpl.add(new Candidate("Licina", "Dzeva"));
        kpl.add(new Candidate("Mahnen", "David"));
        kpl.add(new Candidate("Pizzaferri-Manente", "Chrstiane"));
        
        
        HashMap<String,Party> hm = new HashMap<>();
        hm.put("dp", dp);
        hm.put("csv", csv);
        hm.put("lsap", lsap);
        hm.put("greng", greng);
        hm.put("piraten", piraten);
        hm.put("adr", adr);
        hm.put("lenk", lenk);
        hm.put("kpl", kpl);
        
        if(!hm.containsKey(name))
        {
            JOptionPane.showMessageDialog(this, "Sorry, mee eng Partei mam Numm <"+name+"> ass net definéiert.\n\nDe Programm gëtt elo zou gemaach.", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        
        return hm.get(name);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        partyLabel = new javax.swing.JLabel();
        candCountLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        candidatesList = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        candidatesLabel = new javax.swing.JLabel();
        votesLabel = new javax.swing.JLabel();
        voteButton = new javax.swing.JButton();
        searchTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Party:");

        partyLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        partyLabel.setText("-");

        candCountLabel.setText("Candidates");

        candidatesList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        candidatesList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(candidatesList);

        jLabel4.setText("Votes");

        candidatesLabel.setText("-");

        votesLabel.setText("-");

        voteButton.setText("Vote for selected candidate");
        voteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voteButtonActionPerformed(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Search");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(partyLabel))
                        .addComponent(jScrollPane1)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(candCountLabel)
                                .addComponent(jLabel4))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(votesLabel)
                                .addComponent(candidatesLabel)))
                        .addComponent(voteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 183, Short.MAX_VALUE)
                        .addComponent(searchTextField)
                        .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(partyLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(candCountLabel)
                    .addComponent(candidatesLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(votesLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(voteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voteButtonActionPerformed
        int index = candidatesList.getSelectedIndex();
		if(index < 0)
			return;
		
		party.get(index).voteFor();
		
		updateView();
    }//GEN-LAST:event_voteButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String query = searchTextField.getText();
		candidatesList.setSelectedValue(party.findByName(query), true);
    }//GEN-LAST:event_searchButtonActionPerformed

	public void updateView() {
		partyLabel.setText(party.getName());
		
		party.sortByVotes();
		
		candidatesList.setListData(party.toArray());
		
		candidatesLabel.setText(Integer.toString(party.size()));
		votesLabel.setText(Integer.toString(party.getTotalVotes()));
	}
	
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel candCountLabel;
    private javax.swing.JLabel candidatesLabel;
    private javax.swing.JList candidatesList;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel partyLabel;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JButton voteButton;
    private javax.swing.JLabel votesLabel;
    // End of variables declaration//GEN-END:variables
}
