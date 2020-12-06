import java.util.*;


public class Customer {

	private List<Object> lists;

	public List<Object> getLists() {
		return lists;
	}
	public void setLists(List<Object> lists) {
		this.lists = lists;
	}

	public String toString() {
		return "Customer[ Lists= "+lists+"]";
	}
}
