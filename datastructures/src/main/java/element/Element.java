/**
 * 
 */
package element;

/**
 * @author David Krenkel <david.melo1992@gmail.com>
 *
 */
public class Element<T extends Comparable<?>> {

	private T record;

	public Element() {
		super();
	}

	public Element(T record) {
		this.record = record;
	}

	public T getRecord() {
		return record;
	}

	public void setRecord(T record) {
		this.record = record;
	}
}
