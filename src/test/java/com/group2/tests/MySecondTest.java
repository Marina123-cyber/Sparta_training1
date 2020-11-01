package com.group2.tests;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class MySecondTest {
    @Test
    public void userCanLoginByUsername() {
        open("https://e-dostavka.by/");

        $x("//body/div[@id='body']/div[1]/div[3]/div[2]/div[1]/nav[1]/ul[1]/li[9]/a[1]/i[1]").click();
        $x("//input[@id='searchtext']").setValue("Кофе молотый «Dallmayr» classic, 250 г.");
        $x("//body/div[@id='body']/div[1]/div[3]/div[2]/div[1]/nav[1]/ul[1]/li[9]/a[1]/i[1]").click();
        String price = $x("//body/div[@id='body']/div[1]/div[3]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]/div[1]").getText();
        String text = $x("//a[contains(text(),'Кофе молотый «Dallmayr» classic, 250 г.')]").getText();

        System.out.println(text + "- цена товара : "+ price);





        System.out.println(--------------------);


    }
}
