import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ExcelFileReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
            FileInputStream file = new FileInputStream(new File("src/Test.xls"));
            File TextFile = new File("TextFile.txt");
            PrintWriter p = new PrintWriter(TextFile);            
            HSSFWorkbook workbook = new HSSFWorkbook(file);
            HSSFSheet sheet = workbook.getSheetAt(0);
            
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) 
            {
                Row row = rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();
                 
                while (cellIterator.hasNext()) 
                {
                    Cell cell = cellIterator.next();               
                    switch (cell.getCellType()) 
                    {
                        case Cell.CELL_TYPE_NUMERIC:
                            p.println(cell.getNumericCellValue());
                            p.flush();
                            break;
                        case Cell.CELL_TYPE_STRING:
                        	p.println(cell.getStringCellValue());
                        	p.flush();
                            break;
                    }
                }
                System.out.println("");
                p.flush();
            }
            file.close();
        } 
       
    }



