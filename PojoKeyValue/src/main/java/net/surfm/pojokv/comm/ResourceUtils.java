package net.surfm.pojokv.comm;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

import org.apache.commons.io.IOUtils;

public class ResourceUtils {

	public static InputStream getInputStreamByResourceName(String nams) {
		ClassLoader classloader = Thread.currentThread()
				.getContextClassLoader();

		return classloader.getResourceAsStream(nams);
	}
	
	public static String getStringByResourceName(String name) throws IOException{
		StringWriter writer = new StringWriter();
		IOUtils.copy(getInputStreamByResourceName(name), writer, "UTF-8");
		return writer.toString();
	}
	
	
	public static void main(String args[]) throws IOException {
		String s = getStringByResourceName("template/Root.jat");
		System.out.println(s);
//		String js = getStringByName("net/surfm/pojokv/comm/Test.java");
		ClassLoader classloader = Thread.currentThread()
				.getContextClassLoader();
		System.out.println(classloader.getResource("net/surfm/pojokv/comm/Test.java"));
	}

}
