package POClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class WebElementTableUtils {

    WebDriver driver;
    public WebElementTableUtils(WebDriver webdriver){
        driver = webdriver;
    }

    //getAll column Name in list
    public List<String> getALlColumnName(WebElement wb){
        List<String> columnName = new ArrayList<>();
        String append = "/thead/tr/th";
        List<WebElement> column = driver.findElements(By.xpath(wb+append));
        for(WebElement col : column){
            String name = col.getText();
            columnName.add(name);
        }
        return columnName;
    }


    // get all the elemnts for perticular column
    public String getPerticularCellElement(WebElement wb){
        //table[@id='example']//thead//th[text()='Office']/../../following-sibling::tbody//tr/td[3]
        //tbody/tr/td[count(//table/thead/tr/th[.="Position"]/preceding-sibling::th)+1]

        return "";
    }

    // get no of rows
    public int getNoOfRowsOfTableExcludingColumnName(WebElement wb){


        return 0;
    }

    public int getNoOfRowsOfTableIncludingColumnName(WebElement wb){


        return 0;
    }


    //get all elements from perticular row
    public List<String> getAllElementFromGivenRow(WebElement wb){
    List<String> b = new ArrayList<>();

        return b;
    }

    //getText of cell with column name given and row number
    public String getTextOfCellWithColumnNameAndRowNumber(String columnName, String rowNumber){
        String b="";
        return b;
    }

    //getText of cell with column number and row number given
    public String getTextOfCellWithColumnNumberAndRowNumber(String columnNumber,String rowNumber){

        return null;
    }

    //click on cell with column name given and row number
    public void clickOnCellWithColumnNameAndRowNumber(String columnName, String rowNumber){

    }

    //click on cell with column number and row number given
    public void clickOnCellWithColumnNumberAndRowNumber(String columnNumber, String rowNumber){

    }






}
