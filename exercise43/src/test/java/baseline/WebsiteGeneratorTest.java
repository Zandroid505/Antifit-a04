/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 first_name last_name
 */

package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WebsiteGeneratorTest {

    @Test
    void checkIfWebsiteFolderIsCreatedWithoutError() {
        WebsiteGenerator webDev1 = new WebsiteGenerator();
        String expected = "Created data/Gaggle";

        webDev1.setWebsiteName("Gaggle");
        webDev1.setAuthorName("Jeff Robinson");

        String actual = webDev1.createWebsiteFolder();

        assertEquals(expected, actual);
    }

    @Test
    void checkIfHtmlFileIsCreatedWithoutError() {
        WebsiteGenerator webDev2 = new WebsiteGenerator();
        String expected = "Created data/Fakebook/index.html";

        webDev2.setWebsiteName("Fakebook");
        webDev2.setAuthorName("Jeff Robinson");

        webDev2.createWebsiteFolder();
        String actual = webDev2.createHtml();

        assertEquals(expected, actual);
    }

    @Test
    void checkIfJavaScriptFolderIsCreatedWithoutError() {
        WebsiteGenerator webDev3 = new WebsiteGenerator();
        String expected = "Created data/Instatrash/js/";

        webDev3.setWebsiteName("Instatrash");
        webDev3.setAuthorName("Jeff Robinson");

        webDev3.createWebsiteFolder();
        String actual = webDev3.createJavaScriptFolder();

        assertEquals(expected, actual);
    }

    @Test
    void checkIfCssFolderIsCreatedWithoutError() {
        WebsiteGenerator webDev4 = new WebsiteGenerator();
        String expected = "Created data/Snapcat/css/";

        webDev4.setWebsiteName("Snapcat");
        webDev4.setAuthorName("Jeff Robinson");

        webDev4.createWebsiteFolder();
        String actual = webDev4.createCssFolder();

        assertEquals(expected, actual);
    }
}