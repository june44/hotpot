package cn.ty.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.directwebremoting.json.serialize.JsonSerializer;
import org.hibernate.criterion.DetachedCriteria;

import sun.print.resources.serviceui;

import cn.hotpot.biz.BaseBiz;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.sun.mail.iap.Response;


public class PageUtil {

	/*public static void queryPage(
			Map<Class<?>, Set<String>> includeMap,
			BaseBiz baseBiz,
			DetachedCriteria detachedCriteria,
			Page page,
			HttpServletResponse response) throws Exception {
		
		Integer total = baseBiz.findByCriteria(detachedCriteria).size();
		List<Object> list;
		if(page == null || page.getPageSize() == null){
			list = baseBiz.findByCriteria(detachedCriteria);	
		}else{
			list = baseBiz.findByCriteria(page.getPageNo(), page.getPageSize(), detachedCriteria);
		}
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("total", total);
		resultMap.put("rows", list);
		String json;
		if(includeMap == null){
			json = JSON.toJSONString(resultMap, SerializerFeature.DisableCircularReferenceDetect);
		}else{
			ComplexPropertyPreFilter complexPropertyPreFilter = new ComplexPropertyPreFilter(includeMap);
			SerializeWriter sw = new SerializeWriter();
			JSONSerializer serializer = new JSONSerializer(sw);
			serializer.config(SerializerFeature.DisableCircularReferenceDetect, true);
			serializer.getPropertyFilters().add(complexPropertyPreFilter);
			serializer.write(resultMap);
			json = sw.toString();
		}
		outJSON(response, json);
		return;
	}

	private static void outJSON(HttpServletResponse response, String json) {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		try {
			PrintWriter out = response.getWriter();
			out.write(json);
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		System.out.println("向前台输出：" + json);
	}*/
}
