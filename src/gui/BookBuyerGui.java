package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import agents.BookBuyerAgent;
import behaviours.RequestPerformer;

import javax.swing.JOptionPane;

public class BookBuyerGui{
    private BookBuyerAgent miAgente;
    private String bookTitle, bestprice; 
    private RequestPerformer rq;
	
	public BookBuyerGui(BookBuyerAgent a, String price) {
	    miAgente = a;
            bestprice = price;
	}
	public void gui(String price){
            bookTitle = String.valueOf(miAgente.getBookTitle());
            
            int resp=JOptionPane.showConfirmDialog(null,"Nombre del libro: "+ bookTitle + " Precio: " + getPrice(price));
            if (JOptionPane.OK_OPTION == resp){
                System.out.println("Seleccion correcta");
              }
                   else{
                 System.out.println("No es una seleccion correcta");
                }
        }
    
        public String getPrice(String price){
            String costo = price;
            return costo;
        }
        
	public void main(String args[]){
            gui(bestprice);
        }
}