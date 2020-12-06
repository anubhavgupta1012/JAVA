import java.util.*;


public class Customer {

	private List<Object> lists;
	private Set<Object> sets;
	private Map<Object,Object> map;
	private Properties pros;


	public List<Object> getLists() {
		return lists;
	}
	public void setLists(List<Object> lists) {
		this.lists = lists;
	}
	public Set<Object> getSets() {
		return sets;
	}
	public void setSets(Set<Object> sets) {
		this.sets = sets;
	}
	public Map<Object, Object> getMap() {
		return map;
	}
	public void setMap(Map<Object, Object> map) {
		this.map = map;
	}
	public Properties getPros() {
		return pros;
	}
	public void setPros(Properties pros) {
		this.pros = pros;
	}

	public String toString() {
		return "Customer[Lists= "+lists+"Maps="+map+"Pros="+pros+"Sets="+sets+"]";
	}
}
