import java.util.*;


public class Customer {

	private Set<Object> lists;

	public Set<Object> getLists() {
		return lists;
	}
	public void setLists(Set<Object> lists) {
		this.lists = lists;
	}

	public String toString() {
		return "Customer[ Sets= "+lists+"]";
	}
}
