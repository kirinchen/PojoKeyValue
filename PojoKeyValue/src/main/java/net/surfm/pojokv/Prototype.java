package net.surfm.pojokv;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 
 * @author Kirin
 *
 */
public class Prototype implements KeyValuePojo<Prototype> {
	
	private Integer id;
	private String name = "Kan";
	private boolean actived;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActived() {
		return actived;
	}

	public void setActived(boolean actived) {
		this.actived = actived;
	}

	@Override
	public Collection<AttributeKey<Prototype, ?>> listKeys() {
		List<AttributeKey<Prototype, ?>> ans = new ArrayList<AttributeKey<Prototype,?>>();
		ans.add(ACTIVED);
		ans.add(NAME);
		ans.add(ID);
		return ans;
	}
	
	@Override
	public <T> T get(AttributeKey<Prototype, T> key) {
		if(key == ID){
			return (T) id;
		}else if(key == NAME){
			return (T) name;
		}else if(key == ACTIVED){
			return (T) (Boolean)actived;
		}else{
			throw new NotFindKeyException("key="+key);
		}
	}
	
	@Override
	public <T> void put(AttributeKey<Prototype, T> key, T o) {
		if(key == ID){
			id = (Integer) o;
		}else if(key == NAME){
			name = (String) o;
		}else if(key == ACTIVED){
			actived = (boolean) o;
		}else{
			throw new NotFindKeyException("key="+key);
		}
	}
	
	public static AttributeKey<Prototype,Integer> ID = new AttributeKey<Prototype, Integer>() {};
	public static AttributeKey<Prototype,String> NAME = new AttributeKey<Prototype, String>() {};
	public static AttributeKey<Prototype,Boolean> ACTIVED = new AttributeKey<Prototype, Boolean>() {};

}
