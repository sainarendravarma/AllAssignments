package com.aaslin.march21.second;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*Author : Narendra 
CustomMap class that extends HashMap and @Overrides get() and put() methods*/

class CustomMap<K, V> extends HashMap<Integer, String> {
	List<CustomDS> list = new ArrayList<CustomDS>();

	@Override
	public String get(Object key) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == key) {
				return list.get(i).getName();
			}
		}
		return null;
	}

	@Override
	public String put(Integer key, String value) {
		boolean keyExists = false;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == key) {
				list.get(i).setName(value);
				keyExists = true;
			}
		}
		if (!keyExists) {
			list.add(new CustomDS(key, value));
		}
		return super.put(key, value);
	}
}
