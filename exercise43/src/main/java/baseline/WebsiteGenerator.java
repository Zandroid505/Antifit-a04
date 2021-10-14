/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 first_name last_name
 */

package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.Scanner;

public class WebsiteGenerator {
    private static final Scanner input = new Scanner(System.in);
    private String websiteName;
    private String authorName;
    private final String mainFolderPath;
    private String websiteFolderPath;
    private boolean includeJavaScriptFolder;
    private boolean includeCssFolder;
    private final String creationPhrase;

    public WebsiteGenerator() {
        //Initialize Strings to ""
        this.websiteName = "";
        this.authorName = "";
        this.mainFolderPath = "data/";
        this.websiteFolderPath = "";
        this.creationPhrase = "Created ";

        //Initialize booleans to true
        this.includeJavaScriptFolder = true;
        this.includeCssFolder = true;
    }

    public void askForWebsiteInfo() {
        String temp;

        //print "Site name: "
        System.out.print("Site name: ");

        //scan into websiteName
        this.websiteName = input.nextLine();

        //print "Author: "
        System.out.print("Author: ");

        //scan into authorName
        this.authorName = input.nextLine();

        //print "Do you want a folder for JavaScript? "
        System.out.print("Do you want a folder for JavaScript? ");

        //javaScriptFolder = True if input is 'y' or false if input is 'n'
        temp = input.nextLine();
        this.includeJavaScriptFolder = temp.equalsIgnoreCase("y");

        //print "Do you want a folder for CSS? "
        System.out.print("Do you want a folder for CSS? ");

        //CSSFolder = True if input is 'y' or false if input is 'n'
        temp = input.nextLine();
        this.includeCssFolder = temp.equalsIgnoreCase("y");
    }

    public String createWebsiteFolder() {
        //use websiteName to create folder in data folder
        this.websiteFolderPath = this.mainFolderPath + this.websiteName;

        //websiteFolder = new path of website folder
        File websiteFolder = new File(this.websiteFolderPath);

        //return website path if successful
        if(websiteFolder.mkdir())
            return this.creationPhrase + this.websiteFolderPath;
        else
            return "Error creating website folder";
        //return error message if not successful

    }

    public String createHtml() {
        String htmlPath = this.websiteFolderPath + "/index.html";
        boolean htmlCreated = false;

        //create html file in website folder
        try(Formatter htmlOut = new Formatter(htmlPath)) {
            htmlOut.format("<html>%n<head>%n\t<title>%s</title>%n\t<meta name=\"author\" content=\"%s\">%n</head>%n</html>%n", this.websiteName, this.authorName);
            htmlCreated = true;
        }
        catch(SecurityException | FileNotFoundException | FormatterClosedException e) {
            //printStackTrace
            e.printStackTrace();
        }

        //return html path if successful
        if(htmlCreated)
            return this.creationPhrase + this.websiteFolderPath + "/index.html";
        else
            return "Error creating html file";
        //return error message if not successful
    }

    public String createJavaScriptFolder() {
        if(this.includeJavaScriptFolder) {
            String javaScriptFolderPath = this.websiteFolderPath + "/js/";

            //create javaScript folder in website folder
            File javaScriptFolder = new File(javaScriptFolderPath);

            //return folder path if successful
            if(javaScriptFolder.mkdir())
                return this.creationPhrase + javaScriptFolderPath;
            else
                return "Error creating JavaScript folder";
            //return error message if not successful
        }
        else
            return "";
    }

    public String createCssFolder() {
        if(this.includeCssFolder) {
            String cssFolderPath = this.websiteFolderPath + "/css/";

            //create CSS folder in website folder
            File cssFolder = new File(cssFolderPath);

            //return folder path if successful
            if(cssFolder.mkdir())
                return this.creationPhrase + cssFolderPath;
            else
                return "Error creating JavaScript folder";
            //return error message if not successful
        }
        else
            return "";
    }
}
