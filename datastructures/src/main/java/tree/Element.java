/**
 * 
 */
package tree;

/**
 * @author David Krenkel <david.melo1992@gmail.com>
 *
 */
class Element<T extends Comparable<?>> {

	private T record;
	
	Element(T record) {
		this.record = record;
	}

	public T getRecord() {
		return record;
	}

	public void setRecord(T record) {
		this.record = record;
	}
}
