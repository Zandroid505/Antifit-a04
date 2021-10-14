/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 first_name last_name
 */

package baseline;

import java.io.File;
import java.util.Scanner;

public class WebsiteGenerator {
    private static final Scanner input = new Scanner(System.in);
    private String websiteName;
    private String authorName;
    private boolean javaScriptFolder;
    private boolean CSSFolder;
    private File mainFolder = new File("data");
    private File websiteFolder;

    public WebsiteGenerator() {
        //Initialize Strings to ""
        //Initialize booleans to true
    }

    public void askForWebsiteInfo() {
        //print "Site name: "
        //scan into websiteName

        //print "Author: "
        //scan into authorName

        //print "Do you want a folder for JavaScript? "
        //javaScriptFolder = True if input is 'y' or false if input is 'n'

        //print "Do you want a folder for CSS? "
        //CSSFolder = True if input is 'y' or false if input is 'n'
    }

    public String createWebsiteFolder() {
        //use websiteName to create folder in data folder
        //websiteFolder = new path of website folder

        //return website path if successful
        //return error message if not successful
    }

    public String createHtml() {
        //create html file in website folder

        //return html path if successful
        //return error message if not successful
    }

    public String createJavaScriptFolder() {
        //create javaScript folder in website folder

        //return folder path if successful
        //return error message if not successful
    }

    public String createCSSFolder() {
        //create CSS folder in website folder

        //return folder path if successful
        //return error message if not successful
    }
}
