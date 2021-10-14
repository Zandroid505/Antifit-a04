/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 first_name last_name
 */

package baseline;

public class Solution43 {
    public static void main(String[] args) {
        //Create WebsiteGenerator object
        WebsiteGenerator webDev = new WebsiteGenerator();

        //Call askForWebsiteInfo()
        webDev.askForWebsiteInfo();

        //call createWebsiteFolder()
        System.out.println(webDev.createWebsiteFolder());
            //if successful, print folder path
            //if not, print error message

        //call createHtml()
        System.out.println(webDev.createHtml());
            //if successful, print file path
            //if not, print error message

        //call createJavaScriptFolder()
        System.out.println(webDev.createJavaScriptFolder());
            //if successful, print folder path
            //if not, print error message

        //call createCSSFolder()
        System.out.println(webDev.createCssFolder());
            //if successful, print folder path
            //if not, print error message

    }
}
