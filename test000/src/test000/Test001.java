package test000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test001 {
	
	public static void main(String[] args) {
		List<Map<String, Object>> dataList=new ArrayList<Map<String, Object>>();
        Map<String, Object> map=new HashMap<String, Object>();
        map.put("CUSTOMER_NO","123456");
        map.put("CUSTOMER_NAME","渤海银行股份杭州分行124");
        map.put("CUSTOMER_RISK","高风险");
        for(int i=0;i<5;i++) {
			dataList.add(map);
		}
        System.out.println(dataList.toString());
	}

}
