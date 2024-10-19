/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package demographics;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author pcy113
 */
public class DrawPanel extends javax.swing.JPanel {

	/**
	 * Creates new form DrawPanel
	 */
	public DrawPanel() {
		initComponents();
	}

	private int rows = 2, cols = 2;

	@Override
	public void paint(Graphics g) {
		g.setColor(Color.WHITE); // bro we fill the canvas
		g.fillRect(0, 0, getWidth(), getHeight());

		g.setColor(Color.BLACK);
		for (int x = 0; x <= cols; x++) { // bro we drawing the vertical lines
			g.drawLine((int) (x * ((double) getWidth() / cols)), 0, (int) (x * ((double) getWidth() / cols)), getHeight());
		}
		for (int y = 0; y <= rows; y++) { // and we drawing the horizontal lines
			g.drawLine(0, (int) (y * ((double) getHeight() / rows)), getWidth(), (int) (y * ((double) getHeight() / rows)));
		}

		// we draw the external border, could probably use super#setBorder()
		g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);

		// dispose of the graphics (just READ, its written there)
		g.dispose();
		//^^^^^^^^^ there
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

	public void setRows(int rows) {
		this.rows = rows <= 0 ? 1 : rows;
	}

	public void setCols(int cols) {
		this.cols = cols <= 0 ? 1 : cols;
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
