package com.examples.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.examples.po.BorrowLogExcel;
import com.examples.utils.excel.ExportExcel;
import com.examples.utils.excel.ImportExcel;

@RestController
@RequestMapping("/excel")
public class ExcelController {

	@RequestMapping(value = "/exportExcel", method = {RequestMethod.POST,RequestMethod.GET})
	public String exportExcel(){
		List<BorrowLogExcel> list = new ArrayList<>();
		for (int i = 1; i < 4; i++) {
			BorrowLogExcel b = new BorrowLogExcel();
			b.setBorrowNo(i+"");
			list.add(b);
		}
		try {
			new ExportExcel("测试1", BorrowLogExcel.class).setDataList(list).writeFile("D:/mnt/export.xlsx").dispose();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "exportExcel";
	}
	
	@RequestMapping(value = "/importExcel", method = {RequestMethod.POST,RequestMethod.GET})
	public void importExcel(){
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
