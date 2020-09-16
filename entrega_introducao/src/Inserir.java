
 
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
/**
 * A very simple program that writes some data to an Excel file
 * using the Apache POI library.
 * @author www.codejava.net
 *
 */
public class Inserir {
 
    public static void main(String[] args) throws IOException {
    	String path = "C:/Users/Matheus Marra/Desktop/Registros.xlsx";
    	File file = new File(path);
        XSSFWorkbook workbook = null;
		try {
			workbook = new XSSFWorkbook(file);
		} catch (InvalidFormatException | IOException e) {
			e.printStackTrace();
		}
		
        XSSFSheet sheet = workbook.getSheetAt(0);
         
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o usuario desejado:");
        String str = sc.nextLine();
        
        
        int rowCount = sheet.getLastRowNum() + 1;
         
            Row row = sheet.createRow(++rowCount);
             
            int columnCount = 0;
           for(Row row:sheet) {
        	   for (Cell cell:row) {
                if (cell.getRichStringCellValue().trim()equals() != str) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
        	   }
             }
            }
             
        }
         
         
        try (FileOutputStream outputStream = new FileOutputStream("JavaBooks.xlsx")) {
            workbook.write(outputStream);
        }
    }
 
}
