package com.rvm.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {
	public static void selectByText(WebElement ele, String text) {
        System.out.println("User selected: " + text);
        Select sel = new Select(ele);
        sel.selectByVisibleText(text);
    }

}
