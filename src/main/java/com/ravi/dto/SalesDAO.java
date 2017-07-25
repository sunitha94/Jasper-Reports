package com.ravi.dto;

import java.util.ArrayList;
import java.util.List;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class SalesDAO {	 

	public  JRDataSource getDataSource() {
	
		List<Sales> items = new ArrayList<Sales>();
	 
	
		Sales item1 = new Sales();
		item1.setId(1001L);
		item1.setName("Pencil");
		item1.setDescription("This is used for sketching drawings");
		item1.setPrice(10.50);
			 
		Sales item2 = new Sales();
		item2.setId(1002L);
		item2.setName("Pen");
		item2.setDescription("This is used for signing autographs");
		item2.setPrice(15.00);
	 
		Sales item3 = new Sales();
		item3.setId(1003L);
		item3.setName("Bag");
		item3.setDescription("This is used for storing other items");
		item3.setPrice(50.00);
	 
		items.add(item1);
		items.add(item2);
		items.add(item3);
	
		JRDataSource ds = new JRBeanCollectionDataSource(items); 
	 
		return ds;
	}
}