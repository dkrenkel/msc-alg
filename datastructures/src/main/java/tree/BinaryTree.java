/**
 * 
 */
package tree;

/**
 * @author David Krenkel <david.melo1992@gmail.com>
 *
 */
public class BinaryTree<T extends Comparable<?>> {
	
	private Node<T> root;

	public BinaryTree(Node<T> root) {
		super();
		this.root = root;
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
	
	public Node<T> searchForElement(T value) {
		return searchForElement(this.root, value);
	}
}
