/**
 * 
 */
package tree;

import element.Element;

/**
 * @author David Krenkel <david.melo1992@gmail.com>
 *
 */
public class Node<T extends Comparable<?>> {

	private Element<T> element;
	
	private Node<T> leftNode;
	
	private Node<T> rightNode;

	public Element<T> getElement() {
		return element;
	}

	public void setElement(Element<T> element) {
		this.element = element;
	}

	public Node<T> getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(Node<T> leftNode) {
		this.leftNode = leftNode;
	}

	public Node<T> getRightNode() {
		return rightNode;
	}

	public void setRightNode(Node<T> rightNode) {
		this.rightNode = rightNode;
	}
	
	
	
}
