package example.cxrTest;
import org.springframework.context.*;
import org.springframework.context.support.*;
import org.springframework.core.io.Resource;
import org.dom4j.*;
import org.dom4j.io.*;
import java.util.*;
public class ResourceloaderTest {
	public static void main(String[] args)
			throws Exception
	{
		// 创建ApplicationContext实例
//    ApplicationContext ctx = new
//      ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext ctx = new
				FileSystemXmlApplicationContext("beans.xml");
		Resource res = ctx.getResource("book.xml");
		// 获取该资源的简单信息
		System.out.println(res.getFilename());
		System.out.println(res.getDescription());
	}
}
