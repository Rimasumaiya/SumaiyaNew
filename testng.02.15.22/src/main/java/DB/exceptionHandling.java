package DB;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class exceptionHandling {
	
	FileReader f;
	BufferedReader b;
	Object [][] o;
	@Test
	public void readTextFile() throws IOException {
		
		try {
			f=new FileReader(new File("/Users/rimasumaiya/eclipse-workspace/testng.02.15.22/Book.1Txt"));
			
			 b=new BufferedReader(f);
			
				String line=b.readLine();
				while(line!=null){
					System.out.println(line);
					line=b.readLine();
				}
			}catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("file not found");
			}
			
			
			
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("cannot read line");
			}
		finally {
			if(f!=null) {
				f.close();
			}
			if(b!=null) {
				b.close();
			}
			
		}
			
		}
	@DataProvider(name="Login")
	public void readExcelSheet() {
		try {
			FileInputStream f=new FileInputStream(new File("/Users/rimasumaiya/eclipse-workspace/testng.02.15.22/Data.xlsx"));
			XSSFWorkbook book=new XSSFWorkbook(f);
			XSSFSheet sheeet=book.getSheetAt(0);
			//XSSFCell cell=sheet.getRow(2).getCell(1);
			cell.getStringCellValue();
			
			 o=new Object[getLastRowNum()][getRow(0).getLastCellNum()];			
			for(int i=1; i<=sheet.getLastRowNum();i++){
				for(int j=0;j<=sheet.getRow(0).getLastCellNum();j++) {
					XSSFCell cell=sheet.getRow(i).getCell(j);
					switch(cell.getCellType()) {
					case XSSFCell.CELL_TYPE_STRING:{
						o[i-1][j]=cell.getStringCellValue();
					}
					case XSSFCell.CELL_TYPE_NUMERIC:{
						o[i-1][j]=cell.getNumericCellValue();
					}
					
				}
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return o;	
	}
		
		
	
		
	}
	private Object getRow(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	private int getLastRowNum() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	


