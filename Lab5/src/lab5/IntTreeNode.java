/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5;

/**
 *
 * @author Administrator
 */
public class IntTreeNode {

    public int Node;
    public IntTreeNode trai;
    public IntTreeNode phai;
    public IntTreeNode(int data) {
this(data, null, null);
}
// Constructs a branch node with the given data and links.
public IntTreeNode(int data, IntTreeNode left, IntTreeNode right) {
this.data = data;
this.left = left;
this.right = right;
} 
}
