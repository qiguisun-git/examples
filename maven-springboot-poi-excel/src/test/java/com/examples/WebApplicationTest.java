package com.examples;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.examples.po.BorrowLogExcel;
import com.examples.utils.excel.ExportExcel;
import com.examples.utils.excel.ImportExcel;


/**
 * 
 * SpringBoot是1.4.0之前的话，所用的注解稍有不同。 你需要把@SpringBootTest注解换成@SpringApplicationConfiguration和@WebAppConfiguration
 * 。 另外：@RunWith和@SprintBootTest这两个注解上都有@Inherited这个注解，所以我们可以定义一个单元测的父类，
 * 然后所有的单元测试类继承这个父类就行了
 * 
 * 注意：测试了必须加上“abstract”不然Spring Boot单元测试编译报错 No runnable methods
 * 
 * @author sunqigui
 * @version 创建时间 2018年5月24日 下午3:12:38
 * @Title WebApplicationTest.java
 * @Package com.examples
 */
public class WebApplicationTest extends WebApplicationBaseTest {

	@Test
	public void test1() {
		try {
			List<BorrowLogExcel> list = new ArrayList<>();
			for (int i = 1; i < 4; i++) {
				BorrowLogExcel b = new BorrowLogExcel();
				b.setBorrowNo(i+"");
				list.add(b);
			}
			new ExportExcel("测试1", BorrowLogExcel.class).setDataList(list).writeFile("mnt/export.xlsx").dispose();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
	
	
	@Test
	public void test2(){
		try {
			ImportExcel ei = new ImportExcel( "D:/mnt/export.xlsx", 0);
			for (int i = ei.getDataRowNum(); i < ei.getLastDataRowNum(); i++) {
				Row row = ei.getRow(i);
				for (int j = 0; j < ei.getLastCellNum(); j++) {
					Object val = ei.getCellValue(row, j);
					System.out.print(val + ", ");
				}
				System.out.print("\n");
			}
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
