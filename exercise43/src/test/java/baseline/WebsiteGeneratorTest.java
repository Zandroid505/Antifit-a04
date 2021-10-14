package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WebsiteGeneratorTest {
    WebsiteGenerator webDev1 = new WebsiteGenerator();

    @Test
    void checkIfWebsiteFolderIsCreatedWithoutError() {
        String expected = "Created data/Gaggle";

        webDev1.setWebsiteName("Gaggle");
        webDev1.setAuthorName("Jeff Robinson");

        String actual = webDev1.createWebsiteFolder();

        assertEquals(expected, actual);
    }

    @Test
    void checkIfHtmlFileIsCreatedWithoutError() {
        String expected = "Created data/Gaggle/index.html";

        webDev1.setWebsiteName("Gaggle");
        webDev1.setAuthorName("Jeff Robinson");

        String actual = webDev1.createHtml();

        assertEquals(expected, actual);
    }

    @Test
    void checkIfJavaScriptFolderIsCreatedWithoutError() {
        String expected = "Created data/Gaggle/js/";

        webDev1.setWebsiteName("Gaggle");
        webDev1.setAuthorName("Jeff Robinson");

        String actual = webDev1.createJavaScriptFolder();

        assertEquals(expected, actual);
    }

    @Test
    void checkIfCssFolderIsCreatedWithoutError() {
        String expected = "Created data/Gaggle/css/";

        webDev1.setWebsiteName("Gaggle");
        webDev1.setAuthorName("Jeff Robinson");

        String actual = webDev1.createCssFolder();

        assertEquals(expected, actual);
    }
}