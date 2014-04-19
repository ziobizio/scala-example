package com.bicio.example.generic

import javax.swing.{ JFrame, JPanel, JButton, SwingUtilities }
import java.awt.event.{ActionListener, ActionEvent}

class SwingExample extends JFrame {

  def init() {
    val panel = new JPanel
    this createPane panel;
    this.getContentPane add panel
    this.pack()
    SwingExample.this.setVisible(true);
  }

  def createPane(pane: JPanel) {
    pane.add(this.createButton)
  }

  def createButton: JButton = {
    val button = new JButton
    button.addActionListener(new CallbackActionListener(() => println("Action")))
    button
  }

}

class CallbackActionListener(callback: () => Unit) extends ActionListener {

  def actionPerformed(e: ActionEvent) {
    callback()
  }

}

object FirstSwingApp extends App {
  override def main(args: Array[String]) {
    SwingUtilities.invokeLater(new Runnable() {
      def run() {
        val frame = new SwingExample;
        frame.init;
      }
    })
  }
}
