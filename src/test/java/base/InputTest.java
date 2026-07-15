package base;

import org.testng.annotations.Test;

import pages.InputPage;
import utils.ExcelUtils;

public class InputTest extends BaseTest {

    @Test
    public void inputTest() throws Exception {

        driver.get("https://letcode.in/edit");

        InputPage input = new InputPage(driver);

        int totalRows = 3;   // Number of data rows in Excel

        for (int i = 1; i <= totalRows; i++) {

            try {

                String fullName = ExcelUtils.getCellData("InputTest", i, 0);
                String appendText = ExcelUtils.getCellData("InputTest", i, 1);

                input.enterFullName(fullName);
                input.appendText(appendText);

                System.out.println(input.getInsideText());

                input.clearTextbox();

                // Write PASS in Excel (Column C)
                ExcelUtils.setCellData("InputTest", i, 2, "PASS");

            } catch (Exception e) {

                // Write FAIL in Excel (Column C)
                ExcelUtils.setCellData("InputTest", i, 2, "FAIL");

                throw e;
            }
        }
    }
}