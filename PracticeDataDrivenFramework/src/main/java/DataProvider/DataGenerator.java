package DataProvider;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

public class DataGenerator {

    @DataProvider(name = "Excel")
    public static Object[][] testDataGenerator(Method m) throws IOException {
        if(m.getName().equalsIgnoreCase("tc_001_loginFunctionality")){
            FileInputStream file = new FileInputStream("./TestData/TestSheet.xlsx");
            XSSFWorkbook wb = new XSSFWorkbook(file);
            XSSFSheet sheet = wb.getSheetAt(1);
            int numberOfData = sheet.getPhysicalNumberOfRows();
            Object[][] testData = new Object[numberOfData][2];
            for (int i = 0; i < numberOfData; i++){
                testData[i][0] = sheet.getRow(i).getCell(0).getStringCellValue();
                testData[i][1] = sheet.getRow(i).getCell(1).getStringCellValue();
            }
            return testData;
        }

        return null;
    }
}

