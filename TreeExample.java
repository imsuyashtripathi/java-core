/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 import javax.swing.*;  
import javax.swing.tree.DefaultMutableTreeNode;  
public class TreeExample {  
JFrame f;  
TreeExample()
{  
    f=new JFrame();   
    DefaultMutableTreeNode style=new DefaultMutableTreeNode("Style");  
    DefaultMutableTreeNode color=new DefaultMutableTreeNode("color");  
    DefaultMutableTreeNode font=new DefaultMutableTreeNode("font");  
    style.add(color);  
    style.add(font);  
    DefaultMutableTreeNode red=new DefaultMutableTreeNode("red");  
    DefaultMutableTreeNode blue=new DefaultMutableTreeNode("blue");  
    DefaultMutableTreeNode black=new DefaultMutableTreeNode("black");  
    DefaultMutableTreeNode green=new DefaultMutableTreeNode("green");  
    DefaultMutableTreeNode A=new DefaultMutableTreeNode("fONT1");  
    DefaultMutableTreeNode B=new DefaultMutableTreeNode("FONT2");  
    
    color.add(red); color.add(blue); color.add(black); color.add(green); 
    font.add(A);
    font.add(B);
    
    JTree jt=new JTree(style);  
    f.add(jt);  
    
    f.setSize(200,200);  
    f.setVisible(true);  
}  
public static void main(String[] args) {  
    new TreeExample();  
}} 