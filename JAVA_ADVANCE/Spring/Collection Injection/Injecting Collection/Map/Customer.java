import java.util.*;


public class Customer {

	private Map<Object,Object> lists;

	public Map<Object,Object> getLists() {
		return lists;
	}
	public void setLists(Map<Object,Object> lists) {
		this.lists = lists;
	}

	public String toString() {
		return "Customer[ MAP= "+lists+"]";
	}
}
