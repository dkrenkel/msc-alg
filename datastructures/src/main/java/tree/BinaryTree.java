/**
 * 
 */
package tree;

import element.Element;

/**
 * @author David Krenkel <david.melo1992@gmail.com>
 *
 */
public class BinaryTree<T extends Comparable<?>> {
	
	public enum Side {
		RIGHT,
		LEFT;
	}
	
	private Node<T> root;

	public BinaryTree(Node<T> root) {
		super();
		this.root = root;
	}
	
	private int max(int a, int b) {
		return (a > b) ? a : b;
	}
	
	private Node<T> searchForElement(Node<T> root, T value) {
		if (root == null || root.getElement().getRecord().equals(value)) {
			return root;
		}
		Node<T> leftNode = searchForElement(root.getLeftNode(), value);
		if (leftNode.getElement().getRecord().equals(value)) {
			return leftNode;
		}
		return searchForElement(root.getRightNode(), value);
	}
	
	private int height(Node<T> root) {
		if (root == null) {
			return -1;
		}
		if (root.getRightNode() == null && root.getLeftNode() == null) {
			return 0;
		}
		return 1 + max(height(root.getRightNode()), height(root.getLeftNode()));
	}
	
	public Node<T> searchForElement(T value) {
		return searchForElement(this.root, value);
	}
	
	public boolean insert(T newValue, T parentValue, Side side) {
		Node<T> parentNode = searchForElement(parentValue);
		if (parentNode == null) {
			return false;
		}
		Node<T> newNode = new Node<T>();
		newNode.setElement(new Element<T>(newValue));
		if (side == Side.RIGHT) {
			newNode.setRightNode(parentNode.getRightNode());
			parentNode.setRightNode(newNode);
		} else {
			newNode.setLeftNode(parentNode.getRightNode());
			parentNode.setLeftNode(newNode);
		}
		return true;
	}
	
	public int height() {
		return height(this.root);
	}
}
